import javax.swing.JDialog;

import Mitarbeiter.Abteilung;
import Mitarbeiter.*;

/**
 * MitarbeiterForm
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Dictionary;
import java.util.Hashtable;

public class MitarbeiterForm extends JDialog {
    public boolean closable = false;
    private Abteilung abteilung;
    public JFrame frame = new JFrame("Mitarbeiter Erstellen/Bearbeiten");
    private Dictionary<String, String> felder = new Hashtable<String, String>();

    JLabel abteilungL = new JLabel("Abteilung:");
    JComboBox<String> abteilungT = new JComboBox<String>();

    JLabel typL = new JLabel("Typ:");
    JComboBox<String> typT = new JComboBox<String>();

    JLabel sonderfeld2L = new JLabel("Sonderfeld 2:");
    JTextField sonderfeld2T = new JTextField();

    JLabel sonderfeld1L = new JLabel("Sonderfeld 1:");
    JTextField sonderfeld1T = new JTextField();

    JLabel gehaltL = new JLabel("Gehalt:");
    JTextField gehaltT = new JTextField();

    JLabel idL = new JLabel("ID:");
    JTextField idT = new JTextField();

    JLabel nameL = new JLabel("Name:");
    JTextField nameT = new JTextField();

    public <T extends Mitarbeiter> MitarbeiterForm(Abteilung abteilung, T x) {
        // super((Window)null);
        setModal(true);
        this.abteilung = abteilung;
        // Create the JFrame and give it a title
        setSize(600, 700);
        setMinimumSize(new Dimension(600, 700));
        Initialize(this, x);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public JDialog Initialize(JDialog frame, Mitarbeiter x) {
        JPanel pane = new JPanel(new GridBagLayout()); // Create a pane to house all content, and give it a
                                                       // GridBagLayout
        frame.setContentPane(pane);
        pane.setBackground(Color.WHITE);

        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 0;
        c.weighty = 1;
        c.fill = GridBagConstraints.HORIZONTAL;

        JLabel ueberschrift = new JLabel("Mitarbeiter Bearbeiten");
        JButton loeschen = new JButton("Löschen");
        loeschen.addActionListener(new LoeschenListener());
        JButton test = new JButton("                ");
        test.setEnabled(false);
        test.setForeground(Color.WHITE);
        test.setBackground(Color.WHITE);
        test.setBorderPainted(false);
        JButton abbrechen = new JButton("Abbrechen");
        abbrechen.addActionListener(new AbbruchListener());
        JButton speichern = new JButton("Speichern");
        speichern.addActionListener(event -> SpeicherMitarbeiter(pane));

        BueroArbeiter ba = new BueroArbeiter(0, "BuAr", 400.0);
        Schichtarbeiter sa = new Schichtarbeiter(0, "ScAr", 400.0, 160);
        Manager ma = new Manager(0, "Mana", 400.0, 0.0);
        Fahrer f = new Fahrer(0, "Fahrer", "D", 400, 160);

        if (x != null) {

            String mt = x.getClass().toString();

            switch (mt) {

                case "class mitarbeiter.Manager":
                    ma = (Manager) x;
                    FelderFuellen(ma, "Leiter");
                    break;
                case "class mitarbeiter.BueroArbeiter":
                    ba = (BueroArbeiter) x;
                    FelderFuellen(ba, "Büroarbeiter");
                    break;
                case "class mitarbeiter.SchichtArbeiter":
                    sa = (Schichtarbeiter) x;
                    FelderFuellen(sa, "Schichtarbeiter");
                    break;
                case "class mitarbeiter.Fahrer":
                    f = (Fahrer) x;
                    FelderFuellen(f, "Fahrer");
                    break;
            }

        }

        typT.addItem("Fahrer");
        typT.addItem("Leiter");
        typT.addItem("Büroarbeiter");
        typT.addItem("Schichtarbeiter");

        abteilungT.addItem("DevOps");
        abteilungT.addItem("Fabrik");
        abteilungT.setName("Abteilung");

        // Überschrift
        c.gridx = 2;
        c.gridwidth = 1;
        c.gridy = 0;
        pane.add(ueberschrift, c);

        // Label Name
        c.gridx = 0;
        c.gridwidth = 5;
        c.gridy = 1;
        pane.add(nameL, c);

        // Textfeld Name
        c.gridx = 0;
        c.gridwidth = 5;
        c.gridy = 2;
        pane.add(nameT, c);

        // Label ID
        c.gridx = 0;
        c.gridwidth = 2;
        c.gridy = 3;
        pane.add(idL, c);

        c.gridx = 0;
        c.gridwidth = 2;
        c.gridy = 4;
        pane.add(idT, c);

        // Label Typ
        c.gridx = 3;
        c.gridwidth = 2;
        c.gridy = 3;
        pane.add(typL, c);

        c.gridx = 3;
        c.gridwidth = 2;
        c.gridy = 4;
        pane.add(typT, c);

        // Label Abteilung
        c.gridx = 0;
        c.gridwidth = 5;
        c.gridy = 5;
        pane.add(abteilungL, c);

        c.gridx = 0;
        c.gridwidth = 5;
        c.gridy = 6;
        pane.add(abteilungT, c);

        // Label Gehalt
        c.gridx = 0;
        c.gridwidth = 5;
        c.gridy = 7;
        pane.add(gehaltL, c);

        c.gridx = 0;
        c.gridwidth = 5;
        c.gridy = 8;
        pane.add(gehaltT, c);

        // Label Sonderfeld1
        c.gridx = 0;
        c.gridwidth = 2;
        c.gridy = 9;
        pane.add(sonderfeld1L, c);

        c.gridx = 0;
        c.gridwidth = 2;
        c.gridy = 10;
        pane.add(sonderfeld1T, c);

        // Label Sonderfeld1
        c.gridx = 3;
        c.gridwidth = 2;
        c.gridy = 9;
        pane.add(sonderfeld2L, c);

        c.gridx = 3;
        c.gridwidth = 2;
        c.gridy = 10;
        pane.add(sonderfeld2T, c);

        // Button Löschen
        c.gridx = 0;
        c.gridwidth = 1;
        c.gridy = 12;
        pane.add(loeschen, c);

        // Button Löschen
        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 12;
        pane.add(test, c);

        // Button Speichern
        c.gridx = 3;
        c.gridwidth = 1;
        c.gridy = 12;
        pane.add(speichern, c);

        // Button Abbrechen
        c.gridx = 4;
        c.gridwidth = 1;
        c.gridy = 12;
        pane.add(abbrechen, c);

        return frame;
    }

    private <T extends Mitarbeiter> void FelderFuellen(T mitarbeiter, String typ) {
        nameT.setName("Name");
        nameT.setText(mitarbeiter.getName());

        idT.setName("Id");
        idT.setText(Integer.toString(mitarbeiter.getId()));

        gehaltT.setName("Gehalt");
        gehaltT.setText(Double.toString(mitarbeiter.einkommen()));

        sonderfeld1T.setName("Sonderfeld1");
        // sonderfeld1T.setText();

        sonderfeld2T.setName("Sonderfeld2");
        // sonderfeld2T.setText();

        typT.setName("Typ");

        if (typ == "Leiter") {
            sonderfeld1T.setName("Sonderfeld1");
            sonderfeld1T.setText(Double.toString(((Manager) mitarbeiter).getBonusSatz()));

            typT.setSelectedItem("Leiter");

        }
        if (typ == "Fahrer") {
            sonderfeld1T.setName("Sonderfeld1");
            sonderfeld1T.setText(((Fahrer) mitarbeiter).getFuehrerscheinKlasse());

            typT.setSelectedItem("Fahrer");

        }
        if (typ == "BüroArbeiter") {
            typT.setSelectedItem("Büroarbeiter");
        } else {
            typT.setSelectedItem("Schichtarbeiter");
        }

        abteilungT.setSelectedItem(abteilung.getName());

    }

    private void SpeicherMitarbeiter(JPanel pane) {
        String typ = typT.getSelectedItem().toString();
        switch (typ) {
            case "Schichtarbeiter":
                abteilung.add(new Schichtarbeiter(Integer.parseInt(idT.getText()), nameT.getText(),
                        Double.parseDouble(gehaltT.getText())));
                break;
            case "Büroarbeiter":
                abteilung.add(new BueroArbeiter(Integer.parseInt(idT.getText()), nameT.getText(),
                        Double.parseDouble(gehaltT.getText())));
                break;
            case "Manager":
                abteilung.add(new Manager(Integer.parseInt(idT.getText()), nameT.getText(),
                        Double.parseDouble(gehaltT.getText()), Double.parseDouble(sonderfeld1T.getText())));
                break;
            case "Fahrer":
                abteilung.add(new Fahrer(Integer.parseInt(idT.getText()), nameT.getText(), sonderfeld2T.getText(),
                        Double.parseDouble(gehaltT.getText())));
        }

        for (Mitarbeiter element : abteilung.getMitarbeiter()) {
            System.out.println(element.getName());
        }
        frame.setVisible(false);
        this.frame.dispose();

        closable = true;
    }

    class AbbruchListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane opane = new JOptionPane();
            int result = opane.showConfirmDialog(frame, "Alle Änderungen werden gelöscht. \n Möchten sie fortfahren?",
                    "Abbrechen", JOptionPane.YES_NO_OPTION);

            if (result == JOptionPane.OK_OPTION) {
                frame.setVisible(false);
                frame.dispose();
                closable = true;
            }
        }
    }

    class LoeschenListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane opane = new JOptionPane();
            int result = opane.showConfirmDialog(frame,
                    "Der Mitarbeiter wird endgültig gelöscht. \n Möchten sie fortfahren?", "Abbrechen",
                    JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                frame.setVisible(false);
                frame.dispose();
            }
        }
    }
}