package by.bsu.tat.main;

import java.util.ArrayList;

/**
 * Class makes a rule list.
 *
 * @author Alexey Makovski
 */
public class ValidationRule {
    ArrayList<Rule> rulesList = new ArrayList<>();

    /**
     * Method generates a list of rules.
     * @param rule Rule to add to the list.
     */

    public void add(Rule rule) {
        rulesList.add(rule);
    }

    /**
     * Method that verifies compliance with the rules.
     * @param s1 testable line.
     */

    public void validate(String s1) {
        for (Rule rule : rulesList) {
            if (rule.check(s1)) {
                System.out.println(rule.getInfo());
            }
        }
    }
}
