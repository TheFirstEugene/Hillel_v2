package HomeWork_18;
// числа Фиббоначи через рекурсию

public class FibWithRec {
    public static void main(String[] args) {
        long start = System.currentTimeMillis(); // начало измерения

        System.out.println(fibonachi(49));

        long end = System.currentTimeMillis(); // конец измерения
        System.out.println(end-start);

        //при выставлении 45 начинаются задержки и количество милисекунд уже 5400;
        //дожал до 49, задержка в милисекундах составила 36098;

    }
    static int fibonachi(int n){

        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        else{
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }
}
