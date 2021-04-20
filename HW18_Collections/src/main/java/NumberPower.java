package HomeWork_18;
// итеративный способ вычисления степени
public class NumberPower {
    public static void main(String[] args) {
        System.out.println(pow(3, 3));
    }

    public static int pow(int number, int value){
        int result = 1;
        for (int i = 0; i < value; i++) {
            result = result * number;

        }
        return result;
    }
}
