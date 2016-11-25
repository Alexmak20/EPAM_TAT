package by.bsu.tat.main;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Class executes instructions that came either from the command line,
 * or txt file, or xml file.
 * @author Alexey Makovski.
 */
public class CommandsOperation {
    private int failedTests = 0;
    private  int passedTests =0;
    private long allTime = 0;
    private WebDriver driver;

    public CommandsOperation(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Method opens url address
     * @param url  String url address
     * @param time Long time to load page
     * @return String line to put in log file
     */
    public String openUrl(String url, String time) {
        String result = " ";
        long startTime = System.currentTimeMillis();
        driver.get(url);
        long endTime = System.currentTimeMillis();
        long executeTime = endTime - startTime;
        if (!driver.getTitle().equals("") && (executeTime < Long.parseLong(time))) {
            result = "+";
            passedTests++;
        } else {
            result = "!";
            failedTests++;
        }
        String timeEx = Long.toString(executeTime);
        allTime += executeTime;
        return result + " [open \"" + url + "\" \"" + time + "\"] " + timeEx;
    }

    /**
     * Method to check link present by href
     * @return String line to put in log file
     */

    public String checkLinkPresentByHref(String href) {
        String result = "+";
        long startTime = System.currentTimeMillis();
        try {
            driver.findElement(By.xpath("//a[@href=\"" + href + "\"]"));
        } catch (NoSuchElementException e) {
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            String duration = Long.toString(executeTime);
            allTime += executeTime;
            result = "!";
            failedTests++;
            return result + " [checkLinkPresentByHref \"" + href + "\"] " + duration;
        }
        passedTests++;
        long endTime = System.currentTimeMillis();
        long executeTime = endTime - startTime;
        String duration = Long.toString(executeTime);
        allTime += executeTime;
        return result + " [checkLinkPresentByHref \"" + href + "\"] " + duration;
    }

    /**
     * Method to check if page title is similar to given
     * @param title String line with expected page title
     * @return String line to put in log file
     */
    public String checkPageTitle(String title) {
        String result = "";
        long startTime = System.currentTimeMillis();
        String currentTitle = driver.getTitle();
        long endTime = System.currentTimeMillis();
        long executeTime = endTime - startTime;
        if (currentTitle.equals(title)) {
            result = "+";
            passedTests++;
        } else {
            result = "!";
            failedTests++;
        }
        String duration = Long.toString(executeTime);
        allTime += executeTime;
        return result + " [checkPageTitle \"" + title + "\"] " + duration;
    }

    /**
     * Method to check link by name
     *
     * @param name String name of link
     * @return String line to put in log file
     */
    public String checkLinkPresentByName(String name) {
        String result = "+";
        long startTime = System.currentTimeMillis();
        try {
            driver.findElement(By.xpath("//a[text()=\"" + name + "\"]"));
        } catch (NoSuchElementException e) {
            long endTime = System.currentTimeMillis();
            long executeTime = endTime - startTime;
            String duration = Long.toString(executeTime);
            allTime += executeTime;
            result = "!";
            failedTests++;
            return result + " [checkLinkPresentByName \"" + name + "\"] " + duration;
        }
        passedTests++;
        long endTime = System.currentTimeMillis();
        long executeTime = endTime - startTime;
        String duration = Long.toString(executeTime);
        allTime += executeTime;
        return result + " [checkLinkPresentByName \"" + name + "\"] " + duration;
    }

    /**
     * Method to check if page contains text
     * @param text String text to check
     * @return String line to put in log file
     */
    public String checkPageContains(String text) {
        String result = "";
        long startTime = System.currentTimeMillis();
        String currentText = driver.getPageSource();
        long endTime = System.currentTimeMillis();
        long executeTime = endTime - startTime;
        if (currentText.contains(text)) {
            result = "+";
            passedTests++;
        } else {
            result = "!";
            failedTests++;
        }
        String duration = Long.toString(executeTime);
        allTime += executeTime;
        return result + " [checkPageContains \"" + text + "\"] " + duration;
    }


    /**
     * Getter for field failedTests
     * @return failedTests int count of failedTests
     */
    public int getFailedTests(){
        return failedTests;
    }
    /**
     * Getter for field time
     * @return time double value of total time
     */
    public long getTime(){
        return allTime;
    }

    /**
     * Getter for passed test.
     * @return passed test.
     */
    public int getPassedTests(){
        return passedTests;
    }
}
