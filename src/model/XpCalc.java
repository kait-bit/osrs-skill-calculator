package model;

/**
 * The XpCalc class performs xp calculations based on the {@link SkillMap} and user input.
 */

public class XpCalc {
    private SkillMap map;
    private double currXp;
    private double goalLevel;
    private double hoursPerDay;

    public XpCalc(SkillMap map, double currXp, double goalLevel, double hoursPerDay) {
        this.map = map;
        this.currXp = currXp;
        this.goalLevel = goalLevel;
        this.hoursPerDay = hoursPerDay;
    }

    // Finds how many days it will take to reach the desired level
    public double calcDays(String skill, String method) {
        /*
        Calculates total xp needed for goal level
        OSRS experience formula, ignoring floor functions
        Accurate +/- 14 xp
         */
        double goalXp = (0.125 * (Math.pow(goalLevel, 2) - goalLevel + 600 * ((Math.pow(2, goalLevel / 7.0) - Math.pow(2, 1.0 / 7.0))) / (Math.pow(2, 1.0 / 7.0) - 1.0))) - currXp;

        // Find xp still needed based on current xp
        double neededXp = (goalXp - currXp);

        // Get xpPerHour from skill map based on chosen skill and grinding method
        int xpPerHour = map.getXp(skill, method);

        // Return number of days it will take to reach goal level based on grinding method and hours per day
        return Math.round((neededXp / xpPerHour) / hoursPerDay);
    }
}
