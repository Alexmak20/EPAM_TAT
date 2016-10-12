package by.bsu.tat.main;

import java.util.ArrayList;

/**
 * Class to execute commands.
 * @author Alexey Makovski
 */
public abstract class CommandOperatoin {


    /**
     * Method check overridden by inheritors.
     * @param l line of command.
     * @param list this is list command.
     */
    public abstract void check(String l, ArrayList<Product> list);
}
