package tester;

import model.XpCalc;
import model.SkillMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class XpCalcTests {

    @Test public void testXpCalc() {
        SkillMap skillMap = new SkillMap();
        XpCalc xpCalc = new XpCalc(skillMap, 2000.0, 50.0, 2.0);
        Assertions.assertEquals(4.0, xpCalc.calcDays("Agility", "Varrock Rooftop Course"));
    }
}
