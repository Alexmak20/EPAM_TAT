package by.bsu.tat.main;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/**
 * Class an application that contains the entry point.
 *
 * @author Alexey Makovski
 */
public class Main {

    /**
     * It reads, data models, ping fills and stores the table in the file.
     *
     * @param args start a command line.
     */
    public static void main(String[] args) {
        int maxPing = 0;
        String[] ip;
        if (args.length != 0) {
            ip = args;
        } else {
            ip = new FileIpReader().readIps();
        }
        ArrayList<Server> ipList = getServersList(ip);
        int[] ping = new int[ipList.size()];
        for (int i = 0; i < ping.length; i++) {
            ping[i] = new PingSimulator().pingServer();
            if (maxPing < ping[i]) {
                maxPing = ping[i];
            }
        }
        HtmlTable table = new HtmlTable();
        for (int j = 0; ipList.size() > j; j++) {
            table.addLine(ipList.get(j).getIp(), ping[j], maxPing == ping[j]);
        }
        try {
            new FileSaver().saveToFile(table.getHtml());
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            System.out.println("Error while writing file.");
        }

    }

    /**
     * Method looks for the correct ip address.
     *
     * @param ip entered ip address.
     * @return with the correct ip address list.
     */
    private static ArrayList<Server> getServersList(String[] ip) {
        ArrayList<Server> ipList = new ArrayList<>();
        for (String arg : ip) {
            try {
                ipList.add(Server.Builder.build(arg));
            } catch (Exception e) {
                System.out.println("Incorrectly entered ip : " + arg);
            }
        }
        return ipList;
    }
}
