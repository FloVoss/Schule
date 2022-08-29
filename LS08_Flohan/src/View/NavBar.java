package View;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class NavBar extends JPanel{
    ArrayList<JButton> buttons = new ArrayList<JButton>();
    LeftPanel leftpanel = new LeftPanel();
    public NavBar() {
        super();
        setLayout(new FlowLayout());
        buttons.add(new JButton("Abteilungsübersicht"));
        buttons.add(new JButton("Mitarbeiterübersicht"));
        buttons.add(new JButton("Import/Export"));
        buttons.add(new JButton("neue Abteilung"));
        buttons.add(new JButton("neuer Mitarbeiter"));
        for (JButton button : buttons) {
            add(button, FlowLayout.LEFT);
        }
        
        setBackground(new Color(220, 220, 220));
    }
}
