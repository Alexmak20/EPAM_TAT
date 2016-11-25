package by.bsu.tat.main;


import by.bsu.tat.main.Reader.*;

import java.io.File;
import java.util.ArrayList;


/**
 * Main class is the entry point into the program.
 * @author Alexey Makovski.
 */

public class Main {
    /**
     * Method entry point into the program.
     * @param args
     */
    public static void main(String[] args) {
        ReaderCommand reader = chooseReader(args);
        try {
            ArrayList<String> commands = reader.readCommands();
            Executor ex = new Executor();
            ex.executeCommands(commands);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Method looks a file to be launched.
     * @param args takes an arguments.
     * @return args frim command line.
     */
    private static ReaderCommand chooseReader(String[] args) {
        File file = new File(args[0]);
        if (file.exists()) {
            if (args[0].endsWith(".xml")) {
                return new ReaderCommandXmlFile(file);
            }
            if (args[0].endsWith(".txt")) {
                return new ReaderCommandTxtFile(file);
            }
            if (args[0].endsWith(".json")) {
                return new ReaderCommandJson(file);
            }
        }
        return new ReaderCommandLine(args);
    }
}

