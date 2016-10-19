package by.bsu.tat.main;

import java.io.*;
import java.util.ArrayList;

/**
 * Class creates a html table and fill it with directories
 */
public class HTMLTable {

    /**
     * Method cap creates a table, there is an alignment in the cell,
     * html file create and write data to it.
     */
    public void createTable(ArrayList<String> rows) {
        String html = "<!DOCTYPE>" +
                "<html>\n" +
                "<head> \n" +
                "<table border = '0' align = center  width=25%>\n" +
                "<meta charset=\"utf-8\"/> \n" +
                "</head>\n" +
                "<body> \n" +
                "<tr bgcolor=" + "#BEBEBE" + ">\n " +
                "<th align = center valign=\"top\" width=10%> ИМЯ </th>\n " +
                "<th align = center valign=\"top\" width=10%> ТИП </th>\n" +
                "<th align = center valign=\"top\" width=8%> ДАТА СОЗДАНИЯ </th>\n " +
                "<th align = center valign=\"top\" width=10%> РАЗМЕР (в Kb) </th> \n" +
                "</tr>\n";
        for (String row : rows) {
            html += row;
        }
        html +=
                "</tr> \n" +
                        "</table>\n " +
                        "</body> \n" +
                        "</html>\n";

        File file = new File("test.html");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(html);
            bw.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }
}