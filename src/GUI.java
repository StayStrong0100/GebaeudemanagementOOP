/*
IJ Sheets:
Multi Cursor: Alt + Shift + Click
 */

import buchung.Dozent;
import serviceLocator.ServiceLocator;
import verwaltung.Haus;
import verwaltung.Raum;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class GUI extends JFrame {
    // Menü Elemente
    private JMenuBar hauptMenue = new JMenuBar();

    private JMenu raumMenue = new JMenu("Raum");
    private JMenu inventarMenue = new JMenu("Inventar");
    private JMenu dozentenMenue = new JMenu("Dozenten");

    private JMenuItem raumHinzufügen = new JMenuItem("Raum hinzufügen");
    private JMenuItem raumSuchenUndBuchen = new JMenuItem("Raum suchen und buchen");
    private JMenuItem raumBearbeiten = new JMenuItem("Raum bearbeiten");

    private JMenuItem inventur = new JMenuItem("Inventur");
    private JMenuItem inventarBearbeiten = new JMenuItem("Inventar suchen/bearbeiten");

    private JMenuItem dozentenÜbersicht = new JMenuItem("Dozentenübersicht");
    private JMenuItem dozentHinzufügen = new JMenuItem("Dozent hinzufügen");
    private JMenuItem dozentTerminplan = new JMenuItem("Dozenten Terminplan");

    // Panels und Labels
    private JPanel panelMain;
    private JPanel panelRaumHinzufügen;
    private JPanel panelRaumSuchenBuchen;
    private JPanel panelInventur;
    private JPanel panelInventarBearbeiten;
    private JPanel panelDozentenUebersicht;
    private JPanel panelDozentenTerminplan;
    private JLabel raumlisteTitel;
    private JLabel inventurStuehleTitel;
    private JLabel dozTerminplanTitel;
    private JLabel dozUebersichtTitel;
    private JLabel inventarsucheTitel;
    private JLabel raumsucheTitel;
    private JPanel panelStartseite;
    private JLabel startseiteTitel;
    private JLabel startseiteBild;


    private JMenu startseite = new JMenu("Start");
    private JPanel panelFooter;
    private JLabel footerContent;
    private JTextField raumsucheStartzeitInput;
    private JTextField raumsucheEndzeitInput;
    private JTextField raumsucheTischeInput;
    private JTextField raumsucheStuehleInput;
    private JTextField raumsucheBeamerInput;
    private JTextField raumsucheKamerasInput;
    private JLabel raumsucheStartTitel;
    private JLabel raumsucheEndeTitel;
    private JLabel raumsucheTischeTitel;
    private JLabel raumsucheStuehleTitel;
    private JLabel raumsucheBeamerTitel;
    private JLabel raumsucheKamerasTitel;
    private JButton raumsucheSuchen;
    private JTextField raumsuchePCInput;
    private JTextField raumsucheLautsprecherInput;
    private JTextField raumsucheKreidetafelnInput;
    private JTextField raumsucheSmartboardInput;
    private JLabel raumsuchePCTitel;
    private JLabel raumsucheLautsprecherTitel;
    private JLabel raumsucheSmartboardTitel;
    private JLabel raumsucheKreidetafelTitel;
    private JLabel raumsucheWhiteboardTitel;
    private JLabel raumsucheMikrofoneTitel;
    private JTextField raumsucheWhiteboardsInput;
    private JTextField raumsucheMikrofoneInput;
    private JLabel raumlisteAddNummerTitel;
    private JTextField raumlisteAddNummerInput;
    private JLabel raumlisteAddHausTitel;
    private JTextField raumlisteAddHausInput;
    private JButton raumlisteAddButton;
    private JPanel panelRaumBearbeiten;
    private JLabel raumbearbeitenTitel;
    private JPanel panelDozentVerwalten;
    private JLabel dozentVerwTitel;
    private JTextArea raumlisteBestätigung;
    private JTextField raumbearbeitenRaumIDAltInput;
    private JTextArea raumbearbeitenRaumliste;
    private JButton raumbearbeitenRaumIDCheck;
    private JLabel raumbearbeitenRaumlisteTitel;
    private JLabel raumbearbeitenRaumIDAltTitel;
    private JPanel panelRaumBearbeitenDetails;
    private JLabel raumbearbeitenRaumIDNeuTitel;
    private JTextField raumbearbeitenRaumIDNeuInput;
    private JTextArea raumbearbeitenBestätigung;
    private JTextArea raumsuchenbuchenBestätigung;
    private JPanel panelBuchen;
    private JTextField buchenRaumnummerInput;
    private JTextField buchenDozentInput;
    private JLabel buchenRaumnummerTitel;
    private JLabel buchenDozentTitel;
    private JButton buchenCheck;
    private JTextArea buchenBestätigung;
    private JLabel inventurTischTitel;
    private JLabel inventurTitel;
    private JLabel inventurLautsprecherTitel;
    private JLabel inventurPCsTitel;
    private JLabel inventurBeamerTitel;
    private JLabel inventurKameraTitel;
    private JLabel inventurSmartboardsTitel;
    private JLabel inventurKreidetafelnTitel;
    private JLabel inventurWhiteboardsTitel;
    private JLabel inventurMikrofoneTitel;
    private JLabel inventurTischeOutput;
    private JLabel inventurStuehleOutput;
    private JLabel inventurBeamerOutput;
    private JLabel inventurKamerasOutput;
    private JLabel inventurPCsOutput;
    private JLabel inventurLautsprecherOutput;
    private JLabel inventurSmartboardsOutput;
    private JLabel inventurKreidetafelnOutput;
    private JLabel inventurWhiteboardsOutput;
    private JLabel inventurMikrofoneOutput;
    private JTextArea dozUebersichtBestätigung;
    private JLabel dozentVerwInputTitel;
    private JTextField dozentVerwInput;
    private JButton dozentVerwHinzuButton;
    private JButton dozentVerwLoeschenButton;
    private JTextArea dozentVerwBestätigung;
    private JTextArea inventurBestätigung;
    private JLabel dozTerminplanSucheTitel;
    private JTextField dozTerminplanSucheInput;
    private JLabel dozTerminplanT1Titel;
    private JLabel dozTerminplanT3Titel;
    private JLabel dozTerminplanT7Titel;
    private JLabel dozTerminplanT5Titel;
    private JLabel dozTerminplanT6Titel;
    private JLabel dozTerminplanT2Titel;
    private JLabel dozTerminplanDonnerstagTitel;
    private JLabel buchenDozentenSuche;
    private JLabel dozTerminplanPlatzhalter;
    private JLabel dozTerminplanW1Titel;
    private JTextArea dozTerminplanBestätigung;
    private JLabel dozTerminplanW2Titel;
    private JLabel dozTerminplanW3Titel;
    private JLabel dozTerminplanW4Titel;
    private JLabel dozTerminplanW5Titel;
    private JLabel dozTerminplanW6Titel;
    private JLabel dozTerminplanW7Titel;
    private JLabel dozTerminplanW8Titel;

    // Startbild Elemente
    private ImageIcon hwr;
    private JLabel hintergrund;

    //Attribute für Methoden mit Zugriff auf Verarbeitungsschicht
    private ArrayList<Raum> perfekteRaueme = new ArrayList<>();
    private Calendar start = Calendar.getInstance();
    private Calendar ende = Calendar.getInstance();

    public GUI() {
        //Menü erstellen und verbinden
        hauptMenue.add(raumMenue);
        hauptMenue.add(inventarMenue);
        hauptMenue.add(dozentenMenue);

        raumMenue.add(raumHinzufügen);
        raumMenue.add(raumSuchenUndBuchen);
        raumMenue.add(raumBearbeiten);

        inventarMenue.add(inventur);
        inventarMenue.add(inventarBearbeiten);

        dozentenMenue.add(dozentenÜbersicht);
        dozentenMenue.add(dozentTerminplan);
        dozentenMenue.add(dozentHinzufügen);

        //Fenster erstellen
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(500, 500));
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        /*
        //Hintergrundbild für Startseite erstellen
        hwr = new ImageIcon("src/GUI/Moritz/HWR Berlin.jpg");
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

        raumHinzufügen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verbergeAllePanels();
                panelRaumHinzufügen.setVisible(true);
            }
        });

        raumSuchenUndBuchen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verbergeAllePanels();
                panelRaumSuchenBuchen.setVisible(true);
            }
        });

        raumBearbeiten.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verbergeAllePanels();
                panelRaumBearbeiten.setVisible(true);
            }
        });

        inventur.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verbergeAllePanels();
                panelInventur.setVisible(true);
            }
        });

        inventarBearbeiten.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verbergeAllePanels();
                panelInventarBearbeiten.setVisible(true);
            }
        });

        dozentenÜbersicht.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verbergeAllePanels();
                panelDozentenUebersicht.setVisible(true);
            }
        });

        dozentTerminplan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verbergeAllePanels();
                panelDozentenTerminplan.setVisible(true);
            }
        });

        dozentHinzufügen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verbergeAllePanels();
                panelDozentVerwalten.setVisible(true);
            }
        });

        raumsucheSuchen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelBuchen.setVisible(false);

                //Wenn ein Kalendar-Feld leer geblieben ist, Fehlermeldung und Methode nicht ausführen
                if (raumsucheStartzeitInput.getText().equals("") || raumsucheEndzeitInput.getText().equals("")){
                    raumsuchenbuchenBestätigung.setText("Bitte füllen Sie die Zeit-Felder aus!");
                    return;
                }

                //Zeit-Daten umwandeln


                SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
                try {
                    start.setTime(format.parse(raumsucheStartzeitInput.getText()));

                } catch (ParseException ex) {
                    raumsuchenbuchenBestätigung.setText("Bitte geben Sie die Startzeit in dem angegebene Format an!");
                    return;
                }
                try {
                    ende.setTime(format.parse(raumsucheEndzeitInput.getText()));
                } catch (ParseException ex) {
                    raumsuchenbuchenBestätigung.setText("Bitte geben Sie die Endzeit in dem angegebene Format an!");
                    return;
                }

                //Start muss vor Ende liegen
                if(start.after(ende)){
                    raumsuchenbuchenBestätigung.setText("Die Startzeit muss vor der Endzeit liegen. Bitte überprüfen Sie Ihre Eingaben!");
                    return;
                }

                //Ausstattungs-Daten auslesen, wenn kein Wert eingeben wurde: Anzahl = 0
                int minKameras = (raumsucheKamerasInput.getText().equals("")) ? 0 : Integer.valueOf(raumsucheKamerasInput.getText());
                int minBeamer = (raumsucheBeamerInput.getText().equals("")) ? 0 : Integer.valueOf(raumsucheBeamerInput.getText());
                int minLautsprecher =  (raumsucheLautsprecherInput.getText().equals("")) ? 0 : Integer.valueOf(raumsucheLautsprecherInput.getText());
                int minMikrofone =  (raumsucheMikrofoneInput.getText().equals("")) ? 0 : Integer.valueOf(raumsucheMikrofoneInput.getText());
                int minPCs = (raumsuchePCInput.getText().equals("")) ? 0 : Integer.valueOf(raumsuchePCInput.getText());
                int minTische =  (raumsucheTischeInput.getText().equals("")) ? 0 : Integer.valueOf(raumsucheTischeInput.getText());
                int minStuehle =  (raumsucheStuehleInput.getText().equals("")) ? 0 : Integer.valueOf(raumsucheStuehleInput.getText());
                int minSmartboards =  (raumsucheSmartboardInput.getText().equals("")) ? 0 : Integer.valueOf(raumsucheSmartboardInput.getText());
                int minWhiteboards =  (raumsucheWhiteboardsInput.getText().equals("")) ? 0 : Integer.valueOf(raumsucheWhiteboardsInput.getText());
                int minKreidetafeln =  (raumsucheKreidetafelnInput.getText().equals("")) ? 0 : Integer.valueOf(raumsucheKreidetafelnInput.getText());

                //Filter nach Zeit
                    ArrayList<Raum> freieRaueme = ServiceLocator.getInstance().getHausliste().filtereRaeuemeVerfuegbar(start,ende);

                //Filter nach Ausstattung
                perfekteRaueme = ServiceLocator.getInstance().getHausliste().filtereRaeuemeAusstattung(freieRaueme,minBeamer,minKameras,minKreidetafeln,minLautsprecher,minMikrofone,minPCs,minSmartboards,minStuehle,minTische,minWhiteboards);

                if (perfekteRaueme.size() == 0){
                    raumsuchenbuchenBestätigung.setText("Es gibt keine passenden Räume, bitte verändern Sie Ihre Suchkriterien!");
                }

                else {
                    //Gefundene Räume anzeigen
                    String anzeige = "Gefundene Räume: \n";
                    for (Raum r : perfekteRaueme) {
                        anzeige.concat(r.printRaum());
                        anzeige.concat("\n");
                    }

                    raumsuchenbuchenBestätigung.setText(anzeige);
                    //Buchungs Panel sichtbar machen
                    panelBuchen.setVisible(true);
                    buchenBestätigung.setText("Bitte geben Sie aus der obigen Liste eine Raumnummer und den gewünschten Dozenten ein!");
                }
            }
        });
        raumlisteAddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Wenn ein Feld leer geblieben ist, Fehlermeldung und Methode nicht ausführen
                if (raumlisteAddNummerInput.getText().equals("") || raumlisteAddHausInput.getText().equals("")){
                    raumlisteBestätigung.setText("Bitte füllen Sie beide Felder aus!");
                    return;
                }

                int raumID = Integer.valueOf(raumlisteAddNummerInput.getText());
                String hausID = raumlisteAddHausInput.getText();
                //Prüfe, ob ID bereits vergeben ist
                if(ServiceLocator.getInstance().getHausliste().raumnummerKollidiert(raumID)){
                    raumlisteBestätigung.setText("Raum wurde nicht angelegt, RaumID bereits vergeben");
                }

                //wenn keine Kollision: Im entsprechenden Haus addRaum
                else {
                    for (Haus h : ServiceLocator.getInstance().getHausliste().getAlleHaeuser()) {
                        if (h.getHausnummer() == hausID) {
                            h.addRaum(new Raum(raumID));
                            raumlisteBestätigung.setText("Neuer Raum angelegt: Haus " + hausID + " Raum: " + raumID);
                            return;
                        }
                    }
                    raumlisteBestätigung.setText("Raum wurde nicht angelegt, Haus existiert nicht");
                }
            }
        });
        raumbearbeitenRaumIDCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Wenn ein Feld leer geblieben ist, Fehlermeldung und Methode nicht ausführen
                if (raumbearbeitenRaumIDAltInput.getText().equals("") || raumbearbeitenRaumIDNeuInput.getText().equals("")){
                    raumbearbeitenBestätigung.setText("Bitte füllen Sie beide Felder aus!");
                    return;
                }

                int alteID = Integer.valueOf(raumbearbeitenRaumIDAltInput.getText());
                int neueID = Integer.valueOf(raumbearbeitenRaumIDNeuInput.getText());
                //Wenn der angegebene Raum (alteID) existiert....
                if(ServiceLocator.getInstance().getHausliste().raumnummerKollidiert(alteID)){
                    //Wenn die neueID noch nicht vergeben ist:
                    if(!(ServiceLocator.getInstance().getHausliste().raumnummerKollidiert(neueID))){
                        for (Raum r : ServiceLocator.getInstance().getHausliste().getAlleRaeueme()) {
                            if (r.getRaumnummer() == alteID){
                                r.setRaumnummer(neueID);
                                raumbearbeitenBestätigung.setText("Raumnummer erfolgreich geändert.");
                                return;
                                }
                        }
                    }
                    //Es gab eine ID-Kollision, also ist die Raumnummer bereits vergeben
                    else {
                        raumbearbeitenBestätigung.setText("Neue Raumnummer ist bereits vergeben. Bitte überprüfen Sie ihre Eingaben!");
                    }
                }
                //Angegebener Raum existiert nicht
                else {
                    raumbearbeitenBestätigung.setText("Der ausgewählte Raum existiert nicht. Bitte überprüfen Sie ihre Eingaben!");
                }
            }
        });
        buchenCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Kontrolle, ob beide Felder ausgefüllt wurden
                if(buchenRaumnummerInput.getText().equals("") || buchenDozentInput.getText().equals("")){
                    buchenBestätigung.setText("Bitte füllen Sie beide Felder aus!");
                    return;
                }

                for (Raum r : perfekteRaueme) {
                    if(r.getRaumnummer() == Integer.valueOf(buchenRaumnummerInput.getText())){
                        for (Dozent d : ServiceLocator.getInstance().getDozentenListe().getAlleDozenten()) {
                            if (d.getName().equals(buchenDozentInput.getText())){
                                r.buchen(start, ende,d);
                                buchenBestätigung.setText("Erfolgreich gebucht. BuchungsID: " + (r.getBuchungen().get(r.getBuchungen().size()-1).getId()));
                            }
                            //Dozent ist noch nicht registriert
                            else{
                                buchenBestätigung.setText("Der Dozent ist noch nicht registriert. Bitte überprüfen Sie Ihre Eingaben oder fügen Sie den Dozenten hinzu!");
                            }
                            return;
                        }
                    }
                    //Raumnummer war nicht in der Liste der passenden Räume
                    else {
                        buchenBestätigung.setText("Der angegebene Raum entspricht nicht den Suchkriterien. \t Bitte überprüfen Sie ihre Eingaben und vergewissern Sie sich, dass die Raumnummer oben angegeben ist!");
                        return;
                    }
                }

            }
        });
    }

    public void verbergeAllePanels(){
        panelRaumHinzufügen.setVisible(false);
        panelRaumSuchenBuchen.setVisible(false);
        panelInventur.setVisible(false);
        panelInventarBearbeiten.setVisible(false);
        panelDozentenUebersicht.setVisible(false);
        panelDozentenTerminplan.setVisible(false);
        panelStartseite.setVisible(false);
        panelRaumBearbeiten.setVisible(false);
        panelDozentVerwalten.setVisible(false);
        panelBuchen.setVisible(false);
    }

    public static void main(String[] args) {
        new GUI();
    }

    private void createUIComponents() {
        //place custom component creation code here
    }
}
