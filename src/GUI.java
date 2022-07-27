/*
IJ Sheets:
Multi Cursor: Alt + Shift + Click
 */

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    // Panels und Labels
    private JPanel panelMain;
    private JPanel panelRaumliste;
    private JPanel panelRaumsuche;
    private JPanel panelInventur;
    private JPanel panelInventarsuche;
    private JPanel panelDozentenVerwaltung;
    private JPanel panelDozentenTerminplan;
    private JLabel raumlisteTitel;
    private JLabel inventurTitel;
    private JLabel dozTerminplanTitel;
    private JLabel dozVerwaltungTitel;
    private JLabel inventarsucheTitel;
    private JLabel raumsucheTitel;
    private JPanel panelStartseite;
    private JLabel startseiteTitel;
    private JLabel startseiteBild;

    // Menü Elemente
    private JMenuBar hauptMenue = new JMenuBar();

    private JMenu startseite = new JMenu("Start");
    private JMenu raumMenue = new JMenu("Raumbuchung");
    private JMenu inventarMenue = new JMenu("Inventar");
    private JMenu dozentenMenue = new JMenu("Dozenten");

    private JMenuItem raumListe = new JMenuItem("Raumübersicht");
    private JMenuItem raumSuche = new JMenuItem("Raum suchen");
    private JMenuItem inventur = new JMenuItem("Inventur");
    private JMenuItem inventarSuche = new JMenuItem("Inventar suchen/bearbeiten");
    private JMenuItem dozentVerwaltung = new JMenuItem("Dozentenverwaltung");
    private JMenuItem dozentTerminplan = new JMenuItem("Dozenten Terminplan");

    // Startbild Elemente
    private ImageIcon hwr;
    private JLabel hintergrund;

    public GUI() {
        //Menü erstellen und verbinden
        hauptMenue.add(startseite);
        hauptMenue.add(raumMenue);
        hauptMenue.add(inventarMenue);
        hauptMenue.add(dozentenMenue);

        raumMenue.add(raumListe);
        raumMenue.add(raumSuche);

        inventarMenue.add(inventur);
        inventarMenue.add(inventarSuche);

        dozentenMenue.add(dozentVerwaltung);
        dozentenMenue.add(dozentTerminplan);

        //Fenster erstellen
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(500, 500));
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        /*
        //Hintergrundbild für Startseite erstellen
        hwr = new ImageIcon("src/GUI/Moritz/HWR Berlin Menu2.jpg");
        hintergrund = new JLabel(); // create a label
        hintergrund.setHorizontalTextPosition(JLabel.CENTER);
        hintergrund.setIcon(hwr);
        this.add(hintergrund);*/

        //Seiten Konfiguration
        hauptMenue.setVisible(true);
        this.setJMenuBar(hauptMenue);
        this.setContentPane(panelMain);
        this.setVisible(true);
        verbergeAllePanels();
        panelStartseite.setVisible(true);
        //hintergrund.setVisible(true);

        //Action Listener für die jeweiligen Seiten
        startseite.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                verbergeAllePanels();
                panelStartseite.setVisible(true);
            }

            @Override
            public void menuDeselected(MenuEvent e) {

            }

            @Override
            public void menuCanceled(MenuEvent e) {

            }
        });

        raumListe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verbergeAllePanels();
                panelRaumliste.setVisible(true);
            }
        });

        raumSuche.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verbergeAllePanels();
                panelRaumsuche.setVisible(true);
            }
        });

        inventur.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verbergeAllePanels();
                panelInventur.setVisible(true);
            }
        });

        inventarSuche.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verbergeAllePanels();
                panelInventarsuche.setVisible(true);
            }
        });

        dozentVerwaltung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verbergeAllePanels();
                panelDozentenVerwaltung.setVisible(true);
            }
        });

        dozentTerminplan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verbergeAllePanels();
                panelDozentenTerminplan.setVisible(true);
            }
        });

    }

    public void verbergeAllePanels(){
        //hintergrund.setVisible(false);
        panelRaumliste.setVisible(false);
        panelRaumsuche.setVisible(false);
        panelInventur.setVisible(false);
        panelInventarsuche.setVisible(false);
        panelDozentenVerwaltung.setVisible(false);
        panelDozentenTerminplan.setVisible(false);
        panelStartseite.setVisible(false);
    }

    public static void main(String[] args) {
        /*JFrame frame = new JFrame("GUI");
        frame.setContentPane(new GUI().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);*/

        new GUI();
    }
}
