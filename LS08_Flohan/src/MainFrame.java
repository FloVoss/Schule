

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicBorders.ButtonBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.ArrayList;
import java.util.HashMap;

public class MainFrame extends JFrame {
    private NavBar navbar;
    private MainPanel mainpanel;
    public MainFrame() {
        super("Abteilung Details");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        navbar = new NavBar();
        mainpanel = new MainPanel();
        add(navbar, BorderLayout.NORTH);
        add(Box.createRigidArea(new Dimension(140, JFrame.MAXIMIZED_VERT)), BorderLayout.WEST);
        add(Box.createRigidArea(new Dimension(140, JFrame.MAXIMIZED_VERT)), BorderLayout.EAST);
        add(Box.createRigidArea(new Dimension(JFrame.MAXIMIZED_HORIZ, 140)), BorderLayout.SOUTH);
        add(mainpanel);
        getContentPane().setBackground(Color.white);
        setVisible(true);
    }
}
