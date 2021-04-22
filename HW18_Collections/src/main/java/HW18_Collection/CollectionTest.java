package HomeWork_18.HW18_Collection;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<Integer> arrayList = new ArrayList<>();
        Collection<Integer> linkedList = new LinkedList<>();
        Collection<Integer> hashSet = new HashSet<>();
        Collection<Integer> treeSet = new TreeSet<>();

        System.out.print("Я Array и на добавление ");
        addNumber(arrayList);
        System.out.print("Я LinkedList и на добавление ");
        addNumber(linkedList);
        System.out.print("Я HashSet и на добавление ");
        addNumber(hashSet);
        System.out.print("Я TreeSet и на добавление ");
        addNumber(treeSet);
        System.out.println();


        /* Полученый вывод:

        Я Array и мне потребовалось 304 милисекунд
        Я LinkedList и мне потребовалось 384 милисекунд
        Я HashSet и мне потребовалось 874 милисекунд
        Я TreeSet и мне потребовалось 1415 милисекунд

        Как видно, для TreeSet потребовалось меньше всего секунд
         */

        System.out.print("Я Array и на удаление  c начала ");
        removeNumberForArray((List) arrayList);                    // заняло 0 милисекунд
        System.out.print("Я Linked и на удаление c начала ");
        removeNumberForLink((LinkedList) linkedList);              // заняло 0 милисекунд
        System.out.print("Я HashSet и на удаление c начала ");
        removeNumberForHash((Set) hashSet);                        // заняло 0 милисекунд
        System.out.print("Я TreeSet и на удаление c начала ");
        removeNumberForTree((TreeSet) treeSet);                  // заняло 0 милисекунд


    }

    public static void addNumber(Collection collection) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            Random random = new Random();
            Integer a = random.nextInt();
            collection.add(a);
        }
        long end = System.currentTimeMillis();
        System.out.println("мне потребовалось " + (end - start) + " милисекунд");

    }

    public static void removeNumberForArray(Collection list) {
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            Integer a = random.nextInt();
            list.add(a);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.remove(0);
        }
        long end = System.currentTimeMillis();
        System.out.println("мне потребовалось " + (end - start) + " милисекунд");

    }

    public static void removeNumberForLink(LinkedList list) {
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            Integer a = random.nextInt();
            list.add(a);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.removeFirst();
        }
        long end = System.currentTimeMillis();
        System.out.println("мне потребовалось " + (end - start) + " милисекунд");

    }

    public static void removeNumberForHash(Collection set) {
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            Integer a = random.nextInt();
            set.add(a);
        }
        long start = System.currentTimeMillis();
        set.clear();
        long end = System.currentTimeMillis();
        System.out.println("мне потребовалось " + (end - start) + " милисекунд");

    }

    public static void removeNumberForTree(Collection list) {
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            Integer a = random.nextInt();
            list.add(a);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.clear();
        }
        long end = System.currentTimeMillis();
        System.out.println("мне потребовалось " + (end - start) + " милисекунд");


    }
}
