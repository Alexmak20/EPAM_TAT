package by.bsu.tat.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class write information execution instruction.
 * @author Alexey Makovski.
 */
public class WriterLogTxtFile {

    /**
     * Method write information execution instruction.
     * @param failedTests failed execution instruction.
     * @param passedTests passed execution instruction.
     * @param allTime all time execution instruction.
     * @param txtFile file.
     * @throws IOException
     */

    public void txtFileWriter(int failedTests,
                              int passedTests,
                              long allTime,
                              ArrayList<String> txtFile) throws IOException {
        BufferedWriter outPut = new BufferedWriter(new FileWriter("logFileTest.txt"));
        for (String line : txtFile) {
            outPut.write(line + " ms \r\n");
        }
        outPut.write("Total tests: " + (passedTests + failedTests) + " \r\n" +
                "Passed/Failed: " + passedTests + "/" + failedTests + " \r\n" +
                "Total time: " + allTime + " ms \r\n" +
                "Average time: " + (allTime / (passedTests + failedTests)) + " ms");
        outPut.close();
    }
}
