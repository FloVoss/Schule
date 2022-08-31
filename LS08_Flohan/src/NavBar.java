import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;

public class NavBar extends JPanel {
    // Styles
    private Dimension buttonsize = new Dimension(200, 30);
    private Font buttonfont = new Font("Arial", Font.BOLD, 16);
    private Border buttonborder = BorderFactory.createLineBorder(Color.black, 2);

    // Components
    private JButton abteilungsübersicht = new JButton("Abteilungsübersicht");
    private JButton mitarbeiterübersicht = new JButton("Mitarbeiterübersicht");
    private JButton import_export = new JButton("Import + Export");
    private JButton neuerMitarbeiter = new JButton("neuer Mitarbeiter");

    public NavBar() {
        super();
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        setBackground(Color.lightGray);
        abteilungsübersicht.setFont(buttonfont);
        abteilungsübersicht.setPreferredSize(buttonsize);
        abteilungsübersicht.setMaximumSize(buttonsize);
        abteilungsübersicht.setBackground(Color.white);
        abteilungsübersicht.setBorder(buttonborder);
        add(Box.createRigidArea(new Dimension(140, 40)));
        add(abteilungsübersicht);
        add(Box.createRigidArea(new Dimension(40, 40)));
        mitarbeiterübersicht.setPreferredSize(buttonsize);
        mitarbeiterübersicht.setMaximumSize(buttonsize);
        mitarbeiterübersicht.setFont(buttonfont);
        mitarbeiterübersicht.setBackground(Color.white);
        mitarbeiterübersicht.setBorder(buttonborder);
        add(mitarbeiterübersicht);
        add(Box.createRigidArea(new Dimension(40, 40)));
        import_export.setPreferredSize(buttonsize);
        import_export.setMaximumSize(buttonsize);
        import_export.setFont(buttonfont);
        import_export.setBackground(Color.white);
        import_export.setBorder(buttonborder);
        add(import_export);
        add(Box.createHorizontalGlue());
        neuerMitarbeiter.setPreferredSize(buttonsize);
        neuerMitarbeiter.setMaximumSize(buttonsize);
        neuerMitarbeiter.setFont(buttonfont);
        neuerMitarbeiter.setBackground(Color.white);
        neuerMitarbeiter.setBorder(buttonborder);
        add(neuerMitarbeiter);
        add(Box.createRigidArea(new Dimension(140, 40)));
    }
}
