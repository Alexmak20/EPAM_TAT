package by.bsu.tat.main;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @author Alexey Makovski.
 */
public class CheckTest {
    private static final String NEGATIVE = "negative";
    private static final String POSITIVE = "positive";
    private static final String TYPE_TRIANGLE = "type";
    private Check check;

    @BeforeTest
    public void setUp() throws Exception {
        check = new Check();
    }

    @DataProvider(name = "negative")
    public Object[][] readXML() throws Exception {
        File file = new File("./test.number.xml");
        DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = fact.newDocumentBuilder();

        Document doc = builder.parse(file);
        NodeList nodes = doc.getElementsByTagName(NEGATIVE);
        Object[][] result = new Double[nodes.getLength()][];
        for (int i = 0; i < nodes.getLength(); i++) {
            double a;
            double b;
            double c;
            NamedNodeMap attrs = nodes.item(i).getAttributes();
            if (attrs.getNamedItem("a").getNodeValue().equals("MAX_VALUE")) {
                a = Double.MAX_VALUE;
            } else if (attrs.getNamedItem("a").getNodeValue().equals("MIN_VALUE")) {
                a = Double.MIN_VALUE;
            } else {
                a = Double.parseDouble(attrs.getNamedItem("a").getNodeValue());
            }
            if (attrs.getNamedItem("b").getNodeValue().equals("MAX_VALUE")) {
                b = Double.MAX_VALUE;
            } else if (attrs.getNamedItem("b").getNodeValue().equals("MIN_VALUE")) {
                b = Double.MIN_VALUE;
            } else {
                b = Double.parseDouble(attrs.getNamedItem("b").getNodeValue());
            }
            if (attrs.getNamedItem("c").getNodeValue().equals("MAX_VALUE")) {
                c = Double.MAX_VALUE;
            } else if (attrs.getNamedItem("c").getNodeValue().equals("MIN_VALUE")) {
                c = Double.MIN_VALUE;
            } else {
                c = Double.parseDouble(attrs.getNamedItem("c").getNodeValue());
            }
            result[i] = new Double[]{a, b, c,};
        }
        return result;
    }

    @Test(dataProvider = "negative", expectedExceptions = Exception.class)
    public void testSideTriangle(Double a, Double b, Double c) throws Exception {
        check = new Check(a, b, c);
        check.check();
        Assert.assertEquals(check.sideTriangle(), Exception.class);
    }

    @DataProvider(name = "positive")
    public Object[][] readXMLTriangular() throws Exception {
        File file = new File("./test.number.xml");
        DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = fact.newDocumentBuilder();
        Document doc = builder.parse(file);
        NodeList nodes = doc.getElementsByTagName(POSITIVE);
        Object[][] result = new Object[nodes.getLength()][];
        for (int i = 0; i < nodes.getLength(); i++) {
            double a;
            double b;
            double c;
            String type;
            NamedNodeMap attrs = nodes.item(i).getAttributes();
            if (attrs.getNamedItem("a").getNodeValue().equals("MAX_VALUE")) {
                a = Double.MAX_VALUE;
            } else if (attrs.getNamedItem("a").getNodeValue().equals("MIN_VALUE")) {
                a = Double.MIN_VALUE;
            } else {
                a = Double.parseDouble(attrs.getNamedItem("a").getNodeValue());
            }
            if (attrs.getNamedItem("b").getNodeValue().equals("MAX_VALUE")) {
                b = Double.MAX_VALUE;
            } else if (attrs.getNamedItem("b").getNodeValue().equals("MIN_VALUE")) {
                b = Double.MIN_VALUE;
            } else {
                b = Double.parseDouble(attrs.getNamedItem("b").getNodeValue());
            }
            if (attrs.getNamedItem("c").getNodeValue().equals("MAX_VALUE")) {
                c = Double.MAX_VALUE;
            } else if (attrs.getNamedItem("c").getNodeValue().equals("MIN_VALUE")) {
                c = Double.MIN_VALUE;
            } else {
                c = Double.parseDouble(attrs.getNamedItem("c").getNodeValue());
            }
            type = attrs.getNamedItem(TYPE_TRIANGLE).getNodeValue();
            result[i] = new Object[]{a, b, c,type};
        }
        return result;
    }

    @Test(dataProvider = "positive")
    public void testType(double a, double b, double c, String type) throws Exception {
        check = new Check(a, b, c);
        Assert.assertEquals(check.sideTriangle(), type);
    }

}