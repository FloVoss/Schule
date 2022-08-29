package View;
import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{
    NavBar navbar;
    public MainFrame() {
        super("Abteilung Details");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        navbar = new NavBar();
        add(navbar, BorderLayout.NORTH);
        setVisible(true);
    }
}
