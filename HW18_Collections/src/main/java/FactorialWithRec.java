package HomeWork_18;
//факториал через рекурсию

public class FactorialWithRec {
    public static void main(String[] args) {
        System.out.println(factRec(33));
    }

    public static int factRec(int n){
        int result;
        if(n == 1) return  1;
        result = factRec(n-1)*n;
        return result;
    }
}

//после вызова числа 16 дальше идут отрицательные значения, а после 33 - нули