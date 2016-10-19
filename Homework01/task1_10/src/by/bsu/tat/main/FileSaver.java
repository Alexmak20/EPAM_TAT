package by.bsu.tat.main;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Class which stores the received data to a file.
 *
 * @author Alexey Makovski
 */
public class FileSaver {
    /**
     * Stores the received data to a file.
     *
     * @param datafile data that must be preserved.
     */
    public void saveToFile(String datafile) throws java.io.FileNotFoundException, java.io.UnsupportedEncodingException {
        try {
            FileWriter writer = new FileWriter("test.html");
            writer.write(datafile);
            writer.flush();
            writer.close();
        } catch (IOException ioe) {
            System.out.println("Error writing file");
        }
    }


}
