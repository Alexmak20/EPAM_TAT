package by.bsu.tat.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.ArrayList;

/**
 * Class find and run commands.
 * @author Alexey Makovski.
 */
public class Executor {
    public ArrayList<String> opencmd = new ArrayList<String>();
    private ArrayList<String> file = new ArrayList<String>();

    /**
     * Method to find all open commands in list of commands.
     * @param listOfCommands ArrayList of commands
     */
    private ArrayList<String> findAllOpens(ArrayList<String> listOfCommands) {
        for (String command : listOfCommands) {
            if (command.split(" ")[1].equals("open")) {
                opencmd.add(command);
            }
        }
        return opencmd;
    }

    /**
     * Method to run commands.
     * @param listOfCommands ArrayList of commands
     */
    public void executeCommands(ArrayList<String> listOfCommands) {
        findAllOpens(listOfCommands);
        String id;
        WebDriver driver = new OperaDriver();
        CommandsOperation commands = new CommandsOperation(driver);
        for (String openCommand : opencmd) {
            id = openCommand.split(" ")[0];
            file.add(
                    commands.openUrl(openCommand.split(" ")[2].replaceAll("\"",""),
                            openCommand.split(" ")[3].replaceAll("\"","")));
            for (String command : listOfCommands) {
                if (command.split(" ")[0].equals(id)) {
                    if (command.split(" ")[1].equals("checkLinkPresentByHref")) {
                        file.add(
                                commands.checkLinkPresentByHref(command.split(" ")[2].replaceAll(" \"","")));
                    } else if (command.split(" ")[1].equals("checkPageTitle")) {
                        file.add(
                                commands.checkPageTitle(command.split(" ")[2].replaceAll(" \"","")));
                    } else if (command.split(" ")[1].equals("checkLinkPresentByName")) {
                        file.add(
                                commands.checkLinkPresentByName(command.split(" ")[2].replaceAll(" \"","")));
                    } else if (command.split(" ")[1].equals("checkPageContains")) {
                        file.add(
                                commands.checkPageContains(command.split(" ")[2].replaceAll(" \"","")));
                    }
                }
            }
        }
        driver.quit();
        try {
            WriterLogTxtFile tx = new WriterLogTxtFile();
            tx.txtFileWriter(commands.getFailedTests(),
                    commands.getPassedTests(),
                    commands.getTime(),
                    file);
        } catch (Exception e) {
            System.out.println("Error! Can't write txt file!");
        }
    }
}

