/*
IJ Sheets:
Multi Cursor: Alt + Shift + Click
 */

import ausstattung.*;
import buchung.Dozent;
import serviceLocator.ServiceLocator;
import verwaltung.Haus;
import verwaltung.Raum;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class GUI extends JFrame {
    // Menü Elemente
    private JMenuBar hauptMenue = new JMenuBar();

    private JMenu hausMenue = new JMenu("Haus");
    private JMenu raumMenue = new JMenu("Raum");
    private JMenu inventarMenue = new JMenu("Inventar");
    private JMenu dozentenMenue = new JMenu("Dozenten");

    private JMenuItem hausHinzufuegen = new JMenuItem("Haus hinzufügen");
    private JMenuItem hausBearbeiten = new JMenuItem("Haus bearbeiten");
    private JMenuItem hausLoeschen = new JMenuItem("Haus löschen");

    private JMenuItem raumHinzufuegen = new JMenuItem("Raum hinzufügen");
    private JMenuItem raumSuchenUndBuchen = new JMenuItem("Raum suchen und buchen");
    private JMenuItem raumBearbeiten = new JMenuItem("Raum bearbeiten");

    private JMenuItem inventur = new JMenuItem("Inventur");
    private JMenuItem inventarBearbeiten = new JMenuItem("Inventar suchen/bearbeiten");

    private JMenuItem dozentTerminplan = new JMenuItem("Dozenten Terminplan");
    private JMenuItem dozentHinzufuegen = new JMenuItem("Dozent hinzufügen");
    private JMenuItem dozentLoeschen = new JMenuItem("Dozent löschen");
    //TODO Dozent bearbeiten


    // GUI Elemente: Panels, Labels, ComboBox, TextField. TextAreas
    private JPanel panelMain;
    private JPanel panelRaumHinzufuegen;
    private JPanel panelRaumSuchenBuchen;
    private JPanel panelInventur;
    private JPanel panelInventarBearbeiten;
    private JPanel panelDozentLoeschen;
    private JPanel panelDozentenTerminplan;
    private JPanel panelFooter;

    private JLabel raumHinzufuegenTitel;
    private JLabel dozTerminplanTitel;
    private JLabel dozentLoeschenTitel;
    private JLabel inventarsucheTitel;
    private JLabel raumsucheTitel;
    private JPanel panelStartseite;
    private JLabel startseiteTitel;
    private JLabel startseiteBild;
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
    private JLabel raumHinzufuegenNummerTitel;
    private JTextField raumHinzufuegenNummerInput;
    private JLabel raumHinzufuegenHausTitel;
    private JButton raumHinzufuegenButton;
    private JPanel panelRaumBearbeiten;
    private JLabel raumbearbeitenTitel;
    private JPanel panelDozentHinzufuegen;
    private JLabel dozentHinzufuegenTitel;
    private JTextArea raumHinzufuegenBestaetigung;
    private JTextField raumbearbeitenRaumIDInput;
    private JButton raumbearbeitenIDAendernCheck;
    private JLabel raumbearbeitenRaumlisteTitel;
    private JPanel panelRaumBearbeitenDetails;
    private JLabel raumbearbeitenRaumIDNeuTitel;
    private JTextField raumbearbeitenRaumIDNeuInput;
    private JTextArea raumbearbeitenBestaetigung;
    private JTextArea raumsuchenbuchenBestaetigung;
    private JTextField buchenRaumnummerInput;
    private JTextField buchenDozentInput;
    private JLabel buchenRaumnummerTitel;
    private JLabel buchenDozentTitel;
    private JButton buchenCheck;
    private JLabel inventurTitel;
    private JLabel dozentHinzufuegenInputTitel;
    private JTextField dozentHinzufuegenInput;
    private JButton dozentHinzufuegenButton;
    private JTextArea dozentHinzufuegenBestaetigung;
    private JTextArea inventurBestaetigung;
    private JLabel dozTerminplanDozAuswahlTitel;
    private JLabel dozTerminplanT1Titel;
    private JLabel dozTerminplanT3Titel;
    private JLabel dozTerminplanT7Titel;
    private JLabel dozTerminplanT5Titel;
    private JLabel dozTerminplanT6Titel;
    private JLabel dozTerminplanT2Titel;
    private JLabel dozTerminplanDonnerstagTitel;
    private JLabel dozTerminplanPlatzhalter;
    private JLabel dozTerminplanW1Titel;
    private JLabel dozTerminplanW2Titel;
    private JLabel dozTerminplanW3Titel;
    private JLabel dozTerminplanW4Titel;
    private JLabel dozTerminplanW5Titel;
    private JLabel dozTerminplanW6Titel;
    private JLabel dozTerminplanW7Titel;
    private JLabel dozTerminplanW8Titel;
    //private JComboBox raumbearbeitenHinzufügenInput;
    private JLabel raumbearbeitenHinzufuegenTitel;
    private JLabel raumbearbeitenVeraendernTitel;
    private JButton raumbearbeitenHinzufuegenCheck;
    private JButton raumbearbeitenVeraendernCheck;
    private JComboBox raumbearbeitenHinzufuegenTypInput;
    private JComboBox raumbearbeitenHinzufuegenArtInput;
    private JComboBox raumbearbeitenRaumlisteInput;
    private JComboBox raumbearbeitenVeraendernZustandInput;
    private JComboBox raumbearbeitenVeraendernAusstattungInput;
    private JComboBox buchenRaumnummerSelectInput;
    private JComboBox buchenDozentSelectInput;
    private JComboBox raumHinzufuegenHausInput;
    private JScrollPane panelScrollRaumbearbeiten;
    private JSeparator raumbearbeitenSeperator;
    private JComboBox dozentLoeschenDozListe;
    private JButton dozentLoeschenCheck;
    private JLabel dozentLoeschenNameTitel;
    private JTextArea dozentLoeschenBestaetigung;
    private JTextArea dozTerminplanW1D1Output;
    private JTextArea dozTerminplanW1D2Output;
    private JTextArea dozTerminplanW1D3Output;
    private JTextArea dozTerminplanW1D4Output;
    private JTextArea dozTerminplanW1D5Output;
    private JTextArea dozTerminplanW1D6Output;
    private JTextArea dozTerminplanW2D1Output;
    private JTextArea dozTerminplanW2D2Output;
    private JTextArea dozTerminplanW2D3Output;
    private JTextArea dozTerminplanW2D4Output;
    private JTextArea dozTerminplanW2D5Output;
    private JTextArea dozTerminplanW2D6Output;
    private JTextArea dozTerminplanW3D1Output;
    private JTextArea dozTerminplanW3D2Output;
    private JTextArea dozTerminplanW3D3Output;
    private JTextArea dozTerminplanW3D4Output;
    private JTextArea dozTerminplanW3D5Output;
    private JTextArea dozTerminplanW3D6Output;
    private JTextArea dozTerminplanW4D1Output;
    private JTextArea dozTerminplanW4D2Output;
    private JTextArea dozTerminplanW4D3Output;
    private JTextArea dozTerminplanW4D4Output;
    private JTextArea dozTerminplanW4D5Output;
    private JTextArea dozTerminplanW4D6Output;
    private JTextArea dozTerminplanW5D1Output;
    private JTextArea dozTerminplanW5D2Output;
    private JTextArea dozTerminplanW5D3Output;
    private JTextArea dozTerminplanW5D4Output;
    private JTextArea dozTerminplanW5D5Output;
    private JTextArea dozTerminplanW5D6Output;
    private JTextArea dozTerminplanW6D1Output;
    private JTextArea dozTerminplanW6D2Output;
    private JTextArea dozTerminplanW6D3Output;
    private JTextArea dozTerminplanW6D4Output;
    private JTextArea dozTerminplanW6D5Output;
    private JTextArea dozTerminplanW6D6Output;
    private JTextArea dozTerminplanW7D1Output;
    private JTextArea dozTerminplanW7D2Output;
    private JTextArea dozTerminplanW7D3Output;
    private JTextArea dozTerminplanW7D4Output;
    private JTextArea dozTerminplanW7D5Output;
    private JTextArea dozTerminplanW7D6Output;
    private JTextArea dozTerminplanW8D1Output;
    private JTextArea dozTerminplanW8D2Output;
    private JTextArea dozTerminplanW8D3Output;
    private JTextArea dozTerminplanW8D4Output;
    private JTextArea dozTerminplanW8D5Output;
    private JTextArea dozTerminplanW8D6Output;
    private JComboBox dozTerminplanDozAuswahlInput;
    private JPanel panelHausLoeschen;
    private JPanel panelHausBearbeiten;
    private JPanel panelHausHinzufuegen;
    private JLabel hausLoeschenTitel;
    private JSeparator hausLoeschenTitelSeperator;
    private JLabel hausBearbeitenTitel;
    private JSeparator hausBearbeitenTitelSeperator;
    private JLabel hausHinzufuegenTitel;
    private JSeparator hausHinzufuegenTitelSeperator;
    private JSeparator inventurTitelSeperator;

    // Startbild Elemente
    private ImageIcon hwr;
    private JLabel hintergrund;

    public GUI() {
        //Menü erstellen und verbinden
        hauptMenue.add(hausMenue);
        hauptMenue.add(raumMenue);
        hauptMenue.add(inventarMenue);
        hauptMenue.add(dozentenMenue);

        hausMenue.add(hausHinzufuegen);
        hausMenue.add(hausBearbeiten);
        hausMenue.add(hausLoeschen);

        raumMenue.add(raumHinzufuegen);
        raumMenue.add(raumSuchenUndBuchen);
        raumMenue.add(raumBearbeiten);

        inventarMenue.add(inventur);
        inventarMenue.add(inventarBearbeiten);

        dozentenMenue.add(dozentTerminplan);
        dozentenMenue.add(dozentHinzufuegen);
        dozentenMenue.add(dozentLoeschen);

        //Fenster erstellen
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //damit Speicher-Dialog geöffnet wird
        this.setMinimumSize(new Dimension(500, 500));
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        //Seiten Konfiguration
        hauptMenue.setVisible(true);
        this.setJMenuBar(hauptMenue);
        this.setContentPane(panelMain);
        this.setVisible(true);
        verbergeAllePanels();
        panelStartseite.setVisible(true);
        //hintergrund.setVisible(true);


        //Es folgen die Action Listener, beim Aufruf / Wechsel von Seiten

        hausHinzufuegen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verbergeAllePanels();
                panelHausHinzufuegen.setVisible(true);
            }
        });


        hausBearbeiten.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verbergeAllePanels();
                panelHausBearbeiten.setVisible(true);
            }
        });

        hausLoeschen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verbergeAllePanels();
                panelHausLoeschen.setVisible(true);
            }
        });



        raumHinzufuegen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verbergeAllePanels();
                panelRaumHinzufuegen.setVisible(true);
                raumHinzufuegenHausInput.removeAllItems();

                for(Haus h : ServiceLocator.getInstance().getHausliste().getAlleHaeuser()){
                    raumHinzufuegenHausInput.addItem(h.getHausnummer());
                }
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
                panelScrollRaumbearbeiten.setVisible(true);
                panelRaumBearbeiten.setVisible(true);
                //raumbearbeitenBestaetigung.setText(ServiceLocator.getInstance().getHausliste().toString());
                raumbearbeitenRaumlisteInput.removeAllItems();
                //raumbearbeitenBestaetigung.setText(ServiceLocator.getInstance().getHausliste().getAlleRaeueme().size()+"");

                for (Raum r : ServiceLocator.getInstance().getHausliste().getAlleRaeueme()) {
                    raumbearbeitenRaumlisteInput.addItem(r.getRaumnummer());

                //    System.out.println(r.getRaumnummer());
                }
            }
        });

        inventur.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verbergeAllePanels();
                panelInventur.setVisible(true);
                inventurBestaetigung.setText(ServiceLocator.getInstance().getHausliste().inventur());
            }
        });

        inventarBearbeiten.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verbergeAllePanels();
                panelInventarBearbeiten.setVisible(true);
            }
        });

        dozentLoeschen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verbergeAllePanels();
                panelDozentLoeschen.setVisible(true);
                dozentLoeschenDozListe.removeAllItems();
                for(Dozent d: ServiceLocator.getInstance().getDozentenListe().getAlleDozenten()){
                    dozentLoeschenDozListe.addItem(d.getName());
                }
            }
        });

        dozentTerminplan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verbergeAllePanels();
                panelDozentenTerminplan.setVisible(true);
                dozTerminplanDozAuswahlInput.removeAllItems();
                for(Dozent d : ServiceLocator.getInstance().getDozentenListe().getAlleDozenten()){
                    dozTerminplanDozAuswahlInput.addItem(d.getName());
                }

            }
        });

        dozentHinzufuegen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verbergeAllePanels();
                panelDozentHinzufuegen.setVisible(true);

            }
        });

        //Es folgen Action Listener, die bei Buttons ausgeführt werden
        raumsucheSuchen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Felder leeren von vorherigen Durchläufen
                raumsuchenbuchenBestaetigung.setText("");
                buchenRaumnummerSelectInput.removeAllItems();
                buchenDozentSelectInput.removeAllItems();

                //Wenn ein Kalendar-Feld leer geblieben ist, Fehlermeldung und Methode nicht ausführen
                if (raumsucheStartzeitInput.getText().equals("") || raumsucheEndzeitInput.getText().equals("")){
                    raumsuchenbuchenBestaetigung.setText("Bitte füllen Sie die Zeit-Felder aus!");
                    return;
                }

                //Zeit-Daten umwandeln
                SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
                Calendar start = Calendar.getInstance();
                Calendar ende = Calendar.getInstance();
                try {
                    start.setTime(format.parse(raumsucheStartzeitInput.getText()));

                } catch (ParseException ex) {
                    raumsuchenbuchenBestaetigung.setText("Bitte geben Sie die Startzeit in dem angegebene Format an!");
                    return;
                }
                try {
                    ende.setTime(format.parse(raumsucheEndzeitInput.getText()));
                } catch (ParseException ex) {
                    raumsuchenbuchenBestaetigung.setText("Bitte geben Sie die Endzeit in dem angegebene Format an!");
                    return;
                }

                //Start muss vor Ende liegen
                if(start.after(ende)){
                    raumsuchenbuchenBestaetigung.setText("Die Startzeit muss vor der Endzeit liegen. Bitte überprüfen Sie Ihre Eingaben!");
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
                ArrayList<Raum> perfekteRaueme = ServiceLocator.getInstance().getHausliste().filtereRaeuemeAusstattung(freieRaueme,minBeamer,minKameras,minKreidetafeln,minLautsprecher,minMikrofone,minPCs,minSmartboards,minStuehle,minTische,minWhiteboards);

                if (perfekteRaueme.size() == 0){
                    raumsuchenbuchenBestaetigung.setText("Es gibt keine passenden Räume, bitte verändern Sie Ihre Suchkriterien!");
                }

                else {
                    //Gefundene Räume in den DropDownMenus zum Buchen anzeigen
                    for (Raum r : perfekteRaueme) {
                        buchenRaumnummerSelectInput.addItem(r.getRaumnummer());
                    }
                    //Dozenten Auswahl
                    for (Dozent d : ServiceLocator.getInstance().getDozentenListe().getAlleDozenten()){
                        buchenDozentSelectInput.addItem(d.getName());
                    }
                    raumsuchenbuchenBestaetigung.setText("Bitte wählen Sie einen Raum und einen Dozenten aus!");

                }
            }
        });
        raumHinzufuegenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Wenn ein Feld leer geblieben ist, Fehlermeldung und Methode nicht ausführen
                if (raumHinzufuegenNummerInput.getText().equals("") || raumHinzufuegenHausInput.getSelectedItem() == null){
                    raumHinzufuegenBestaetigung.setText("Bitte füllen Sie beide Felder aus!");
                    return;
                }

                int raumID = Integer.valueOf(raumHinzufuegenNummerInput.getText());
                String hausID = raumHinzufuegenHausInput.getSelectedItem().toString();
                //Prüfe, ob ID bereits vergeben ist
                if(ServiceLocator.getInstance().getHausliste().raumnummerKollidiert(raumID)){
                    raumHinzufuegenBestaetigung.setText("Die Raumnummer ist bereits vergeben, bitte wählen Sie eine andere!");
                    return;
                }

                //wenn keine Kollision: Im entsprechenden Haus addRaum
                else {
                    for (Haus h : ServiceLocator.getInstance().getHausliste().getAlleHaeuser()) {
                        if (h.getHausnummer() == hausID) {
                            h.addRaum(new Raum(raumID));
                            raumHinzufuegenBestaetigung.setText("Neuer Raum angelegt: Haus " + hausID + " Raum: " + raumID);
                            return;
                        }
                    }
                    raumHinzufuegenBestaetigung.setText("Unerwarteter Fehler: Haus existiert nicht. Bitte wiederholen Sie den Vorgang!");
                }
            }
        });
        raumbearbeitenIDAendernCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Wenn kein Raum ausgewählt wurde
                if (raumbearbeitenRaumlisteInput.getSelectedItem() == null){
                    raumbearbeitenBestaetigung.setText("Bitte wählen Sie einen Raum aus!");
                    return;
                }

                //Wenn neue ID nicht angegeben wurde, Fehlermeldung und Methode nicht ausführen
                if (raumbearbeitenRaumIDNeuInput.getText().equals("")){
                    raumbearbeitenBestaetigung.setText("Bitte geben Sie eine neue Raumnummer an!");
                    return;
                }

                //Neue ID einlesen, wenn falsches Format Abbruch
                int neueID;
                try {
                    neueID = Integer.parseInt(raumbearbeitenRaumIDNeuInput.getText());
                }
                catch (NumberFormatException ex){
                    raumbearbeitenBestaetigung.setText("Bitte geben Sie eine Zahl ein!");
                    return;
                }

                //Alte ID aus DropDown Menu extrahieren
                int alteID = Integer.valueOf(raumbearbeitenRaumlisteInput.getSelectedItem().toString());

                //Wenn die neueID noch nicht vergeben ist:
                if(!(ServiceLocator.getInstance().getHausliste().raumnummerKollidiert(neueID))){
                    for (Raum r : ServiceLocator.getInstance().getHausliste().getAlleRaeueme()) {
                        if (r.getRaumnummer() == alteID){
                            r.setRaumnummer(neueID);
                            raumbearbeitenBestaetigung.setText("Raumnummer erfolgreich geändert.");
                            return;
                        }
                    }
                }
                //Es gab eine ID-Kollision, also ist die Raumnummer bereits vergeben
                else {
                    raumbearbeitenBestaetigung.setText("Neue Raumnummer ist bereits vergeben. Bitte überprüfen Sie ihre Eingaben!");
                }
            }

        });
        buchenCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Kontrolle, ob Raum und Dozent ausgewählt wurden
                if(buchenDozentSelectInput.getSelectedItem() == null || buchenRaumnummerSelectInput.getSelectedItem() == null){
                    raumsuchenbuchenBestaetigung.setText("Bitte füllen Sie beide Felder aus!");
                    return;
                }

                //Erneutes Einlesen der Zeiten, falls diese in der Zwischenzeit verändert wurden:
                //Wenn ein Kalendar-Feld leer geblieben ist, Fehlermeldung und Methode nicht ausführen
                if (raumsucheStartzeitInput.getText().equals("") || raumsucheEndzeitInput.getText().equals("")){
                    raumsuchenbuchenBestaetigung.setText("Bitte füllen Sie die Zeit-Felder aus!");
                    return;
                }

                //Zeit-Daten umwandeln
                SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
                Calendar start = Calendar.getInstance();
                Calendar ende = Calendar.getInstance();
                try {
                    start.setTime(format.parse(raumsucheStartzeitInput.getText()));

                } catch (ParseException ex) {
                    raumsuchenbuchenBestaetigung.setText("Bitte geben Sie die Startzeit in dem angegebene Format an!");
                    return;
                }
                try {
                    ende.setTime(format.parse(raumsucheEndzeitInput.getText()));
                } catch (ParseException ex) {
                    raumsuchenbuchenBestaetigung.setText("Bitte geben Sie die Endzeit in dem angegebene Format an!");
                    return;
                }

                //Start muss vor Ende liegen
                if(start.after(ende)){
                    raumsuchenbuchenBestaetigung.setText("Die Startzeit muss vor der Endzeit liegen. Bitte überprüfen Sie Ihre Eingaben!");
                    return;
                }

                int raumID = Integer.valueOf(buchenRaumnummerSelectInput.getSelectedItem().toString());
                String dozent = buchenDozentSelectInput.getSelectedItem().toString();

                for(Raum r : ServiceLocator.getInstance().getHausliste().getAlleRaeueme()){
                    if (r.getRaumnummer() == raumID){
                        //Erneuter Kollisions Check, falls Datum verändert wurde. Wenn nun kollidiert, Abbruch und Warnung
                        if (ServiceLocator.getInstance().getHausliste().terminKollidiert(r,start,ende)){
                            raumsuchenbuchenBestaetigung.setText("Sie haben die Buchungsdaten verändert. Zu der angegebenen Zeit ist der gewünschte Raum nicht verfügbar. Bitte aktualisieren Sie die Raumauswahl durch klicken auf 'Räume finden'!");
                            return;
                        }
                        for(Dozent d : ServiceLocator.getInstance().getDozentenListe().getAlleDozenten()){
                            if (d.getName().equals(dozent)){
                                r.buchen(start,ende,d);
                                raumsuchenbuchenBestaetigung.setText("Erfolgreich gebucht. BuchungsID: " + (r.getBuchungen().get(r.getBuchungen().size()-1).getId()));
                                return;
                            }
                        }
                    }
                    raumsuchenbuchenBestaetigung.setText("Unerwarteter Fehler, bitte wiederholen Sie den Buchungsvorgang");
                }

            }
        });
        raumbearbeitenHinzufuegenArtInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                raumbearbeitenHinzufuegenTypInput.removeAllItems();
                switch (raumbearbeitenHinzufuegenArtInput.getSelectedItem().toString()) {
                    case "Beamer" -> {
                        for (BeamerTyp typ : ServiceLocator.getInstance().getBeamerTypen().getAlleBeamerTypen()) {
                            raumbearbeitenHinzufuegenTypInput.addItem(typ.getModell());
                        }
                    }

                    case "Kamera" -> {
                        for (KameraTyp typ : ServiceLocator.getInstance().getKameraTypen().getAlleKameraTypen()) {
                            raumbearbeitenHinzufuegenTypInput.addItem(typ.getModell());
                        }
                    }

                    case "Kreidetafel" -> {
                        for (KreidetafelTyp typ : ServiceLocator.getInstance().getKreideTypen().getAlleKreidetafelTypen()) {
                            raumbearbeitenHinzufuegenTypInput.addItem(typ.getModell());
                        }
                    }

                    case "Lautsprecher" -> {
                        for (LautsprecherTyp typ : ServiceLocator.getInstance().getLautsprecherTypen().getAlleLautsprecherTypen()) {
                            raumbearbeitenHinzufuegenTypInput.addItem(typ.getModell());
                        }
                    }

                    case "Mikrofon" -> {
                        for (MikrofonTyp typ : ServiceLocator.getInstance().getMikrofonTypen().getAlleMikrofonTypen()) {
                            raumbearbeitenHinzufuegenTypInput.addItem(typ.getModell());
                        }
                    }

                    case "PC" -> {
                        for (PCTyp typ : ServiceLocator.getInstance().getPCTypen().getAllePCTypen()) {
                            raumbearbeitenHinzufuegenTypInput.addItem(typ.getModell());
                        }
                    }

                    case "Smartboard" -> {
                        for (SmartboardTyp typ : ServiceLocator.getInstance().getSmartboardTypen().getAlleSmartboardTypen()) {
                            raumbearbeitenHinzufuegenTypInput.addItem(typ.getModell());
                        }
                    }

                    case "Stuhl" -> {
                        for (StuhlTyp typ : ServiceLocator.getInstance().getStuhlTypen().getAlleStuhlTypen()) {
                            raumbearbeitenHinzufuegenTypInput.addItem(typ.getModell());
                        }
                    }

                    case "Tisch" -> {
                        for (TischTyp typ : ServiceLocator.getInstance().getTischTypen().getAlleTischTypen()) {
                            raumbearbeitenHinzufuegenTypInput.addItem(typ.getModell());
                        }
                    }

                    case "Whiteboard" -> {
                        for (WhiteboardTyp typ : ServiceLocator.getInstance().getWhiteboardTypen().getAlleWhiteboardTypen()) {
                            raumbearbeitenHinzufuegenTypInput.addItem(typ.getModell());
                        }
                    }

                    default -> System.out.println("Kp why, aber den Typ geht es nicht.");
                }

            }
        });

        raumbearbeitenHinzufuegenCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Wenn kein Typ gewählt wurde, kann nur beim Starten passieren
                if(raumbearbeitenHinzufuegenTypInput.getSelectedItem() == null || raumbearbeitenHinzufuegenArtInput.getSelectedItem() == null){
                    raumbearbeitenBestaetigung.setText("Bitte wählen Sie Art und Typ aus!");
                    return;
                }

                //Es muss vorher ein Raum gewählt worden sein
                if (raumbearbeitenRaumlisteInput.getSelectedItem() == null){
                    raumbearbeitenBestaetigung.setText("Bitte wählen Sie zuerst einen Raum aus!");
                    return;
                }

                //Initialisierung
                int raumID = Integer.valueOf(raumbearbeitenRaumlisteInput.getSelectedItem().toString());
                String typ = raumbearbeitenHinzufuegenTypInput.getSelectedItem().toString();
                String art = raumbearbeitenHinzufuegenArtInput.getSelectedItem().toString();

                //Im entsprechenden Raum
                for (Raum r : ServiceLocator.getInstance().getHausliste().getAlleRaeueme()) {
                    if (r.getRaumnummer() == raumID){
                        boolean erfolgreich = true;
                    //Entsprechend der Art, dann entsprechend des Typen
                        switch (art) {
                            case "Beamer" -> r.addAusstattung(new Beamer((BeamerTyp) getTyp(typ), Calendar.getInstance()));
                            case "Kamera" -> r.addAusstattung(new Kamera((KameraTyp) getTyp(typ), Calendar.getInstance()));
                            case "Kreidetafel" -> r.addAusstattung(new Kreidetafel((KreidetafelTyp) getTyp(typ), Calendar.getInstance()));
                            case "Lautsprecher" -> r.addAusstattung(new Lautsprecher((LautsprecherTyp) getTyp(typ), Calendar.getInstance()));
                            case "Mikrofon" -> r.addAusstattung(new Mikrofon((MikrofonTyp) getTyp(typ), Calendar.getInstance()));
                            case "PC" -> r.addAusstattung(new PC((PCTyp) getTyp(typ), Calendar.getInstance()));
                            case "Smartboard" -> r.addAusstattung(new Smartboard((SmartboardTyp) getTyp(typ), Calendar.getInstance()));
                            case "Stuhl" -> r.addAusstattung(new Stuhl((StuhlTyp) getTyp(typ), Calendar.getInstance()));
                            case "Tisch" -> r.addAusstattung(new Tisch((TischTyp) getTyp(typ), Calendar.getInstance()));
                            case "Whiteboard" -> r.addAusstattung(new Whiteboard((WhiteboardTyp) getTyp(typ), Calendar.getInstance()));
                            default -> erfolgreich = false;
                        }

                        if(erfolgreich){
                            raumbearbeitenBestaetigung.setText("Ausstattung erfolgreich hinzugefügt.\nAktueller Raumzustand: "+r.toString());
                            return;
                        }
                        else{
                            raumbearbeitenBestaetigung.setText("Unerwarteter Fehler: Der Typ exisitert nicht. Wenden Sie sich bitte an den Systemadmin!");
                            return;
                        }
                    }
                }
                raumbearbeitenBestaetigung.setText("Unerwarteter Fehler: Raum nicht gefunden.");
                return;


            }
        });
        raumbearbeitenRaumlisteInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Aktuelle Ausstattung dem Zustands-DropDown Menu hinzufügen
                raumbearbeitenVeraendernAusstattungInput.removeAllItems();

                if (raumbearbeitenRaumlisteInput.getSelectedItem() != null){
                    int raumID = Integer.valueOf(raumbearbeitenRaumlisteInput.getSelectedItem().toString());

                    for (Raum r : ServiceLocator.getInstance().getHausliste().getAlleRaeueme()) {
                        if(r.getRaumnummer() == raumID){
                            for (Ausstattungsmerkmal a : r.getAusstattung()) {
                                //DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm");
                                //raumbearbeitenVeraendernAusstattungInput.addItem(a.getId() +"\t"+ df.format(a.getAnschaffungsdatum().getTime()));
                                raumbearbeitenVeraendernAusstattungInput.addItem(a.getId());
                                //a.getClass().
                                //TODO @Lukas Modell anzeigen lassen


                            }
                        }

                    }
                }




            }
        });
        raumbearbeitenVeraendernCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ID = Integer.valueOf(raumbearbeitenVeraendernAusstattungInput.getSelectedItem().toString());

                String neuerStatus = raumbearbeitenVeraendernZustandInput.getSelectedItem().toString();

                for (Ausstattungsmerkmal a : ServiceLocator.getInstance().getHausliste().getAlleAusstattungen()) {
                    if(a.getId() == ID){
                        raumbearbeitenBestaetigung.setText("Ausstattung gefunden!");
                        if (neuerStatus.equals("Defekt")){
                            a.gehtKaputt();
                            raumbearbeitenBestaetigung.setText("Ausstattung " + ID + " wurde erfolgreich als defekt eingestuft.");
                        } else if (neuerStatus.equals("Funktionstüchtig")) {
                            a.wirdRepariert();
                            raumbearbeitenBestaetigung.setText("Ausstattung " + ID + " wurde erfolgreich als funktionstüchtig eingestuft.");
                        }
                        return;
                    }

                }

            }
        });
        dozentLoeschenCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dozName = dozentLoeschenDozListe.getSelectedItem().toString();

                for (Dozent d : ServiceLocator.getInstance().getDozentenListe().getAlleDozenten()) {
                    if(d.getName().equals(dozName)){
                        ServiceLocator.getInstance().getDozentenListe().getAlleDozenten().remove(d);
                        dozentLoeschenBestaetigung.setText("Der Dozent " + dozName + " wurde erfolgreich entfernt.");
                        return;
                    }

                }
                dozentLoeschenBestaetigung.setText("Unerwarteter Fehler: Dozent existiert nicht. Bitte wiederholen Sie den Vorgang!");
            }
        });
        dozentHinzufuegenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String neuerDozent = dozentHinzufuegenInput.toString();

                for(Dozent d : ServiceLocator.getInstance().getDozentenListe().getAlleDozenten()){
                    if (d.getName().equals(neuerDozent)){
                        dozentHinzufuegenBestaetigung.setText("Dozent existiert bereits. Bitte wählen Sie einen anderen Namen aus!");
                        return;
                    }
                }
                ServiceLocator.getInstance().getDozentenListe().addDozent(new Dozent(neuerDozent));
                dozentHinzufuegenBestaetigung.setText("Dozent erfolgreich hinzugefügt.");


            }
        });
        dozTerminplanDozAuswahlInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO @Moritz
                /*
                wenn die ComboBox ausgewählt wird, muss sich die Tabelle initialisieren
                 */

                String dozent = dozTerminplanDozAuswahlInput.getSelectedItem().toString();

                for(Dozent d : ServiceLocator.getInstance().getDozentenListe().getAlleDozenten()){
                    if (d.getName().equals(dozent)){
                        System.out.println(d.getMeineBuchungen().size());
                    }
                }

            }
        });
        /**
         * Erstellt ein Dialogfenster zum abfragen, ob vor dem Schließen gespeichert werden soll
         *
         * @author ZanderLK
         */

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //super.windowClosing(e);
                switch (JOptionPane.showConfirmDialog(null,"Möchten Sie die Änderungen vor dem Schließen speichern?","Schließen",JOptionPane.YES_NO_CANCEL_OPTION)){
                    case JOptionPane.YES_OPTION -> {ServiceLocator.getInstance().getPersistenz().speichern("Grunddaten",ServiceLocator.getInstance()); System.exit(0);}
                    case JOptionPane.NO_OPTION -> System.exit(0);
                    //case JOptionPane.CANCEL_OPTION ->

                }
            }
        });

    }

    /**
     * Methode ermittelt den Typ, basierend auf einem String der dem Typennamen entspricht
     *
     * @author ZanderLK
     * @version 1.0.1
     * @since 20220802
     *
     * @param typName
     * @return typ
     */
    public AusstattungsTypIF getTyp(String typName){
        for (BeamerTyp typ : ServiceLocator.getInstance().getBeamerTypen().getAlleBeamerTypen()) {
            if(typ.getModell().equals(typName)){
                return (AusstattungsTypIF) typ;
            }

        }

        for (KreidetafelTyp typ : ServiceLocator.getInstance().getKreideTypen().getAlleKreidetafelTypen()) {
            if(typ.getModell().equals(typName)){
                return (AusstattungsTypIF) typ;
            }

        }

        for (SmartboardTyp typ : ServiceLocator.getInstance().getSmartboardTypen().getAlleSmartboardTypen()) {
            if(typ.getModell().equals(typName)){
                return (AusstattungsTypIF) typ;
            }

        }

        for (TischTyp typ : ServiceLocator.getInstance().getTischTypen().getAlleTischTypen()) {
            if(typ.getModell().equals(typName)){
                return (AusstattungsTypIF) typ;
            }

        }

        for (WhiteboardTyp typ : ServiceLocator.getInstance().getWhiteboardTypen().getAlleWhiteboardTypen()) {
            if(typ.getModell().equals(typName)){
                return (AusstattungsTypIF) typ;
            }

        }

        for (StuhlTyp typ : ServiceLocator.getInstance().getStuhlTypen().getAlleStuhlTypen()) {
            if(typ.getModell().equals(typName)){
                return (AusstattungsTypIF) typ;
            }

        }

        for (KameraTyp typ : ServiceLocator.getInstance().getKameraTypen().getAlleKameraTypen()) {
            if(typ.getModell().equals(typName)){
                return (AusstattungsTypIF) typ;
            }

        }

        for (PCTyp typ : ServiceLocator.getInstance().getPCTypen().getAllePCTypen()) {
            if(typ.getModell().equals(typName)){
                return (AusstattungsTypIF) typ;
            }

        }

        for (MikrofonTyp typ : ServiceLocator.getInstance().getMikrofonTypen().getAlleMikrofonTypen()) {
            if(typ.getModell().equals(typName)){
                return (AusstattungsTypIF) typ;
            }

        }

        for ( LautsprecherTyp typ : ServiceLocator.getInstance().getLautsprecherTypen().getAlleLautsprecherTypen()) {
            if(typ.getModell().equals(typName)){
                return (AusstattungsTypIF) typ;
            }

        }

        return null;
    }

    /**
     * Verbirgt alle Panels, die nicht dauerhaft notwendig sind
     *
     * @author ZanderLK
     * @version 1.1.3
     * @since 20220725
     */
    public void verbergeAllePanels(){
    panelRaumHinzufuegen.setVisible(false);
    panelRaumSuchenBuchen.setVisible(false);
    panelInventur.setVisible(false);
    panelInventarBearbeiten.setVisible(false);
    panelDozentLoeschen.setVisible(false);
    panelDozentenTerminplan.setVisible(false);
    panelStartseite.setVisible(false);
    panelRaumBearbeiten.setVisible(false);
    panelDozentHinzufuegen.setVisible(false);
    panelScrollRaumbearbeiten.setVisible(false);
    panelHausBearbeiten.setVisible(false);
    panelHausHinzufuegen.setVisible(false);
    panelHausLoeschen.setVisible(false);
    }

    private void createUIComponents() {
        //place custom component creation code here
    }
}
//TODO