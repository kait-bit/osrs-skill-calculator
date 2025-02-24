package model;

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

    public double calcDays(String skill, String method) {
        // OSRS experience formula, ignoring floor functions
        // Accurate +/- 14 xp
        double neededXp = (0.125 * (Math.pow(goalLevel, 2) - goalLevel + 600 * ((Math.pow(2, goalLevel / 7.0) - Math.pow(2, 1.0 / 7.0))) / (Math.pow(2, 1.0 / 7.0) - 1.0))) - currXp;

        // Get xpPerHour from skill map based on chosen skill and grinding method
        int xpPerHour = map.getXp(skill, method);

        // Return number of days it will take to reach goal level based on hours per day
        return Math.round((neededXp / xpPerHour) / hoursPerDay);
    }
}
