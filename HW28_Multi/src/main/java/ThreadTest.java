
class ThreadTest {
    public static void main(String[] args) {
        Store store = new Store();
        Producer producer = new Producer(store);
        Customer customer = new Customer(store);
        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(customer);
        thread1.start();
        thread2.start();


    }
}

class Store{
    private int product = 0;
    public synchronized void get() throws InterruptedException {
        while (product<1){
            wait();
        }

        product--;
        System.out.println("Customer bought product");
        System.out.println("Items left " + product);
        notify();
    }

    public synchronized void put() throws InterruptedException {
        while (product>=3){                                       //магазин вмещает не более трёх товаров
            wait();
        }

        product++;
        System.out.println("Producer add one item");
        System.out.println("Items left " + product);
        notify();
    }
}

class Producer implements Runnable{
    Store store;

    public Producer(Store store) {
        this.store = store;
    }


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                store.put();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Customer implements Runnable{
    Store store;

    public Customer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                store.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

