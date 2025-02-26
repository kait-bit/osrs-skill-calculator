package controller;

import model.SkillMap;
import model.XpCalc;
import view.SkillAppView;

/**
 * The SkillAppController class updates the view based on user input.
 */

public class SkillAppController {

    public SkillAppController(SkillMap skillMap, SkillAppView skillAppView) {

        // Set behavior for submit button
        skillAppView.getForm().getSubmitButton().addActionListener(e -> {
            // Get user input
            String skill = skillAppView.getForm().getSkillComboBox().getSelectedItem().toString();
            double currXp = Double.parseDouble(skillAppView.getForm().getCurrXpValueField().getText());
            double goal = Double.parseDouble(skillAppView.getForm().getGoalValueField().getText());
            String method = skillAppView.getForm().getMethodComboBox().getSelectedItem().toString();
            double hours = Double.parseDouble(skillAppView.getForm().getHoursValueField().getText());

            // Pass input to the calculator and save the output
            XpCalc xpCalc = new XpCalc(skillMap, currXp, goal, hours);
            String daysUntilGoal = xpCalc.calcDays(skill, method);

            // Display number of days until goal level
            skillAppView.getForm().getDaysFieldLabel().setText("Days Until Goal: " + daysUntilGoal);
        });
    }
}
