
import java.awt.Color;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import Figuren.Dreieck;
import Figuren.Dreiecksprisma;
import Figuren.DreiseitigePyramide;
import Figuren.IFigur2D;
import Figuren.IFigur3D;
import Figuren.Kreis;
import Figuren.Kreiskegel;
import Figuren.Kugel;
import Figuren.Quader;
import Figuren.Rechteck;
import Figuren.VierseitigePyramide;
import Figuren.Zylinder;
import Fuhrpark.Gps;
import Fuhrpark.Kfz;
import Fuhrpark.Lkw;
import Fuhrpark.Personentransportfahrzeug;
import Mitarbeiter.Abteilung;
import Mitarbeiter.BueroArbeiter;
import Mitarbeiter.Fahrer;
import Mitarbeiter.Manager;
import Mitarbeiter.Mitarbeiter;
import Mitarbeiter.Verwaltung;
import Preiskalkulationen.Preiskalkulation;

/**
 * App class zum testen
 */
public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame();
            }
        });
    }
}