package view;

import javax.swing.*;

/**
 * The SkillAppForm class provides getter methods for the GUI components.
 */

public class SkillAppForm {
    private JPanel panel;
    private JLabel skillFieldLabel;
    private JLabel currXpFieldLabel;
    private JLabel goalFieldLabel;
    private JLabel methodFieldLabel;
    private JLabel hoursFieldLabel;
    private JTextField currXpValueField;
    private JTextField goalValueField;
    private JComboBox skillComboBox;
    private JComboBox methodComboBox;
    private JTextField hoursValueField;
    private JButton submitButton;
    private JLabel daysFieldLabel;

    public JPanel getPanel() {
        return panel;
    }

    public JLabel getSkillFieldLabel() {
        return skillFieldLabel;
    }

    public JLabel getCurrXpFieldLabel() {
        return currXpFieldLabel;
    }

    public JLabel getGoalFieldLabel() {
        return goalFieldLabel;
    }

    public JLabel getMethodFieldLabel() {
        return methodFieldLabel;
    }

    public JLabel getHoursFieldLabel() {
        return hoursFieldLabel;
    }

    public JTextField getCurrXpValueField() {
        return currXpValueField;
    }

    public JTextField getGoalValueField() {
        return goalValueField;
    }

    public JComboBox getSkillComboBox() {
        return skillComboBox;
    }

    public JComboBox getMethodComboBox() {
        return methodComboBox;
    }

    public JTextField getHoursValueField() {
        return hoursValueField;
    }

    public JButton getSubmitButton() {
        return submitButton;
    }

    public JLabel getDaysFieldLabel() {
        return daysFieldLabel;
    }
}
