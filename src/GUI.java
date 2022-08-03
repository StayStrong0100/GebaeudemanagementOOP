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
import java.text.DateFormat;
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
    private JTextField raumbearbeitenRaumIDInput;
    private JButton raumbearbeitenIDÄndernCheck;
    private JLabel raumbearbeitenRaumlisteTitel;
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
    private JTextArea inventurGesamtinventur;
    private JComboBox raumbearbeitenHinzufügenInput;
    private JLabel raumbearbeitenHinzufügenTitel;
    private JLabel raumbearbeitenVerändernTitel;
    private JButton raumbearbeitenHinzufügenCheck;
    private JButton raumbearbeitenVerändernCheck;
    private JComboBox raumbearbeitenHinzufügenTypInput;
    private JComboBox raumbearbeitenHinzufügenArtInput;
    private JComboBox raumbearbeitenRaumlisteInput;
    private JComboBox raumbearbeitenVerändernZustandInput;
    private JComboBox raumbearbeitenVerändernInput;

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
                //raumbearbeitenBestätigung.setText(ServiceLocator.getInstance().getHausliste().toString());
                raumbearbeitenRaumlisteInput.removeAllItems();
                //raumbearbeitenBestätigung.setText(ServiceLocator.getInstance().getHausliste().getAlleRaeueme().size()+"");

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
                inventurGesamtinventur.setText(ServiceLocator.getInstance().getHausliste().inventur());
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
                        anzeige += (r.printRaum());
                        anzeige += ("\n");
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
        raumbearbeitenIDÄndernCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Wenn kein Raum ausgewählt wurde
                if (raumbearbeitenRaumlisteInput.getSelectedItem() == null){
                    raumbearbeitenBestätigung.setText("Bitte wählen Sie einen Raum aus!");
                    return;
                }

                //Wenn neue ID nicht angegeben wurde, Fehlermeldung und Methode nicht ausführen
                if (raumbearbeitenRaumIDNeuInput.getText().equals("")){
                    raumbearbeitenBestätigung.setText("Bitte geben Sie eine neue Raumnummer an!");
                    return;
                }

                //Neue ID einlesen, wenn falsches Format Abbruch
                int neueID;
                try {
                    neueID = Integer.parseInt(raumbearbeitenRaumIDNeuInput.getText());
                }
                catch (NumberFormatException ex){
                    raumbearbeitenBestätigung.setText("Bitte geben Sie eine Zahl ein!");
                    return;
                }

                //Alte ID aus DropDown Menu extrahieren
                int alteID = Integer.valueOf(raumbearbeitenRaumlisteInput.getSelectedItem().toString());

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
        raumbearbeitenHinzufügenArtInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                raumbearbeitenHinzufügenTypInput.removeAllItems();
                switch (raumbearbeitenHinzufügenArtInput.getSelectedItem().toString()) {
                    case "Beamer" -> {
                        for (BeamerTyp typ : ServiceLocator.getInstance().getBeamerTypen().getAlleBeamerTypen()) {
                            raumbearbeitenHinzufügenTypInput.addItem(typ.getModell());
                        }
                    }

                    case "Kamera" -> {
                        for (KameraTyp typ : ServiceLocator.getInstance().getKameraTypen().getAlleKameraTypen()) {
                            raumbearbeitenHinzufügenTypInput.addItem(typ.getModell());
                        }
                    }

                    case "Kreidetafel" -> {
                        for (KreidetafelTyp typ : ServiceLocator.getInstance().getKreideTypen().getAlleKreidetafelTypen()) {
                            raumbearbeitenHinzufügenTypInput.addItem(typ.getModell());
                        }
                    }

                    case "Lautsprecher" -> {
                        for (LautsprecherTyp typ : ServiceLocator.getInstance().getLautsprecherTypen().getAlleLautsprecherTypen()) {
                            raumbearbeitenHinzufügenTypInput.addItem(typ.getModell());
                        }
                    }

                    case "Mikrofon" -> {
                        for (MikrofonTyp typ : ServiceLocator.getInstance().getMikrofonTypen().getAlleMikrofonTypen()) {
                            raumbearbeitenHinzufügenTypInput.addItem(typ.getModell());
                        }
                    }

                    case "PC" -> {
                        for (PCTyp typ : ServiceLocator.getInstance().getPCTypen().getAllePCTypen()) {
                            raumbearbeitenHinzufügenTypInput.addItem(typ.getModell());
                        }
                    }

                    case "Smartboard" -> {
                        for (SmartboardTyp typ : ServiceLocator.getInstance().getSmartboardTypen().getAlleSmartboardTypen()) {
                            raumbearbeitenHinzufügenTypInput.addItem(typ.getModell());
                        }
                    }

                    case "Stuhl" -> {
                        for (StuhlTyp typ : ServiceLocator.getInstance().getStuhlTypen().getAlleStuhlTypen()) {
                            raumbearbeitenHinzufügenTypInput.addItem(typ.getModell());
                        }
                    }

                    case "Tisch" -> {
                        for (TischTyp typ : ServiceLocator.getInstance().getTischTypen().getAlleTischTypen()) {
                            raumbearbeitenHinzufügenTypInput.addItem(typ.getModell());
                        }
                    }

                    case "Whiteboard" -> {
                        for (WhiteboardTyp typ : ServiceLocator.getInstance().getWhiteboardTypen().getAlleWhiteboardTypen()) {
                            raumbearbeitenHinzufügenTypInput.addItem(typ.getModell());
                        }
                    }

                    default -> System.out.println("Kp why, aber den Typ geht es nicht.");
                }

            }
        });

        raumbearbeitenHinzufügenCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Wenn kein Typ gewählt wurde, kann nur beim Starten passieren
                if(raumbearbeitenHinzufügenTypInput.getSelectedItem()==null){
                    raumbearbeitenBestätigung.setText("Bitte wählen Sie einen Typen aus!");
                    return;
                }

                int raumID = Integer.valueOf(raumbearbeitenRaumlisteInput.getSelectedItem().toString());
                String typ = raumbearbeitenHinzufügenTypInput.getSelectedItem().toString();
                String art = raumbearbeitenHinzufügenArtInput.getSelectedItem().toString();

                //Im entsprechenden Raum
                for (Raum r : ServiceLocator.getInstance().getHausliste().getAlleRaeueme()) {
                    if (r.getRaumnummer() == raumID){
                        boolean hinzugefügt = true;
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
                            default -> hinzugefügt = false;
                        }

                        if(hinzugefügt){
                            raumbearbeitenBestätigung.setText("Ausstattung erfolgreich hinzugefügt.\nAktueller Raumzustand: "+r.toString());
                        }
                        else{
                            raumbearbeitenBestätigung.setText("Unerwarteter Fehler: Der Typ exisitert nicht. Wenden Sie sich bitte an den Systemadmin!");
                        }





                    }
                    return;

                }

            }
        });
        raumbearbeitenRaumlisteInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Aktuelle Ausstattung dem Zustands-DropDown Menu hinzufügen
                int raumID = Integer.valueOf(raumbearbeitenRaumlisteInput.getSelectedItem().toString());

                for (Raum r : ServiceLocator.getInstance().getHausliste().getAlleRaeueme()) {
                    if(r.getRaumnummer() == raumID){
                        for (Ausstattungsmerkmal a : r.getAusstattung()) {
                            //DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm");
                            //raumbearbeitenVerändernInput.addItem(a.getId() +"\t"+ df.format(a.getAnschaffungsdatum().getTime()));
                            raumbearbeitenVerändernInput.addItem(a.getId());
                            //TODO Modell anzeigen lassen


                        }
                    }

                }
            }
        });
        raumbearbeitenVerändernCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ID = Integer.valueOf(raumbearbeitenVerändernInput.getSelectedItem().toString());

                String neuerStatus = raumbearbeitenVerändernZustandInput.getSelectedItem().toString();

                for (Ausstattungsmerkmal a : ServiceLocator.getInstance().getHausliste().getAlleAusstattungen()) {
                    if(a.getId() == ID){
                        if (neuerStatus.equals("Defekt")){
                            a.gehtKaputt();
                            raumbearbeitenBestätigung.setText("Ausstattung " + ID + " wurde erfolgreich als defekt eingestuft.");
                        } else if (neuerStatus.equals("Funktionstüchtig")) {
                            a.wirdRepariert();
                            raumbearbeitenBestätigung.setText("Ausstattung " + ID + " wurde erfolgreich als funktionstüchtig eingestuft.");
                        }
                        return;
                    }

                }

            }
        });
    }

    /**
     * @deprecated Alte Version, um den Typ zu ermitteln
     * @param typName
     * @return
     */
    /*
    public AusstattungsTypIF getTyp(String typName){
        switch (typName){
            case "T26","P5530","X100-4k":
                for (BeamerTyp typ : ServiceLocator.getInstance().getBeamerTypen().getAlleBeamerTypen()) {
                    if(typ.getModell().equals(typName)){
                        return (AusstattungsTypIF) typ;
                    }

                }
                break;

            case "Kreide250", "Kreide220", "Kreide200":
                for (KreidetafelTyp typ : ServiceLocator.getInstance().getKreideTypen().getAlleKreidetafelTypen()) {
                    if(typ.getModell().equals(typName)){
                        return (AusstattungsTypIF) typ;
                    }

                }
                break;

            case "MX255 PRO", "Lite PRO":
                for (SmartboardTyp typ : ServiceLocator.getInstance().getSmartboardTypen().getAlleSmartboardTypen()) {
                    if(typ.getModell().equals(typName)){
                        return (AusstattungsTypIF) typ;
                    }

                }
                break;

            case "BasicTisch", "Doppeltisch", "PCGroß", "PCUltraKomfort":
                for (TischTyp typ : ServiceLocator.getInstance().getTischTypen().getAlleTischTypen()) {
                    if(typ.getModell().equals(typName)){
                        return (AusstattungsTypIF) typ;
                    }

                }
                break;

            case "WhiteSuper", "WhitePro", "WhiteBasic":
                for (WhiteboardTyp typ : ServiceLocator.getInstance().getWhiteboardTypen().getAlleWhiteboardTypen()) {
                    if(typ.getModell().equals(typName)){
                        return (AusstattungsTypIF) typ;
                    }

                }
                break;


            case "Dynamic", "Static":
                for (StuhlTyp typ : ServiceLocator.getInstance().getStuhlTypen().getAlleStuhlTypen()) {
                    if(typ.getModell().equals(typName)){
                        return (AusstattungsTypIF) typ;
                    }

                }
                break;


            case "Streamcam", "Full HD Webcam":
                for (KameraTyp typ : ServiceLocator.getInstance().getKameraTypen().getAlleKameraTypen()) {
                    if(typ.getModell().equals(typName)){
                        return (AusstattungsTypIF) typ;
                    }

                }
                break;

            case "", "", "":
                for ( typ : ServiceLocator.getInstance().) {
                    if(typ.getModell().equals(typName)){
                        return (AusstattungsTypIF) typ;
                    }

                }
                break;


            case "", "", "":
                for ( typ : ServiceLocator.getInstance().) {
                    if(typ.getModell().equals(typName)){
                        return (AusstattungsTypIF) typ;
                    }

                }
                break;

            case "", "", "":
                for ( typ : ServiceLocator.getInstance().) {
                    if(typ.getModell().equals(typName)){
                        return (AusstattungsTypIF) typ;
                    }

                }
                break;

            default -> return null;
        }


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

    private void createUIComponents() {
        //place custom component creation code here
    }
}
