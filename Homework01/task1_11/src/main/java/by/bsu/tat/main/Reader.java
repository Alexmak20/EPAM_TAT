package by.bsu.tat.main;


import java.io.*;
import java.util.ArrayList;

/**
 * Class read coordinates.
 * @author Alexey Makovski.
 */
public class Reader {

    private static String s = "Coordinates.txt";

    public double x;
    public double y;

    /**
     * Building point with coordinates.
     * @param x coordinate x of the coordinates.
     * @param y coordinate y of the coordinates.
     */
    public Reader(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Reading of file with coordinates,
     * creating list of coordinates.
     * @return list of coordinates.
     */
    public static ArrayList<Reader> read() {
        try {
            ArrayList<String> list = new ArrayList<>();
            ArrayList<Reader> point = new ArrayList<>();
            FileReader f = new FileReader(s);
            BufferedReader bq = new BufferedReader(f);
            String line;
            try {
                while ((line = bq.readLine()) != null) {
                    list.add(line);
                }
                for (String s : list) {
                    String[] COORDINATE = s.split(" ");
                    double x = Double.parseDouble(COORDINATE[0]);
                    double y = Double.parseDouble(COORDINATE[1]);
                    point.add(new Reader(x, y));
                }
                return point;
            } catch (IOException e) {
                System.out.println("ERROR READING FILE");
            }
        } catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND");
            System.exit(1);
        }
        return null;
    }
}
