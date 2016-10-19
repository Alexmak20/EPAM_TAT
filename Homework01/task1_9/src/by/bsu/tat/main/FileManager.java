package by.bsu.tat.main;

import java.io.File;

/**
 * Class looks at the directory for files and folders in it.
 */
public class FileManager {


    /**
     * Method determines the size of the file or folder.
     *
     * @param f catalog
     * @return the file size.
     */
    public static long getFileSize(File f) {
        long size = 0;
        if (f.isFile()) {
            size += f.length();
        }
        if (f.isDirectory()) {
            File[] files = f.listFiles();
            for (File file : files) {
                size += getFileSize(file);
            }
        }
        return size;
    }
}
