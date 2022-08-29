package View;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class LeftPanel extends JPanel{
    ArrayList<JButton> buttons = new ArrayList<JButton>();
    public LeftPanel() {
        super();
        setLayout(new FlowLayout());
    }
}
