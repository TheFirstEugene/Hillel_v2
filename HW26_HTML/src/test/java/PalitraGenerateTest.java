import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalitraGenerateTest {

    @Test  // Last
    void test1()
    {
        PalitraGenerate4JUnit pg = new PalitraGenerate4JUnit();
        final String str  = pg.theLastColumn(128);
        Assertions.assertEquals("   <td style='background-color: rgb(0,0,128)'></td>",str);
    }

    @Test // The first
    void test2()
    {
        PalitraGenerate4JUnit pg = new PalitraGenerate4JUnit();
        final String str  = pg.theFirstColumn(99);
        Assertions.assertEquals("   <td style='background-color: rgb(99,0,0)'></td>",str);
    }

    @Test // Second
    void test3()
    {
        PalitraGenerate4JUnit pg = new PalitraGenerate4JUnit();
        final String str  = pg.theSecondColumn(249);
        Assertions.assertEquals("   <td style='background-color: rgb(0,249,0)'></td>",str);
    }

    @Test
    void test4()
    {
        PalitraGenerate4JUnit pg = new PalitraGenerate4JUnit();
        final String str = pg.printColor(165);
        String s = "<tr>\n" +
                "   <td style='background-color: rgb(165,0, 0)'></td>\n" +
                "   <td style='background-color: rgb(0,165, 0)'></td>\n" +
                "   <td style='background-color: rgb(0,0,165)'></td>\n" +
                "</tr>";
        Assertions.assertEquals(s,str);
    }



}