import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ArabicRomeTest
{

    @Test
    void convert()
    {
        String actual = new ArabicRome().converter(9);
        Assertions.assertEquals("IX", actual);
    }

    @Test
    void convert2()
    {
        String actual = new ArabicRome().converter(259);
        Assertions.assertEquals("CCLIX", actual);
    }

    @Test
    void convert3()
    {
        String actual = new ArabicRome().converter(300);
        Assertions.assertEquals("CCC", actual);
    }

    @Test
    void convert4()
    {
        String actual = new ArabicRome().converter(3999);
        Assertions.assertEquals("MMMCMXCIX", actual);
    }
}