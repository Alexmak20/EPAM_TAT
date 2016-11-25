package by.bsu.tat.main.Reader;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class read command from xml file.
 * @author Alexey Makovski.
 */
public class ReaderCommandXmlFile extends ReaderCommand {
    File file;

    public ReaderCommandXmlFile(File file) {
        this.file = file;
    }

    /**
     * Method to read command from xml file.
     */
    @Override
    public ArrayList<String> readCommands()
            throws IOException, SAXException, ParserConfigurationException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(file);
        NodeList nodes = document.getElementsByTagName("commands");
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < nodes.getLength(); i++) {
            NamedNodeMap attrs = nodes.item(i).getAttributes();
            if (attrs.getNamedItem("command").getNodeValue().equals("open")) {
                list.add(attrs.getNamedItem("id").getNodeValue() + " " +
                        attrs.getNamedItem("command").getNodeValue() + " " +
                        attrs.getNamedItem("address").getNodeValue() + " " +
                        attrs.getNamedItem("time").getNodeValue());
            } else {
                list.add(attrs.getNamedItem("id").getNodeValue() + " " +
                        attrs.getNamedItem("command").getNodeValue() + " " +
                        attrs.getNamedItem("attribute").getNodeValue());
            }
        }
        return list;
    }
}
