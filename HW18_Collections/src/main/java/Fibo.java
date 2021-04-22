package HomeWork_18;
//классический пример с поиском чисел Фиббоначи

public class Fibo {
    public static void main(String[] args) {

     findFin(50);
    }

    public static void findFin(int number){
        int x = 1;
        int y = 1;
        int z;
        System.out.print(x + " " + y + " ");
        for (int i = 3; i<=number; i++){
            z = x+y;
            System.out.print(z + " ");
            x = y;
            y = z;
        }
    }
}
