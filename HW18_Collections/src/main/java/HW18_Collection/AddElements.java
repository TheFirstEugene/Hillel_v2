package HomeWork_18.HW18_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;

public class AddElements {
    public static void main(String[] args) {
        Collection<Integer> arrayList = new ArrayList<>();
        Collection<Integer> linkedList = new LinkedList<>();

        System.out.println("Array - ");
        addFirst((ArrayList) arrayList);
        addLast((ArrayList) arrayList);
        addMidle((ArrayList) arrayList);

        System.out.println("Linked - ");
        addFirstLink((LinkedList) linkedList);
        addLastLink((LinkedList) linkedList);
        addMidleLink((LinkedList) linkedList);



    }

    public static void addFirst(ArrayList list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000; i++) {
            Random random = new Random();
            Integer a = random.nextInt();
            list.add(0, a);
        }
        long end = System.currentTimeMillis();
        System.out.println(" потребовалось " + (end - start) + " милисекунд для добавления в начало");
    }


    public static void addLast(ArrayList list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000; i++) {
            Random random = new Random();
            Integer a = random.nextInt();
            list.add(list.size() - 1, a);
        }
        long end = System.currentTimeMillis();
        System.out.println(" потребовалось " + (end - start) + " милисекунд для добавления в конец");
    }

    public static void addMidle(ArrayList list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000; i++) {
            Random random = new Random();
            Integer a = random.nextInt();
            list.add(list.size() - 1 / 2, a);
        }
        long end = System.currentTimeMillis();
        System.out.println(" потребовалось " + (end - start) + " милисекунд для добавления в cередину");
    }

    public static void addFirstLink(LinkedList list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000; i++) {
            Random random = new Random();
            Integer a = random.nextInt();
            list.addFirst(a);
        }
        long end = System.currentTimeMillis();
        System.out.println(" потребовалось " + (end - start) + " милисекунд для добавления в начало");
    }


    public static void addLastLink(LinkedList list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000; i++) {
            Random random = new Random();
            Integer a = random.nextInt();
            list.addLast(a);
        }
        long end = System.currentTimeMillis();
        System.out.println(" потребовалось " + (end - start) + " милисекунд для добавления в конец");
    }

    public static void addMidleLink(LinkedList list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000; i++) {
            Random random = new Random();
            Integer a = random.nextInt();
            list.add(list.size() - 1 / 2, a);
        }
        long end = System.currentTimeMillis();
        System.out.println(" потребовалось " + (end - start) + " милисекунд для добавления в cередину");
    }
}
