package tester;

import model.SkillTable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * The SkillTableTests class tests various use cases of the {@link model.SkillTable} class using JUnit tests.
 */

public class SkillTableTests {

    // Test retrieving XP per hour data from the skill table
    @Test public void testRetrievingData() {
        SkillTable skillTable = new SkillTable();
        Assertions.assertEquals(60000, skillTable.getXp("Agility", "Pollnivneach Rooftop Course"));
        Assertions.assertEquals(10000, skillTable.getXp("Agility", "Shayzien Basic Course"));
    }

    // Test invalid input
    @Test public void testInvalidData() {
        SkillTable skillTable = new SkillTable();
        Assertions.assertThrows(IllegalArgumentException.class, () -> skillTable.getXp("Gardening", "Flowers"));
    }
}
