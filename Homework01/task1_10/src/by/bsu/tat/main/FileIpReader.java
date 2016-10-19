package by.bsu.tat.main;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class that reads the ip address of the file.
 *
 * @author Alexey Makovski
 */
public class FileIpReader extends IpReader {

    /**
     * File with ip address.
     */
    private static String file = "IpAddress.txt";


    /**
     * Reads the ip address of the file.
     *
     * @return line with ip addresses.
     */
    @Override
    public String[] readIps() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String adr;
            ArrayList<String> list = new ArrayList<>();
            while ((adr = reader.readLine()) != null) {
                list.add(adr.trim());
            }
            return list.toArray(new String[list.size()]);
        } catch (IOException e) {
            return null;
        }
    }
}

