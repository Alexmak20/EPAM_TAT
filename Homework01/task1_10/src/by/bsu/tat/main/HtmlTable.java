package by.bsu.tat.main;


/**
 * Class that creates html markup table.
 *
 * @author Alexey Makovski
 */
public class HtmlTable {
    private final String TABLE_HEAD_COLOR = "#999999";
    private final String TABLE_BODY_COLOR_1 = "#efefef";
    private final String TABLE_BODY_COLOR_2 = "#d9d9d9";
    private final String TABLE_BODY_SPECIAL_COLOR = "#ff0000";
    private final String TABLE_BORDER_COLOR = "#ffffff";
    private final String TABLE_TEXT_COLOR = "#000000";

    private final String START =
            "<html>\n" +
                    "<head> \n" +
                    "<table border = '0' align = center  width=20%>\n" +
                    "<meta charset=\"utf-8\"/> \n" +
                    "</head>\n" +
                    "<body> \n" +
                    "<tr bgcolor=" + "#BEBEBE" + ">\n " +
                    "<th align = center valign=\"top\" width=10%> Server </th>\n " +
                    "<th align = center valign=\"top\" width=10%> Response, ms </th>\n" +
                    "</tr>\n" +
                    "<body align = center text\"" + TABLE_TEXT_COLOR + "\">\n" +
                    "<table align = center width=20.1% bordercolor=\"" + TABLE_BORDER_COLOR + "\">\n" +
                    "<tr align = center bgcolor=\"" + TABLE_HEAD_COLOR + "\">\n" +
                    "</tr>\n";
    private final String END = "</html>" +
            "</table>\n" +
            "</body>\n" +
            "</html>";

    private String html = START;
    private boolean cs = true;


    /**
     * Adds the ip address in the table and table.
     *
     * @param ip      ip address to add.
     * @param ping    ping to add.
     * @param special do tint line in a specific color.
     */
    public void addLine(String ip, int ping, boolean special) {
        if (special) {
            html += "      <tr bgcolor=\"" + TABLE_BODY_SPECIAL_COLOR + "\">\n";
        } else if (cs) {
            html += "      <tr bgcolor=\"" + TABLE_BODY_COLOR_1 + "\">\n";
        } else {
            html += "      <tr bgcolor=\"" + TABLE_BODY_COLOR_2 + "\">\n";
        }
        html += "        <td width=17%> " + ip + "</td>\n"
                + "        <td width=26%>" + ping + "</td>\n"
                + "      </tr>\n";
        cs = !cs;
    }

    /**
     * @return html layout table.
     */
    public String getHtml() {
        return html + END;
    }
}
