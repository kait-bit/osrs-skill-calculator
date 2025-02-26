package view;

import javax.swing.*;
import java.awt.*;

/**
 * The SkillAppView class represents the frame for the GUI of the OSRS Skill Calculator application.
 * <p><br>Extends {@link JFrame}
 */
public class SkillAppView extends JFrame {

    public final SkillAppForm form;

    public SkillAppView() {
        this.form = new SkillAppForm();

        // Get the underlying panel and set content
        JPanel content = form.getPanel();
        this.setContentPane(content);

        // Set default dimensions
        this.setPreferredSize(new Dimension(400, 400));

        // Pack components
        this.pack();

        // Set title
        this.setTitle("OSRS Skill Calculator");

        // Destroy the window when X is clicked
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public SkillAppForm getForm() {
        return form;
    }
}
