package by.bsu.tat.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

/**
 * Class checks directories for files,
 * specifies the date and file size
 */
public class CheckingFiles {

    /**
     * Method loads the specified directory, creates a list of files and folders,
     * enters into a sheet, then looking at the folder
     * or file that determines its time of creation,
     * and writes the file size.
     *
     * @param files catalod files.
     * @return rows with file.
     */
    public ArrayList<String> getRowsFromFiles(File[] files) {
        ArrayList<String> rows = new ArrayList<>();

        for (File file : files) {
            String row = "<tr ";
            if (rows.size() % 2 == 0) {
                row += "bgcolor = \"#E6E6E6\"";
            }
            row += ">\n<td>" + file.getName() + "</td>\n<td>";
            if (file.isDirectory()) {
                row += "DIR";
            }
            if (file.isFile()) {
                row += "FILE";
            }
            Path path = file.toPath();
            FileManager catalog = new FileManager();
            try {
                BasicFileAttributes atr = Files.readAttributes(path, BasicFileAttributes.class);
                row += "</td>\n<td>" + (atr.creationTime().toString().split("T"))[0] +
                        "</td>\n<td>" + ((double) catalog.getFileSize(file) / 1024) +
                        "</td>\n</tr>\n";
            } catch (IOException e) {

            }
            rows.add(row);
        }
        return rows;
    }
}
