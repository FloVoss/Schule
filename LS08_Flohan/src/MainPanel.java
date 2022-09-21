import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.MouseInputListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.text.TableView.TableRow;
import javax.xml.crypto.Data;

import Mitarbeiter.Abteilung;
import Mitarbeiter.BueroArbeiter;
import Mitarbeiter.Manager;
import Mitarbeiter.Mitarbeiter;
import Mitarbeiter.Schichtarbeiter;
import java.awt.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.awt.Color;

public class MainPanel extends JPanel {

    // Dummy Data
    private String[] columns = new String[] { "", "Name", "ID", "Abteilung", "Typ", "Gehalt" };
    private Object[][] rows = new Object[][] {
        {false, "Hans Hannebrück", "5300", "DevOps", "Manager", "7500€" },
        {false, "Max Mustermann", "5111", "Buchhaltung", "Fahrer", "2500€" },
        {false, "Anna Belka", "5613", "", "Büro", "3000€" },
        {false, "Thorsten Trainer", "5333", "", "Schichtarbeiter", "4000€"},
        {false, "Marius Miesepeter", "3555", "", "Büroarbeiter", "6000€"},
        {false, "Gieseler Grevenbruch", "5999", "", "Schichtarbeiter", "4500€"},
        {false, "Martin Murks", "5400", "", "Schichtarbeiter", "4200€"},
        {false, "Dardan Drucks", "5600", "", "Büroarbeiter", "7600€"},
        {false, "Eric Eierbaum", "6300", "", "Büroarbeiter", "7600€"},
        {false, "Dardan Drucks", "4800", "", "Büroarbeiter", "7600€"}
    };

    // Styles
    private Dimension buttonsize = new Dimension(200, 30);
    private Font buttonfont = new Font("Arial", Font.BOLD, 16);
    private Border buttonborder = BorderFactory.createLineBorder(Color.black, 2);
    private Abteilung abteilung = new Abteilung("DevOps", new Manager(5099, "Hans Hosenscheißer", 12000, 1.4));
    private JPanel headerpanel = new JPanel();
    private JPanel leiterpanel = new JPanel();
    private JPanel searchpanel = new JPanel();
    private JPanel bottompanel = new JPanel();
    private MyTableModel tablemodel = new MyTableModel(0, 0);
    private JTable table;
    private JTableHeader header;
    private DefaultTableCellRenderer renderer;
    private JButton downloadbutton = new JButton("Download Gehaltsliste");
    private JButton verschieben = new JButton("Ausgewählte verschieben");

    private JButton abteilungLöschen = new JButton("Abteilung löschen");
    private JButton löschen = new JButton("Ausgewählte löschen");
    private JLabel gehaltsSumme = new JLabel("Gehaltssumme: 17200€");
    private JLabel headerlabel = new JLabel("Abteilung: DevOps");
    private JTextField searchfield = new JTextField("Suche");

    public MainPanel() {
        super();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.white);
        abteilung.setMitarbeiter(new ArrayList<Mitarbeiter>(Arrays.asList(
            new BueroArbeiter(1000 , "Peter Reinsch", 4000),
            new Schichtarbeiter(3000, "Hans Hannebrück", 10),
            new Schichtarbeiter(3001, "Max Mustermann", 10),
            new BueroArbeiter(1001, "Benjamin Beispiel", 2700)
        )));    
        
        headerpanel.setLayout(new BoxLayout(headerpanel, BoxLayout.X_AXIS));
        headerpanel.setBackground(Color.white);
        headerlabel.setFont(new Font("Arial", Font.BOLD, 30));
        ArrayList<Mitarbeiter> mitarbeiter = abteilung.getMitarbeiter();
        // Object[][] data = new Object[columns.length][mitarbeiter.size()];
        // for(int j = 1; j < columns.length; j++){
        //     for(int i = 0; i < mitarbeiter.size(); i++){    
        //         Mitarbeiter current = mitarbeiter.get(i);
        //         data[j][i] = current.getName() + current.getId() + abteilung + current.getClass().getName() + current.einkommen();
        //     }
        // }
        tablemodel.setDataVector(rows, columns);
        table = new JTable(tablemodel);
        header = table.getTableHeader();
        renderer = (DefaultTableCellRenderer) table.getDefaultRenderer(Object.class);
        renderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
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

        // leiterbutton.setBorder(buttonborder);
        // leiterbutton.setBackground(Color.white);
        // leiterbutton.setFont(buttonfont);
        // leiterbutton.setMaximumSize(buttonsize);
        // leiterbutton.setMinimumSize(new Dimension(0, 30));
        // leiterbutton.setPreferredSize(buttonsize);
        // leiterpanel.add(Box.createHorizontalGlue());
        // leiterpanel.add(leiterbutton);

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

        add(Box.createRigidArea(new Dimension(JFrame.MAXIMIZED_HORIZ, 70)));
        add(headerpanel);
        add(Box.createRigidArea(new Dimension(JFrame.MAXIMIZED_HORIZ, 30)));
        add(leiterpanel);
        add(Box.createRigidArea(new Dimension(JFrame.MAXIMIZED_HORIZ, 30)));
        add(searchpanel);
        add(Box.createRigidArea(new Dimension(JFrame.MAXIMIZED_HORIZ, 10)));
        //table.addMouseListener(new CustomMouseListener());
        table.setFont(new Font("Arial", Font.PLAIN, 16));
        table.setRowHeight(50);
        header.setPreferredSize(new Dimension(100, 50));
        header.setFont(new Font("Arial", Font.BOLD, 30));
        header.setBackground(Color.white);
        add(new JScrollPane(table));
        add(Box.createRigidArea(new Dimension(0, 50)));
        add(bottompanel);
    }

}
