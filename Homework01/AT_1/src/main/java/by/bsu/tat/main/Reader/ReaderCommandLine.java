package by.bsu.tat.main.Reader;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Class read commands with command line.
 * @author Alexey Makovski.
 */
public class ReaderCommandLine extends ReaderCommand {

    String[] args;

    public ReaderCommandLine(String[] args){
        this.args = args;
    }
    /**
     * Method read commands with command line.
     */
    @Override
    public ArrayList<String> readCommands() {
        ArrayList<String> list = new ArrayList<String>();
        for (String command : args ) {
            list.add(command);
        }
        return list;
    }


}
