package tester;

import model.SkillMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * The SkillMapTests class tests various use cases of the {@link SkillMap} class using JUnit tests.
 */

public class SkillMapTests {

    // Test retrieving XP per hour data from the skill map
    @Test public void testRetrievingData() {
        SkillMap skillMap = new SkillMap();
        Assertions.assertEquals(60000, skillMap.getXp("Agility", "Pollnivneach Rooftop Course"));
        Assertions.assertEquals(10000, skillMap.getXp("Agility", "Shayzien Basic Course"));
    }

    // Test invalid input
    @Test public void testInvalidData() {
        SkillMap skillMap = new SkillMap();
        Assertions.assertThrows(IllegalArgumentException.class, () -> skillMap.getXp("Gardening", "Flowers"));
    }
}
