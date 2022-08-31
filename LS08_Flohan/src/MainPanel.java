import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

import java.awt.*;

public class MainPanel extends JPanel{

    // Dummy Data
    private String[] columns = new String[] {"", "Name", "ID", "Typ", "Gehalt" };
    private String[][] rows = new String[][] {
            {"", "Axel Schweiß", "5300", "Manager", "7500" },
            {"", "Max Mustermann", "5111", "Fahrer", "2500" },
            {"", "Anna Belka", "5613", "Büro", "3000" },
            {"", "Phil Fraß", "5210", "Schichtarbeiter", "4200" },
            {"", "Test", "Test", "Test", "Test" },
            {"", "Test", "Test", "Test", "Test" },
            {"", "Test", "Test", "Test", "Test" },
            {"", "Test", "Test", "Test", "Test" },
            {"", "Test", "Test", "Test", "Test" },
            {"", "Test", "Test", "Test", "Test" },
            {"", "Test", "Test", "Test", "Test" },
            {"", "Test", "Test", "Test", "Test" },
            {"", "Test", "Test", "Test", "Test" },
            {"", "Test", "Test", "Test", "Test" },
            {"", "Test", "Test", "Test", "Test" },
            {"", "Test", "Test", "Test", "Test" }
    };

    // Styles
    private Dimension buttonsize = new Dimension(200, 30);
    private Font buttonfont = new Font("Arial", Font.BOLD, 16);
    private Border buttonborder = BorderFactory.createLineBorder(Color.black, 2);
    
    private JPanel headerpanel = new JPanel();
    private JPanel leiterpanel = new JPanel();
    private JPanel searchpanel = new JPanel();
    private JPanel bottompanel = new JPanel();
    private JTable table = new JTable(rows, columns);
    private JTableHeader header = table.getTableHeader();
    private DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) table.getDefaultRenderer(String.class);
    
    private JButton downloadbutton = new JButton("Download Gehaltsliste");
    private JButton verschieben = new JButton("Ausgewählte verschieben");
    private JButton leiterbutton = new JButton("Leiter wechseln");
    private JButton abteilungLöschen = new JButton("Abteilung löschen");
    private JButton löschen = new JButton("Ausgewählte löschen");
    private JLabel gehaltsSumme = new JLabel("Gehaltssumme: 17200€");
    private JLabel headerlabel = new JLabel("Abteilung: DevOps");
    private JTextField searchfield = new JTextField("Suche");

    public MainPanel() {
        super();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.white);

        headerpanel.setLayout(new BoxLayout(headerpanel, BoxLayout.X_AXIS));
        headerpanel.setBackground(Color.white);
        headerlabel.setFont(new Font("Arial", Font.BOLD, 30));
        
        downloadbutton.setFont(buttonfont);
        downloadbutton.setBackground(Color.white);
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
        leiterpanel.setBackground(Color.white);

        leiterbutton.setBorder(buttonborder);
        leiterbutton.setBackground(Color.white);
        leiterbutton.setFont(buttonfont);
        leiterbutton.setMaximumSize(buttonsize);
        leiterbutton.setMinimumSize(new Dimension(0, 30));
        leiterbutton.setPreferredSize(buttonsize);
        leiterpanel.add(Box.createHorizontalGlue());
        leiterpanel.add(leiterbutton);

        searchpanel.setLayout(new BoxLayout(searchpanel, BoxLayout.X_AXIS));
        searchpanel.setBackground(Color.white);

        searchfield.setPreferredSize(new Dimension(500, 30));
        searchfield.setMaximumSize(new Dimension(500, 30));
        searchfield.setBorder(buttonborder);
        searchfield.setFont(new Font("Arial", Font.BOLD, 16));
        searchfield.setHorizontalAlignment(searchfield.CENTER);

        verschieben.setPreferredSize(new Dimension(300, 30));
        verschieben.setMinimumSize(new Dimension(300, 30));
        verschieben.setMaximumSize(new Dimension(300, 30));
        verschieben.setBackground(Color.white);
        verschieben.setBorder(buttonborder);
        verschieben.setFont(buttonfont);

        löschen.setPreferredSize(buttonsize);
        löschen.setMaximumSize(buttonsize);
        löschen.setBackground(Color.white);
        löschen.setBorder(buttonborder);
        löschen.setFont(buttonfont);
        searchpanel.add(searchfield);
        searchpanel.add(Box.createHorizontalGlue());
        searchpanel.add(verschieben);
        searchpanel.add(Box.createRigidArea(new Dimension(5, 0)));
        searchpanel.add(löschen);

        bottompanel.setLayout(new BoxLayout(bottompanel, BoxLayout.X_AXIS));
        bottompanel.setBackground(Color.white);

        abteilungLöschen.setBorder(buttonborder);
        abteilungLöschen.setFont(buttonfont);
        abteilungLöschen.setBackground(Color.white);
        abteilungLöschen.setPreferredSize(buttonsize);
        abteilungLöschen.setMaximumSize(buttonsize);
        bottompanel.add(abteilungLöschen);
        bottompanel.add(Box.createHorizontalGlue());

        System.out.println(table.getColumn("").getCellRenderer());

        add(Box.createRigidArea(new Dimension(JFrame.MAXIMIZED_HORIZ, 70)));
        add(headerpanel);
        add(Box.createRigidArea(new Dimension(JFrame.MAXIMIZED_HORIZ, 30)));
        add(leiterpanel);
        add(Box.createRigidArea(new Dimension(JFrame.MAXIMIZED_HORIZ, 30)));
        add(searchpanel);
        add(Box.createRigidArea(new Dimension(JFrame.MAXIMIZED_HORIZ, 10)));

        table.setFont(new Font("Arial", Font.PLAIN, 16));
        table.setRowHeight(50);
        renderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        header.setPreferredSize(new Dimension(100, 50));
        header.setFont(new Font("Arial", Font.BOLD, 30));
        header.setBackground(Color.white);
        add(new JScrollPane(table));
        add(Box.createRigidArea(new Dimension(0, 50)));
        add(bottompanel);
    }
}
