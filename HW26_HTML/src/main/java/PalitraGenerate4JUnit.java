import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PalitraGenerate4JUnit
{
    public static void main(String[] args)
    {
        new PalitraGenerate4JUnit().generate();
    }

    private void generate()
    {
        createTable();
    }
    private void createTable()
    {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("demo.html")))
        {
            bw.write("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +  "<head>\n" +  "    <meta charset=\"UTF-8\">\n" +
                    "</head>\n" +  "<body>\n" + "<table style=' width: 1280px; height:" +
                    " 640px; border-spacing: 0;" +
                    " text-align: center;'>\n");
            bw.write("\n");
            colorCycle(bw);
            bw.write(" </table>\n" +
                    "</body>\n" +
                    "</html>");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private void colorCycle(BufferedWriter bw) throws IOException
    {
        for(int i=255; i>=0; i-=5)
        {
            /*printColor(bw, i);*/
        }
    }

     String printColor(/*BufferedWriter bw,*/ int i) /*throws IOException*/
    {
        /*bw.write("<tr>");*/
        /*theFirstColumn(bw, i);
        theSecondColumn(bw, i);
        theLastColumn(bw, i);*/

       /* bw.write("\n");
        bw.write("</tr>");
        bw.write("\n");*/

        String s = "<tr>\n" +
                "   <td style='background-color: rgb("+i+",0, 0)'></td>\n" +
                "   <td style='background-color: rgb(0,"+i+", 0)'></td>\n" +
                "   <td style='background-color: rgb(0,0,"+i+")'></td>\n" +
                "</tr>";
        return s;


    }

     String theLastColumn(/*BufferedWriter bw,*/ int i) /*throws IOException*/
    {
        String s1 = String.format("   <td style='background-color: rgb(0,0," + i +")'></td>");
       /* bw.write("\n");
        bw.write("   <td style='background-color: rgb(0,0," + i + ")'></td>");*/
        return s1;
    }

    String theSecondColumn(/*BufferedWriter bw,*/ int i) /*throws IOException*/
    {
        String s1 = String.format("   <td style='background-color: rgb(0," + i + ",0)'></td>");
        /*bw.write("\n");
        bw.write("   <td style='background-color: rgb(0," + i + ", 0)'></td>");*/
        return s1;
    }

    String theFirstColumn(/*BufferedWriter bw,*/ int i)/* throws IOException*/
    {
        String s2 = String.format("   <td style='background-color: rgb(" + i + ",0,0)'></td>");
        /*bw.write("\n");
        bw.write("   <td style='background-color: rgb(" + i + ",0, 0)'></td>");*/
        return s2;
    }
}
