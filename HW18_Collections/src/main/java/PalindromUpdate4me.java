package HomeWork_18;
import java.util.Locale;

//палиндром ли?
public class PalindromUpdate4me {
    public static void main(String[] args) {
        String s = "POTOP";
        System.out.println(isPalindrom(s));

    }

    public static boolean isPalindrom(String s){
        String s2 = s.toUpperCase(Locale.ROOT);
        for (int i = 0; i < s2.length()/2; i++) {
            if(s2.charAt(i)!=s2.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
