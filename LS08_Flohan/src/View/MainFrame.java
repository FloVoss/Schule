package View;

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

    // Dummy Data
    private String[] columns = new String[] { "Name", "ID", "Typ", "Gehalt" };
    private String[][] rows = new String[][] {
            { "Axel Schweiß", "5300", "Manager", "7500" },
            { "Max Mustermann", "5111", "Fahrer", "2500" },
            { "Anna Belka", "5613", "Büro", "3000" },
            { "Phil Fraß", "5210", "Schichtarbeiter", "4200" },
            { "Test", "Test", "Test", "Test" },
            { "Test", "Test", "Test", "Test" },
            { "Test", "Test", "Test", "Test" },
            { "Test", "Test", "Test", "Test" },
            { "Test", "Test", "Test", "Test" },
            { "Test", "Test", "Test", "Test" },
            { "Test", "Test", "Test", "Test" },
            { "Test", "Test", "Test", "Test" },
            { "Test", "Test", "Test", "Test" },
            { "Test", "Test", "Test", "Test" },
            { "Test", "Test", "Test", "Test" },
            { "Test", "Test", "Test", "Test" }
    };

    // Colors
    private Color black = new Color(0, 0, 0);
    private Color white = new Color(255, 255, 255);

    // Styles
    private Dimension buttonsize = new Dimension(200, 30);
    private Font buttonfont = new Font("Arial", Font.BOLD, 16);
    private Border buttonborder = BorderFactory.createLineBorder(black, 2);

    // Components
    private JPanel flowpanel = new JPanel();
    private JPanel centerpanel = new JPanel();
    private JPanel headerpanel = new JPanel();
    private JPanel leiterpanel = new JPanel();
    private JPanel searchpanel = new JPanel();
    private JPanel bottompanel = new JPanel();
    private JButton abteilungsübersicht = new JButton("Abteilungsübersicht");
    private JButton mitarbeiterübersicht = new JButton("Mitarbeiterübersicht");
    private JButton import_export = new JButton("Import + Export");
    private JButton neuerMitarbeiter = new JButton("neuer Mitarbeiter");
    private JButton downloadbutton = new JButton("Download Gehaltsliste");
    private JButton verschieben = new JButton("Ausgewählte verschieben");
    private JButton leiterbutton = new JButton("Leiter wechseln");
    private JButton abteilungLöschen = new JButton("Abteilung löschen");
    private JButton löschen = new JButton("Ausgewählte löschen");
    private JLabel gehaltsSumme = new JLabel("Gehaltssumme: 17200€");
    private JLabel headerlabel = new JLabel("Abteilung: DevOps");
    private JTextField searchfield = new JTextField("Suche");
    private JTable table = new JTable(rows, columns);
    private JTableHeader header = table.getTableHeader();

    private DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) table.getDefaultRenderer(String.class);
    
    public MainFrame() {
        super("Abteilung Details");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        flowpanel.setLayout(new BoxLayout(flowpanel, BoxLayout.X_AXIS));
        flowpanel.setBackground(Color.lightGray);

        abteilungsübersicht.setFont(buttonfont);
        abteilungsübersicht.setPreferredSize(buttonsize);
        abteilungsübersicht.setMaximumSize(buttonsize);
        abteilungsübersicht.setBackground(white);
        abteilungsübersicht.setBorder(buttonborder);
        flowpanel.add(Box.createRigidArea(new Dimension(140, 40)));
        flowpanel.add(abteilungsübersicht);
        flowpanel.add(Box.createRigidArea(new Dimension(40, 40)));

        mitarbeiterübersicht.setPreferredSize(buttonsize);
        mitarbeiterübersicht.setMaximumSize(buttonsize);
        mitarbeiterübersicht.setFont(buttonfont);
        mitarbeiterübersicht.setBackground(white);
        mitarbeiterübersicht.setBorder(buttonborder);
        flowpanel.add(mitarbeiterübersicht);
        flowpanel.add(Box.createRigidArea(new Dimension(40, 40)));

        import_export.setPreferredSize(buttonsize);
        import_export.setMaximumSize(buttonsize);
        import_export.setFont(buttonfont);
        import_export.setBackground(white);
        import_export.setBorder(buttonborder);
        flowpanel.add(import_export);
        flowpanel.add(Box.createHorizontalGlue());

        neuerMitarbeiter.setPreferredSize(buttonsize);
        neuerMitarbeiter.setMaximumSize(buttonsize);
        neuerMitarbeiter.setFont(buttonfont);
        neuerMitarbeiter.setBackground(white);
        neuerMitarbeiter.setBorder(buttonborder);
        flowpanel.add(neuerMitarbeiter);
        flowpanel.add(Box.createRigidArea(new Dimension(140, 40)));

        headerpanel.setLayout(new BoxLayout(headerpanel, BoxLayout.X_AXIS));
        headerpanel.setBackground(white);

        headerlabel.setFont(new Font("Arial", Font.BOLD, 30));

        downloadbutton.setFont(buttonfont);
        downloadbutton.setBackground(white);
        downloadbutton.setBorder(buttonborder);
        downloadbutton.setPreferredSize(buttonsize);
        downloadbutton.setMaximumSize(buttonsize);

        gehaltsSumme.setFont(buttonfont);
        headerpanel.add(headerlabel);
        headerpanel.add(Box.createHorizontalGlue());
        headerpanel.add(gehaltsSumme);
        headerpanel.add(Box.createRigidArea(new Dimension(40, 40)));
        headerpanel.add(Box.createRigidArea(new Dimension(40, 40)));
        headerpanel.add(downloadbutton);

        leiterpanel.setLayout(new BoxLayout(leiterpanel, BoxLayout.X_AXIS));
        leiterpanel.setBackground(white);

        leiterbutton.setBorder(buttonborder);
        leiterbutton.setBackground(white);
        leiterbutton.setFont(buttonfont);
        leiterbutton.setMaximumSize(buttonsize);
        leiterbutton.setMinimumSize(new Dimension(0, 30));
        leiterbutton.setPreferredSize(buttonsize);
        leiterpanel.add(Box.createHorizontalGlue());
        leiterpanel.add(leiterbutton);

        searchpanel.setLayout(new BoxLayout(searchpanel, BoxLayout.X_AXIS));
        searchpanel.setBackground(white);

        searchfield.setPreferredSize(new Dimension(500, 30));
        searchfield.setMaximumSize(new Dimension(500, 30));
        searchfield.setBorder(buttonborder);
        searchfield.setFont(new Font("Arial", Font.BOLD, 16));

        verschieben.setPreferredSize(new Dimension(300, 30));
        verschieben.setMinimumSize(new Dimension(300, 30));
        verschieben.setMaximumSize(new Dimension(300, 30));
        verschieben.setBackground(white);
        verschieben.setBorder(buttonborder);
        verschieben.setFont(buttonfont);

        löschen.setPreferredSize(buttonsize);
        löschen.setMaximumSize(buttonsize);
        löschen.setBackground(white);
        löschen.setBorder(buttonborder);
        löschen.setFont(buttonfont);
        searchpanel.add(searchfield);
        searchpanel.add(Box.createHorizontalGlue());
        searchpanel.add(verschieben);
        searchpanel.add(Box.createRigidArea(new Dimension(5, 0)));
        searchpanel.add(löschen);

        bottompanel.setLayout(new BoxLayout(bottompanel, BoxLayout.X_AXIS));
        bottompanel.setBackground(white);

        abteilungLöschen.setBorder(buttonborder);
        abteilungLöschen.setFont(buttonfont);
        abteilungLöschen.setBackground(white);
        abteilungLöschen.setPreferredSize(buttonsize);
        abteilungLöschen.setMaximumSize(buttonsize);
        bottompanel.add(abteilungLöschen);
        bottompanel.add(Box.createHorizontalGlue());

        centerpanel.setLayout(new BoxLayout(centerpanel, BoxLayout.Y_AXIS));
        centerpanel.setBackground(white);

        centerpanel.add(Box.createRigidArea(new Dimension(JFrame.MAXIMIZED_HORIZ, 70)));
        centerpanel.add(headerpanel);
        centerpanel.add(Box.createRigidArea(new Dimension(JFrame.MAXIMIZED_HORIZ, 30)));
        centerpanel.add(leiterpanel);
        centerpanel.add(Box.createRigidArea(new Dimension(JFrame.MAXIMIZED_HORIZ, 30)));
        centerpanel.add(searchpanel);
        centerpanel.add(Box.createRigidArea(new Dimension(JFrame.MAXIMIZED_HORIZ, 10)));

        table.setFont(new Font("Arial", Font.PLAIN, 16));
        table.setRowHeight(50);
        renderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        header.setPreferredSize(new Dimension(100, 50));
        header.setFont(new Font("Arial", Font.BOLD, 30));
        header.setBackground(white);
        centerpanel.add(new JScrollPane(table));
        centerpanel.add(Box.createRigidArea(new Dimension(0, 50)));
        centerpanel.add(bottompanel);

        add(flowpanel, BorderLayout.NORTH);
        add(Box.createRigidArea(new Dimension(140, JFrame.MAXIMIZED_VERT)), BorderLayout.WEST);
        add(Box.createRigidArea(new Dimension(140, JFrame.MAXIMIZED_VERT)), BorderLayout.EAST);
        add(Box.createRigidArea(new Dimension(JFrame.MAXIMIZED_HORIZ, 140)), BorderLayout.SOUTH);
        add(centerpanel);
        getContentPane().setBackground(white);
        setVisible(true);
    }
}
