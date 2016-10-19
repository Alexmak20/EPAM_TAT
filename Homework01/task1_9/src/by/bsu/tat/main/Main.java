package by.bsu.tat.main;

import java.io.File;
import java.util.ArrayList;

/**
 * Class which is called html table.
 */
public class Main {

    /**
     * Method which is called from another class html table.
     */
    public static void main(String[] args) {

        File f = new File(System.getProperty("user.dir"));
        File[] files = f.listFiles();
        HTMLTable htmlTable = new HTMLTable();
        CheckingFiles check = new CheckingFiles();
        ArrayList<String> rowsForTable = check.getRowsFromFiles(files);
        htmlTable.createTable(rowsForTable);
    }

}
