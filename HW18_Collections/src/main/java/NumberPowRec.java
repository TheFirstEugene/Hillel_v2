package HomeWork_18;
//вычисление степени через рекурсию

public class NumberPowRec {
    public static void main(String[] args) {
        System.out.println(pow(15, 15));

    }
    public static int pow(int number, int value) {
        if (value == 1) {
            return number;
        } else {
            return number * pow(number, value - 1);
        }
    }
}
