package by.bsu.tat.main.Reader;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Abstract class of reading command line, txt file, xml file.
 * @author Alexey Makovski.
 */
public abstract class ReaderCommand {

    /**
     * Method read command from file.
     * @throws IOException
     * @throws SAXException
     * @throws ParserConfigurationException
     */
    public abstract ArrayList<String> readCommands()
            throws IOException, SAXException, ParserConfigurationException;

}
