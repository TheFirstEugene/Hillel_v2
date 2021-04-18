public class ArabicRome
{
    public String converter(int number)
    {
        String roman = "";

        String[] romanNumeral = {"M", "CM", "D", "LD", "C", "XC",
                "L", "XL", "X", "IX", "V", "IV", "I"};

        int[] romanNumbers = {1000, 900, 500, 400, 100, 90,
                50, 40, 10, 9, 5, 4, 1};

        for (int i = 0; i < romanNumbers.length; i++)
        {
        while (number>=romanNumbers[i])
        {
            roman = roman + romanNumeral[i];
            number = number - romanNumbers[i];
        }
        }
        return roman;
    }
}
