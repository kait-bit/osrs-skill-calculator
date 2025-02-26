package model;

import java.text.DecimalFormat;

/**
 * The XpCalc class performs xp calculations based on the {@link SkillMap} and user input.
 */

public class XpCalc {
    private SkillMap map;
    private double currXp;
    private double goalLevel;
    private double hoursPerDay;
    private DecimalFormat df;

    public XpCalc(SkillMap map, double currXp, double goalLevel, double hoursPerDay) {
        this.map = map;
        this.currXp = currXp;
        this.goalLevel = goalLevel;
        this.hoursPerDay = hoursPerDay;
        this.df = new DecimalFormat("0.0");
    }

    // Finds how many days it will take to reach the desired level
    public String calcDays(String skill, String method) {
        /*
        Calculates total xp needed for goal level
        OSRS experience formula, ignoring floor functions
        Accurate +/- 14 xp
         */
        double goalXp = (0.125 * (Math.pow(goalLevel, 2) - goalLevel + 600 * ((Math.pow(2, goalLevel / 7.0) - Math.pow(2, 1.0 / 7.0))) / (Math.pow(2, 1.0 / 7.0) - 1.0)));

        // Find xp still needed based on current xp
        double neededXp = (goalXp - currXp);

        // Get xpPerHour from skill map based on chosen skill and grinding method
        int xpPerHour = map.getXp(skill, method);

        double days = (neededXp / xpPerHour) / hoursPerDay;

        // Return number of days it will take to reach goal level based on grinding method and hours per day
        return df.format(days);
    }
}
