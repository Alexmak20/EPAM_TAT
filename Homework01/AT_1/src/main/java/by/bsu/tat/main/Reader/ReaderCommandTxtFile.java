package by.bsu.tat.main.Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class read command txt file.
 * @author Alexey Makovski.
 */
public class ReaderCommandTxtFile extends ReaderCommand {
    ArrayList<String> list = new ArrayList<String>();
    File file;

    public ReaderCommandTxtFile(File file) {
        this.file = file;
    }


    /**
     * Method read command txt file.
     */
    @Override
    public ArrayList<String> readCommands() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        line = in.readLine();
        while (line != null) {
            list.add(line);
            line = in.readLine();
        }
        in.close();
        return list;
    }
}
