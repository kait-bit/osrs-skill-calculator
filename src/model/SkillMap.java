package model;

import java.io.*;
import java.util.HashMap;

/**
 *@author Kaitlin Spell
 *
 *<p>The SkillMap class stores Old School RuneScape skills in a HashMap using a custom key {@link TableKey}.
 * Data includes the skill name, specific grinding methods, and the associated XP per hour.
 *
 * <p><br>A method, {@code getXp}, is provided to retrieve the hourly xp for a skill based on the grinding method.
 */
public final class SkillMap {
    private final HashMap<TableKey, Integer> map;

    public SkillMap() {
        this.map = new HashMap<TableKey, Integer>();
        fillHashMap();
    }

    // Retrieve the whole skill map
    public HashMap<TableKey, Integer> getMap() {
        return map;
    }


    // Fill the skill map with data from the skillData.txt file
    private void fillHashMap() {
        try {
            File file = new File("C:\\Users\\sleep\\Documents\\programming\\osrs-skill-calculator\\src\\model\\skillData.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = null;

            /*
            Read in the text file.
            Text file data is structured: skill,method,xp
            For each line, split it into 3 columns and store the data.
            Column 1 (skill) and column 2 (method) -> custom key.
            Column 3 (xp per hour) -> int.
            Populate the HashMap.
             */
            while ((line = br.readLine()) != null) {
                String [] columns = line.split(",");
                String skill = columns[0].trim();
                String method = columns[1].trim();
                TableKey key = new TableKey(skill, method);
                int xp = Integer.parseInt(columns[2].trim());

                map.put(key, xp);
            }
        } catch (IOException e) {
            throw new RuntimeException("File not found.");
        }
    }

    // Retrieve the xp per hour for a skill based on the grinding method
    public Integer getXp(String skill, String method) {
        if (map.containsKey(new TableKey(skill, method))) {
            return map.get(new TableKey(skill, method));
        } else {
            throw new IllegalArgumentException("No entry was found for " + skill + " and " + method);
        }
    }
}