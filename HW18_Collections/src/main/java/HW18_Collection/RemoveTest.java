package HomeWork_18.HW18_Collection;

import java.util.*;

public class RemoveTest {
    public static void main(String[] args) {
        Collection<Integer> arrayList = new ArrayList<>();
        Collection<Integer> linkedList = new LinkedList<>();


        System.out.print("Я Array и на удаление с середины ");         // потребовалось 0-15 милисекунд
        removeArrayMidle((ArrayList) arrayList);
        System.out.print("Я Linked и на удаление с середины ");      // потребовалось 0 милисекунды
        removeForLinked((LinkedList) linkedList);
        System.out.print("Я Array и на удаление с конца ");         // потребовалось 0-15  милисекунды
        removeArrayLast((ArrayList) arrayList);
        System.out.print("Я Linked и на удаление с конца ");        // потребовалось 0-16 милисекунды
        removeForLinkedLast((LinkedList) linkedList);
    }

    public static void removeArrayMidle(Collection arrayList){
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            Integer a = random.nextInt();
            arrayList.add(a);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(arrayList.size()/2);      // тут деление на 2 всегда нам даёт вытягивание со средины
        }
        long end = System.currentTimeMillis();
        System.out.println("мне потребовалось " + (end - start) + " милисекунд");
    }


    public static void removeForLinked(Collection list){
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            Integer a = random.nextInt();
            list.add(a);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.remove(list.size()/2);
        }
        long end = System.currentTimeMillis();
        System.out.println("мне потребовалось " + (end - start) + " милисекунд");
    }


    public static void removeArrayLast(Collection arrayList){
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            Integer a = random.nextInt();
            arrayList.add(a);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(arrayList.size()-1);      // такой вариант нам даст возможность вытягивать элементы с конца
        }
        long end = System.currentTimeMillis();
        System.out.println("мне потребовалось " + (end - start) + " милисекунд");
    }

    public static void removeForLinkedLast(Collection list){
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            Integer a = random.nextInt();
            list.add(a);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.remove(list.size()-1);
        }
        long end = System.currentTimeMillis();
        System.out.println("мне потребовалось " + (end - start) + " милисекунд");
    }

}