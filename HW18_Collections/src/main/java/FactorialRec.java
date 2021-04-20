package HomeWork_18;
// факториал числа итератором

public class FactorialRec {
    public static void main(String[] args) {
        long x = 20;                              // на значении 17 уже пошли минусовые значения, а на значении 33 - нули
        System.out.println(fact(x));

    }
    public static int fact(long x){
        int result = 1;
        for (int i = 1; i <= x; i++) {                       // тут мы делаем переменную равную один, так как
            result = result * i;                            // факториал меньшего числа мы не можем получить

        }
        return result;
    }
}
