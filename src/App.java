import controller.SkillAppController;
import model.SkillMap;
import view.SkillAppView;

/**
 * The App class creates instances of {@link SkillMap}, {@link SkillAppView}, and {@link SkillAppController}.
 */

public class App {
    public static void main(String[] args) {
        SkillMap skillMap = new SkillMap();
        SkillAppView skillAppView = new SkillAppView();
        SkillAppController skillAppController = new SkillAppController(skillMap, skillAppView);
        skillAppView.setVisible(true);
    }
}
