import ausstattung.*;
import buchung.*;
import serviceLocator.*;
import verwaltung.*;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;

/**
 * Die Definition der GUI Klasse, innerhalb dieser wird alles definiert und gesteuert, was für das Userinterface notwendig ist
 *
 * @author Moritz Limberg und Lukas Zander
 */
public class GUI extends JFrame {
    //Komponenten der Menüstruktur
    private JMenuBar hauptMenue = new JMenuBar();

    private JMenu hausMenue = new JMenu("Haus");
    private JMenu raumMenue = new JMenu("Raum");
    private JMenu inventur = new JMenu("Inventur");
    private JMenu dozentenMenue = new JMenu("Dozenten");

    private JMenuItem hausHinzufuegen = new JMenuItem("Haus hinzufügen");
    private JMenuItem hausBearbeiten = new JMenuItem("Haus bearbeiten");
    private JMenuItem hausLoeschen = new JMenuItem("Haus löschen");

    private JMenuItem raumHinzufuegen = new JMenuItem("Raum hinzufügen");
    private JMenuItem raumSuchenUndBuchen = new JMenuItem("Raum suchen und buchen");
    private JMenuItem raumBearbeiten = new JMenuItem("Raum bearbeiten");
    private JMenuItem raumEntblocken = new JMenuItem("Raum entblocken");
    private JMenuItem raumLoeschen = new JMenuItem("Raum loeschen");

    private JMenuItem dozentTerminplan = new JMenuItem("Dozenten Terminplan");
    private JMenuItem dozentHinzufuegen = new JMenuItem("Dozent hinzufügen");
    private JMenuItem dozentBearbeiten = new JMenuItem(("Dozent bearbeiten"));
    private JMenuItem dozentLoeschen = new JMenuItem("Dozent löschen");

    /**
     * Es folgt die Definition der einzelnen Elemente auf den verschiedenen Seiten
     */
    //Panels
    private JPanel panelMain;
    private JPanel panelRaumHinzufuegen;
    private JPanel panelRaumSuchenBuchen;
    private JPanel panelInventur;
    private JPanel panelDozentLoeschen;
    private JPanel panelDozentenTerminplan;
    private JPanel panelFooter;
    private JPanel panelStartseite;
    private JPanel panelDozentHinzufuegen;
    private JPanel panelRaumBearbeiten;
    private JPanel panelHausLoeschen;
    private JPanel panelHausBearbeiten;
    private JPanel panelHausHinzufuegen;
    private JPanel panelRaumEntblocken;
    private JPanel panelRaumLoeschen;
    private JPanel panelDozentBearbeiten;

    //Labels
    private JLabel raumHinzufuegenTitel;
    private JLabel dozTerminplanTitel;
    private JLabel dozentLoeschenTitel;
    private JLabel raumsucheTitel;
    private JLabel startseiteTitel;
    private JLabel startseiteBild;
    private JLabel footerContent;
    private JLabel raumsucheStartTitel;
    private JLabel raumsucheEndeTitel;
    private JLabel raumsucheTischeTitel;
    private JLabel raumsucheStuehleTitel;
    private JLabel raumsucheBeamerTitel;
    private JLabel raumsucheKamerasTitel;
    private JLabel raumsuchePCTitel;
    private JLabel raumsucheLautsprecherTitel;
    private JLabel raumsucheSmartboardTitel;
    private JLabel raumsucheKreidetafelTitel;
    private JLabel raumsucheWhiteboardTitel;
    private JLabel raumsucheMikrofoneTitel;
    private JLabel raumHinzufuegenNummerTitel;
    private JLabel raumHinzufuegenHausTitel;
    private JLabel raumbearbeitenTitel;
    private JLabel dozentHinzufuegenTitel;
    private JLabel raumbearbeitenRaumlisteTitel;
    private JLabel raumbearbeitenRaumIDNeuTitel;
    private JLabel buchenRaumnummerTitel;
    private JLabel buchenDozentTitel;
    private JLabel inventurTitel;
    private JLabel dozentHinzufuegenInputTitel;
    private JLabel dozTerminplanDozAuswahlTitel;
    private JLabel raumbearbeitenHinzufuegenTitel;
    private JLabel raumbearbeitenVeraendernTitel;
    private JLabel dozentLoeschenNameTitel;
    private JLabel hausLoeschenTitel;
    private JLabel hausBearbeitenTitel;
    private JLabel hausHinzufuegenTitel;
    private JLabel raumbearbeitenHinzufuegenArtTitel;
    private JLabel raumbearbeitenHinzufuegenModellTitel;
    private JLabel raumbearbeitenHinzufuegenAnzahlTitel;
    private JLabel hausLoeschenHausTitel;
    private JLabel hausBearbeitenHausTitel;
    private JLabel hausBearbeitenBarrierefreiTitel;
    private JLabel hausBearbeitenNeueIDTitel;
    private JLabel hausHinzufuegenIDTitel;
    private JLabel hausHinzufuegenBarrierefreiTitel;
    private JLabel raumEntblockenTitel;
    private JLabel raumEntblockenRaumTitel;
    private JLabel raumEntblockenTerminTitel;
    private JLabel raumLoeschenTitel;
    private JLabel raumLoeschenIDInputTitel;
    private JLabel dozentBearbeitenTitel;
    private JLabel dozentBearbeitenDozAuswahlTitel;
    private JLabel dozentBearbeitenNameInputTitel;

    //TextFields
    private JTextField raumsucheStartzeitInput;
    private JTextField raumsucheEndzeitInput;
    private JTextField raumsucheTischeInput;
    private JTextField raumsucheStuehleInput;
    private JTextField raumsucheBeamerInput;
    private JTextField raumsucheKamerasInput;
    private JTextField raumsuchePCInput;
    private JTextField raumsucheLautsprecherInput;
    private JTextField raumsucheKreidetafelnInput;
    private JTextField raumsucheSmartboardInput;
    private JTextField raumsucheWhiteboardsInput;
    private JTextField raumsucheMikrofoneInput;
    private JTextField raumHinzufuegenNummerInput;
    private JTextField raumbearbeitenRaumIDNeuInput;
    private JTextField dozentHinzufuegenInput;
    private JTextField hausBearbeitenNeueIDInput;
    private JTextField hausHinzufuegenIDInput;
    private JTextField dozentBearbeitenNameInput;

    //Buttons
    private JButton raumsucheSuchen;
    private JButton raumHinzufuegenButton;
    private JButton raumbearbeitenIDAendernCheck;
    private JButton buchenCheck;
    private JButton raumbearbeitenHinzufuegenCheck;
    private JButton raumbearbeitenVeraendernCheck;
    private JButton dozentHinzufuegenButton;
    private JButton dozentLoeschenCheck;
    private JButton hausloeschenCheck;
    private JButton hausBearbeitenCheck;
    private JButton hausHinzufuegenCheck;
    private JButton raumEntblockenCheck;
    private JButton raumLoeschenCheck;
    private JButton dozentBearbeitenCheck;

    //TextAreas
    private JTextArea raumHinzufuegenBestaetigung;
    private JTextArea raumbearbeitenBestaetigung;
    private JTextArea raumsuchenbuchenBestaetigung;
    private JTextArea dozentHinzufuegenBestaetigung;
    private JTextArea inventurBestaetigung;
    private JTextArea dozentLoeschenBestaetigung;
    private JTextArea hausloeschenBestaetigung;
    private JTextArea hausBearbeitenBestaetigung;
    private JTextArea hausHinzufuegenBestaetigung;
    private JTextArea raumEntblockenBestaetigung;
    private JTextArea raumLoeschenBestaetigung;
    private JTextArea dozentBearbeitenBestaetigung;
    private JTextArea dozTerminplanBestaetigung;

    //ComboBoxes (Drop Down Liste)
    private JComboBox raumbearbeitenHinzufuegenTypInput;
    private JComboBox raumbearbeitenHinzufuegenArtInput;
    private JComboBox raumbearbeitenRaumlisteInput;
    private JComboBox raumbearbeitenVeraendernZustandInput;
    private JComboBox raumbearbeitenVeraendernAusstattungInput;
    private JComboBox buchenRaumnummerSelectInput;
    private JComboBox buchenDozentSelectInput;
    private JComboBox raumHinzufuegenHausInput;
    private JComboBox dozentLoeschenDozListe;
    private JComboBox hausloeschenHausInput;
    private JComboBox dozTerminplanDozAuswahlInput;
    private JComboBox hausBearbeitenHausInput;
    private JComboBox raumEntblockenRaumInput;
    private JComboBox raumEntblockenTerminInput;
    private JComboBox raumLoeschenIDInput;
    private JComboBox dozentBearbeitenDozAuswahlInput;

    //ScrollPanes
    private JScrollPane ScrollRaumbearbeiten;
    private JScrollPane ScrollDozTerminplanBestaetigung;

    //Seperators
    private JSeparator raumbearbeitenSeperator;
    private JSeparator hausLoeschenTitelSeperator;
    private JSeparator hausBearbeitenTitelSeperator;
    private JSeparator hausHinzufuegenTitelSeperator;
    private JSeparator inventurTitelSeperator;
    private JSeparator raumbearbeitenTitelSeperator;
    private JSeparator raumbearbeitenAusstattungSeperator;
    private JSeparator raumbearbeitenWaehlenSeperator;
    private JSeparator raumbearbeitenNummerSeperator;
    private JSeparator raumEntblockenTitelSeparator;
    private JSeparator raumsucheTitelSeperator;
    private JSeparator dozentHinzufuegenTitelSeparator;
    private JSeparator dozentLoeschenTitelSeparator;
    private JSeparator raumLoeschenTitelSeperator;
    private JSeparator dozentBearbeitenTitelSeperatior;
    private JSeparator dozTerminplanTitelSeperator;

    //Spinner
    private JSpinner raumbearbeitenHinzufuegenAnzahl;

    //CheckBox
    private JCheckBox hausBearbeitenBarriefreiInput;
    private JCheckBox hausHinzufuegenBarrierefreInput;

    /**
     * Es folgt der GUI Konstruktor, in diesem werden alle Konfigurationen der GUI vorgenommen
     *
     */

    public GUI() {
        //Menü erstellen und verbinden
        hauptMenue.add(hausMenue);
        hauptMenue.add(raumMenue);
        hauptMenue.add(inventur);
        hauptMenue.add(dozentenMenue);

        hausMenue.add(hausHinzufuegen);
        hausMenue.add(hausBearbeiten);
        hausMenue.add(hausLoeschen);

        raumMenue.add(raumHinzufuegen);
        raumMenue.add(raumSuchenUndBuchen);
        raumMenue.add(raumBearbeiten);
        raumMenue.add(raumEntblocken);
        raumMenue.add(raumLoeschen);

        dozentenMenue.add(dozentTerminplan);
        dozentenMenue.add(dozentHinzufuegen);
        dozentenMenue.add(dozentBearbeiten);
        dozentenMenue.add(dozentLoeschen);

        //Konfiguration des sich öffnenden Fensters
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //damit Speicher-Dialog geöffnet wird
        this.setMinimumSize(new Dimension(500, 500));
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        hauptMenue.setVisible(true);
        this.setJMenuBar(hauptMenue);
        this.setContentPane(panelMain);
        this.setVisible(true);
        verbergeAllePanels();
        panelStartseite.setVisible(true);

        /**
         * Action Listener für Seitenaufruf "Haus hinzufügen"
         * Es werden alle Panels versteckt und nur das Panel "Haus hinzufügen" wird angezeigt
         */
        hausHinzufuegen.addActionListener(e -> {
            verbergeAllePanels();
            panelHausHinzufuegen.setVisible(true);
        });

        /**
         * Action Listener für Seitenaufruf "Haus bearbeiten"
         * Es werden alle Panels versteckt und nur das Panel "Haus bearbeiten" wird angezeigt
         * Initialisierung der Auswahlliste (ComboBox) für die Häuser
         */
        hausBearbeiten.addActionListener(e -> {
            verbergeAllePanels();
            panelHausBearbeiten.setVisible(true);
            hausBearbeitenHausInput.removeAllItems();
            for(Haus h : ServiceLocator.getInstance().getHausliste().getAlleHaeuser()){
                hausBearbeitenHausInput.addItem(h.getHausnummer());
            }
        });

        /**
         * Action Listener für Seitenaufruf "Haus löschen"
         * Es werden alle Panels versteckt und nur das Panel "Haus löschen" wird angezeigt
         * Initialisierung der Auswahlliste (ComboBox) für die Häuser
         */
        hausLoeschen.addActionListener(e -> {
            verbergeAllePanels();
            panelHausLoeschen.setVisible(true);
            hausloeschenHausInput.removeAllItems();
            for(Haus h : ServiceLocator.getInstance().getHausliste().getAlleHaeuser()){
                hausloeschenHausInput.addItem(h.getHausnummer());
            }
        });

        /**
         * Action Listener für Seitenaufruf "Raum hinzufügen"
         * Es werden alle Panels versteckt und nur das Panel "Raum hinzufügen" wird angezeigt
         * Initialisierung der Auswahlliste (ComboBox) für die Häuser (in dem dann der Raum ergänzt werden soll)
         */
        raumHinzufuegen.addActionListener(e -> {
            verbergeAllePanels();
            panelRaumHinzufuegen.setVisible(true);
            raumHinzufuegenHausInput.removeAllItems();
            for (Haus h : ServiceLocator.getInstance().getHausliste().getAlleHaeuser()) {
                raumHinzufuegenHausInput.addItem(h.getHausnummer());
            }
        });

        /**
         * Action Listener für Seitenaufruf "Raum suchen und buchen"
         * Es werden alle Panels versteckt und nur das Panel "Raum suchen und buchen" wird angezeigt
         */
        raumSuchenUndBuchen.addActionListener(e -> {
            verbergeAllePanels();
            panelRaumSuchenBuchen.setVisible(true);
        });

        /**
         * Action Listener für Seitenaufruf "Raum bearbeiten"
         * Es werden alle Panels versteckt und nur das Panel und ScrollArea "Raum bearbeiten" wird angezeigt
         * Sortierte Initialisierung der Auswahlliste (ComboBox) für die Räume
         *
         *
         */
        raumBearbeiten.addActionListener(e -> {
            verbergeAllePanels();
            ScrollRaumbearbeiten.setVisible(true);
            panelRaumBearbeiten.setVisible(true);

            raumbearbeitenRaumlisteInput.removeAllItems();

            ArrayList<Integer> alleRaumnummern = new ArrayList<>();
            for (Raum r : ServiceLocator.getInstance().getHausliste().getAlleRaeume()) {
                alleRaumnummern.add(r.getRaumnummer());
            }
            alleRaumnummern.sort(null);

            for (Integer ID : alleRaumnummern) {
                raumbearbeitenRaumlisteInput.addItem(ID.toString());
            }

        });

        /**
         * Action Listener für Seitenaufruf "Raum entblocken"
         * Es werden alle Panels versteckt und nur das Panel "Raum entblocken" wird angezeigt
         * Initialisierung der Auswahlliste (ComboBox) für die Räume, dabei werden nur die Räume angezeigt, die irgendwann gebucht sind
         */
        raumEntblocken.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verbergeAllePanels();
                panelRaumEntblocken.setVisible(true);
                raumEntblockenRaumInput.removeAllItems();
                for(Raum r : ServiceLocator.getInstance().getHausliste().getAlleRaeume()){
                    if(r.getBuchungen().size() > 0){
                        raumEntblockenRaumInput.addItem(r.getRaumnummer());
                    }
                }
            }
        });

        /**
         * Action Listener für Seitenaufruf "Raum löschen"
         * Es werden alle Panels versteckt und nur das Panel "Raum löschen" wird angezeigt
         * Initialisierung der Auswahlliste (ComboBox) für die Räume
         */
        raumLoeschen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verbergeAllePanels();
                panelRaumLoeschen.setVisible(true);
                raumLoeschenIDInput.removeAllItems();
                for (Raum r : ServiceLocator.getInstance().getHausliste().getAlleRaeume()){
                    raumLoeschenIDInput.addItem(r.getRaumnummer());
                }
            }
        });

        /**
         * Action Listener für Seitenaufruf "Inventur"
         * Es werden alle Panels versteckt und nur das Panel "Inventur" wird angezeigt
         * Die Inventur wird direkt durchgeführt und angezeigt
         *
         * Hinweis: andere Listener-Struktur, weil diesmal Obermenüpunkt
         */
        inventur.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                verbergeAllePanels();
                panelInventur.setVisible(true);
                inventurBestaetigung.setText(ServiceLocator.getInstance().getHausliste().inventur());
            }

            @Override
            public void menuDeselected(MenuEvent e) {

            }

            @Override
            public void menuCanceled(MenuEvent e) {

            }
        });

        dozentLoeschen.addActionListener(e -> {
            verbergeAllePanels();
            panelDozentLoeschen.setVisible(true);
            dozentLoeschenDozListe.removeAllItems();
            for (Dozent d : ServiceLocator.getInstance().getDozentenListe().getAlleDozenten()) {
                dozentLoeschenDozListe.addItem(d.getName());
            }
        });

        dozentTerminplan.addActionListener(e -> {
            verbergeAllePanels();
            panelDozentenTerminplan.setVisible(true);
            dozTerminplanDozAuswahlInput.removeAllItems();
            for (Dozent d : ServiceLocator.getInstance().getDozentenListe().getAlleDozenten()) {
                dozTerminplanDozAuswahlInput.addItem(d.getName());
            }

        });

        dozentHinzufuegen.addActionListener(e -> {
            verbergeAllePanels();
            panelDozentHinzufuegen.setVisible(true);

        });

        dozentBearbeiten.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verbergeAllePanels();
                panelDozentBearbeiten.setVisible(true);
                dozentBearbeitenDozAuswahlInput.removeAllItems();

                ServiceLocator.getInstance().getDozentenListe().getAlleDozenten().sort(new Comparator<Dozent>() {
                    @Override
                    public int compare(Dozent o1, Dozent o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                });

                for(Dozent d : ServiceLocator.getInstance().getDozentenListe().getAlleDozenten()){
                    dozentBearbeitenDozAuswahlInput.addItem(d.getName());
                }
            }
        });

        //Es folgen Action Listener, die bei Buttons ausgeführt werden
        raumsucheSuchen.addActionListener(e -> {
            //Felder leeren von vorherigen Durchläufen
            raumsuchenbuchenBestaetigung.setText("");
            buchenRaumnummerSelectInput.removeAllItems();
            buchenDozentSelectInput.removeAllItems();

            //Wenn ein Kalendar-Feld leer geblieben ist, Fehlermeldung und Methode nicht ausführen
            if (raumsucheStartzeitInput.getText().equals("") || raumsucheEndzeitInput.getText().equals("")) {
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
            if (start.after(ende)) {
                raumsuchenbuchenBestaetigung.setText("Die Startzeit muss vor der Endzeit liegen. Bitte überprüfen Sie Ihre Eingaben!");
                return;
            }

            //Ausstattungs-Daten auslesen, wenn kein Wert eingeben wurde: Anzahl = 0
            int minKameras = (raumsucheKamerasInput.getText().equals("")) ? 0 : Integer.valueOf(raumsucheKamerasInput.getText());
            int minBeamer = (raumsucheBeamerInput.getText().equals("")) ? 0 : Integer.valueOf(raumsucheBeamerInput.getText());
            int minLautsprecher = (raumsucheLautsprecherInput.getText().equals("")) ? 0 : Integer.valueOf(raumsucheLautsprecherInput.getText());
            int minMikrofone = (raumsucheMikrofoneInput.getText().equals("")) ? 0 : Integer.valueOf(raumsucheMikrofoneInput.getText());
            int minPCs = (raumsuchePCInput.getText().equals("")) ? 0 : Integer.valueOf(raumsuchePCInput.getText());
            int minTische = (raumsucheTischeInput.getText().equals("")) ? 0 : Integer.valueOf(raumsucheTischeInput.getText());
            int minStuehle = (raumsucheStuehleInput.getText().equals("")) ? 0 : Integer.valueOf(raumsucheStuehleInput.getText());
            int minSmartboards = (raumsucheSmartboardInput.getText().equals("")) ? 0 : Integer.valueOf(raumsucheSmartboardInput.getText());
            int minWhiteboards = (raumsucheWhiteboardsInput.getText().equals("")) ? 0 : Integer.valueOf(raumsucheWhiteboardsInput.getText());
            int minKreidetafeln = (raumsucheKreidetafelnInput.getText().equals("")) ? 0 : Integer.valueOf(raumsucheKreidetafelnInput.getText());

            //Filter nach Zeit
            ArrayList<Raum> freieRaueme = ServiceLocator.getInstance().getHausliste().filtereRaeumeVerfuegbar(start, ende);

            //Filter nach Ausstattung
            ArrayList<Raum> perfekteRaueme = ServiceLocator.getInstance().getHausliste().filtereRaeumeAusstattung(freieRaueme, minBeamer, minKameras, minKreidetafeln, minLautsprecher, minMikrofone, minPCs, minSmartboards, minStuehle, minTische, minWhiteboards);

            if (perfekteRaueme.size() == 0) {
                raumsuchenbuchenBestaetigung.setText("Es gibt keine passenden Räume, bitte verändern Sie Ihre Suchkriterien!");
            } else {
                //Gefundene Räume in den DropDownMenus zum Buchen anzeigen
                for (Raum r : perfekteRaueme) {
                    buchenRaumnummerSelectInput.addItem(r.getRaumnummer());
                }
                //Dozenten Auswahl
                for (Dozent d : ServiceLocator.getInstance().getDozentenListe().getAlleDozenten()) {
                    buchenDozentSelectInput.addItem(d.getName());
                }
                raumsuchenbuchenBestaetigung.setText("Bitte wählen Sie einen Raum und einen Dozenten aus!");

            }
        });
        raumHinzufuegenButton.addActionListener(e -> {
            //Wenn ein Feld leer geblieben ist, Fehlermeldung und Methode nicht ausführen
            if (raumHinzufuegenNummerInput.getText().equals("") || raumHinzufuegenHausInput.getSelectedItem() == null) {
                raumHinzufuegenBestaetigung.setText("Bitte füllen Sie beide Felder aus!");
                return;
            }

            int raumID = Integer.valueOf(raumHinzufuegenNummerInput.getText());
            String hausID = raumHinzufuegenHausInput.getSelectedItem().toString();
            //Prüfe, ob ID bereits vergeben ist
            if (ServiceLocator.getInstance().getHausliste().raumnummerKollidiert(raumID)) {
                raumHinzufuegenBestaetigung.setText("Die Raumnummer ist bereits vergeben, bitte wählen Sie eine andere!");
                return;
            }

            //wenn keine Kollision: Im entsprechenden Haus addRaum
            else {
                for (Haus h : ServiceLocator.getInstance().getHausliste().getAlleHaeuser()) {
                    if (h.getHausnummer() == hausID) {
                        h.addRaum(new Raum(raumID));
                        raumHinzufuegenBestaetigung.setText("Neuer Raum angelegt: Haus " + hausID + " Raum: " + raumID);
                        raumHinzufuegen.doClick();
                        return;
                    }
                }
                raumHinzufuegenBestaetigung.setText("Unerwarteter Fehler: Haus existiert nicht. Bitte wiederholen Sie den Vorgang!");
            }
        });
        raumbearbeitenIDAendernCheck.addActionListener(e -> {
            //Wenn kein Raum ausgewählt wurde
            if (raumbearbeitenRaumlisteInput.getSelectedItem() == null) {
                raumbearbeitenBestaetigung.setText("Bitte wählen Sie einen Raum aus!");
                return;
            }

            //Wenn neue ID nicht angegeben wurde, Fehlermeldung und Methode nicht ausführen
            if (raumbearbeitenRaumIDNeuInput.getText().equals("")) {
                raumbearbeitenBestaetigung.setText("Bitte geben Sie eine neue Raumnummer an!");
                return;
            }

            //Neue ID einlesen, wenn falsches Format Abbruch
            int neueID;
            try {
                neueID = Integer.parseInt(raumbearbeitenRaumIDNeuInput.getText());
            } catch (NumberFormatException ex) {
                raumbearbeitenBestaetigung.setText("Bitte geben Sie eine Zahl ein!");
                return;
            }

            //Alte ID aus DropDown Menu extrahieren
            int alteID = Integer.valueOf(raumbearbeitenRaumlisteInput.getSelectedItem().toString());

            //Wenn die neueID noch nicht vergeben ist:
            if (!(ServiceLocator.getInstance().getHausliste().raumnummerKollidiert(neueID))) {
                for (Raum r : ServiceLocator.getInstance().getHausliste().getAlleRaeume()) {
                    if (r.getRaumnummer() == alteID) {
                        r.setRaumnummer(neueID);
                        raumbearbeitenBestaetigung.setText("Raumnummer erfolgreich geändert.");
                        raumBearbeiten.doClick();
                        return;
                    }
                }
            }
            //Es gab eine ID-Kollision, also ist die Raumnummer bereits vergeben
            else {
                raumbearbeitenBestaetigung.setText("Neue Raumnummer ist bereits vergeben. Bitte überprüfen Sie ihre Eingaben!");
            }
        });
        buchenCheck.addActionListener(e -> {
            //Kontrolle, ob Raum und Dozent ausgewählt wurden
            if (buchenDozentSelectInput.getSelectedItem() == null || buchenRaumnummerSelectInput.getSelectedItem() == null) {
                raumsuchenbuchenBestaetigung.setText("Bitte füllen Sie beide Felder aus!");
                return;
            }

            //Erneutes Einlesen der Zeiten, falls diese in der Zwischenzeit verändert wurden:
            //Wenn ein Kalendar-Feld leer geblieben ist, Fehlermeldung und Methode nicht ausführen
            if (raumsucheStartzeitInput.getText().equals("") || raumsucheEndzeitInput.getText().equals("")) {
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
            if (start.after(ende)) {
                raumsuchenbuchenBestaetigung.setText("Die Startzeit muss vor der Endzeit liegen. Bitte überprüfen Sie Ihre Eingaben!");
                return;
            }

            int raumID = Integer.valueOf(buchenRaumnummerSelectInput.getSelectedItem().toString());
            String dozent = buchenDozentSelectInput.getSelectedItem().toString();

            for (Raum r : ServiceLocator.getInstance().getHausliste().getAlleRaeume()) {
                if (r.getRaumnummer() == raumID) {
                    //Erneuter Kollisions Check, falls Datum verändert wurde. Wenn nun kollidiert, Abbruch und Warnung
                    if (ServiceLocator.getInstance().getHausliste().terminKollidiert(r, start, ende)) {
                        raumsuchenbuchenBestaetigung.setText("Sie haben die Buchungsdaten verändert. Zu der angegebenen Zeit ist der gewünschte Raum nicht verfügbar. Bitte aktualisieren Sie die Raumauswahl durch klicken auf 'Räume finden'!");
                        return;
                    }
                    for (Dozent d : ServiceLocator.getInstance().getDozentenListe().getAlleDozenten()) {
                        if (d.getName().equals(dozent)) {
                            r.buchen(start, ende, d);
                            raumsuchenbuchenBestaetigung.setText("Erfolgreich gebucht. BuchungsID: " + (r.getBuchungen().get(r.getBuchungen().size() - 1).getId()));
                            raumSuchenUndBuchen.doClick();
                            return;
                        }
                    }
                }
                raumsuchenbuchenBestaetigung.setText("Unerwarteter Fehler, bitte wiederholen Sie den Buchungsvorgang");
            }

        });
        raumbearbeitenHinzufuegenArtInput.addActionListener(e -> {
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

        });

        raumbearbeitenHinzufuegenCheck.addActionListener(e -> {
            //Wenn kein Typ gewählt wurde, kann nur beim Starten passieren
            if (raumbearbeitenHinzufuegenTypInput.getSelectedItem() == null || raumbearbeitenHinzufuegenArtInput.getSelectedItem() == null) {
                raumbearbeitenBestaetigung.setText("Bitte wählen Sie Art und Typ aus!");
                return;
            }

            //Es muss vorher ein Raum gewählt worden sein
            if (raumbearbeitenRaumlisteInput.getSelectedItem() == null) {
                raumbearbeitenBestaetigung.setText("Bitte wählen Sie zuerst einen Raum aus!");
                return;
            }

            int anzahlElemente = Integer.parseInt(raumbearbeitenHinzufuegenAnzahl.getValue().toString());

            if (anzahlElemente < 1) {
                    raumbearbeitenBestaetigung.setText("Bitte geben Sie eine positive Anzahl von hinzuzufügenden Ausstattungsgegenständen ein!");
                    raumbearbeitenHinzufuegenAnzahl.setValue(1);
                    return;
            }

            //Initialisierung
            int raumID = Integer.valueOf(raumbearbeitenRaumlisteInput.getSelectedItem().toString());
            String typ = raumbearbeitenHinzufuegenTypInput.getSelectedItem().toString();
            String art = raumbearbeitenHinzufuegenArtInput.getSelectedItem().toString();

            //So oft wie gewünscht hinzufügen
            for (int i = 0; i < anzahlElemente; i++) {
                boolean erfolgreich = true;
                //Im entsprechenden Raum
                if(ServiceLocator.getInstance().getHausliste().getAlleRaeume().size() == 0){
                    erfolgreich = false;
                }
                for (Raum r : ServiceLocator.getInstance().getHausliste().getAlleRaeume()) {
                    if (r.getRaumnummer() == raumID) {

                        //Entsprechend der Art, dann entsprechend des Typen
                        switch (art) {
                            case "Beamer" ->
                                    r.addAusstattung(new Beamer((BeamerTyp) getTyp(typ), Calendar.getInstance()));
                            case "Kamera" ->
                                    r.addAusstattung(new Kamera((KameraTyp) getTyp(typ), Calendar.getInstance()));
                            case "Kreidetafel" ->
                                    r.addAusstattung(new Kreidetafel((KreidetafelTyp) getTyp(typ), Calendar.getInstance()));
                            case "Lautsprecher" ->
                                    r.addAusstattung(new Lautsprecher((LautsprecherTyp) getTyp(typ), Calendar.getInstance()));
                            case "Mikrofon" ->
                                    r.addAusstattung(new Mikrofon((MikrofonTyp) getTyp(typ), Calendar.getInstance()));
                            case "PC" -> r.addAusstattung(new PC((PCTyp) getTyp(typ), Calendar.getInstance()));
                            case "Smartboard" ->
                                    r.addAusstattung(new Smartboard((SmartboardTyp) getTyp(typ), Calendar.getInstance()));
                            case "Stuhl" -> r.addAusstattung(new Stuhl((StuhlTyp) getTyp(typ), Calendar.getInstance()));
                            case "Tisch" -> r.addAusstattung(new Tisch((TischTyp) getTyp(typ), Calendar.getInstance()));
                            case "Whiteboard" ->
                                    r.addAusstattung(new Whiteboard((WhiteboardTyp) getTyp(typ), Calendar.getInstance()));
                            default -> erfolgreich = false;
                        }

                        if (erfolgreich) {
                            raumbearbeitenBestaetigung.setText("Ausstattung erfolgreich hinzugefügt.\nAktueller Raumzustand: " + r.toString());
                            raumBearbeiten.doClick();
                        } else {
                            raumbearbeitenBestaetigung.setText("Unerwarteter Fehler: Typ oder Raum existiert nicht. Bitte wiederholen Sie den Vorgang!");
                            return;
                        }
                    }
                }
            }


        });
        raumbearbeitenRaumlisteInput.addActionListener(e -> {
            //Aktuelle Ausstattung dem Zustands-DropDown Menu hinzufügen
            raumbearbeitenVeraendernAusstattungInput.removeAllItems();

            if (raumbearbeitenRaumlisteInput.getSelectedItem() != null) {
                int raumID = Integer.valueOf(raumbearbeitenRaumlisteInput.getSelectedItem().toString());

                for (Raum r : ServiceLocator.getInstance().getHausliste().getAlleRaeume()) {
                    if (r.getRaumnummer() == raumID) {
                        for (Ausstattungsmerkmal a : r.getAusstattung()) {
                            DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm");
                            raumbearbeitenVeraendernAusstattungInput.addItem(a.getId() + " | " + a.getExemplarTyp().getModell() + " | " + df.format(a.getAnschaffungsdatum().getTime()) + " | " + a.getAktuellerZustand().getClass().getName().split("\\.")[1]);
                        }
                    }

                }
            }


        });
        raumbearbeitenVeraendernCheck.addActionListener(e -> {

            int ID = Integer.valueOf(raumbearbeitenVeraendernAusstattungInput.getSelectedItem().toString().split(" | ")[0]);

            String neuerStatus = raumbearbeitenVeraendernZustandInput.getSelectedItem().toString();

            for (Ausstattungsmerkmal a : ServiceLocator.getInstance().getHausliste().getAlleAusstattungen()) {
                if (a.getId() == ID) {
                    raumbearbeitenBestaetigung.setText("Ausstattung gefunden!");
                    if (neuerStatus.equals("Defekt")) {
                        a.gehtKaputt();
                        raumbearbeitenBestaetigung.setText("Ausstattung " + ID + " wurde erfolgreich als defekt eingestuft.");
                        raumBearbeiten.doClick();
                        return;
                    } else if (neuerStatus.equals("Funktionstüchtig")) {
                        a.wirdRepariert();
                        raumbearbeitenBestaetigung.setText("Ausstattung " + ID + " wurde erfolgreich als funktionstüchtig eingestuft.");
                        raumBearbeiten.doClick();
                        return;
                    } else if (neuerStatus.equals("Entfernen (Irreversibel)")) {
                        int raumnummer = Integer.parseInt(raumbearbeitenRaumlisteInput.getSelectedItem().toString());
                        for(Raum r : ServiceLocator.getInstance().getHausliste().getAlleRaeume()){
                            if(r.getRaumnummer() == raumnummer){
                                r.removeAusstattung(a);
                                raumbearbeitenBestaetigung.setText("Ausstattung " + ID + " wurde erfolgreich entfernt.");
                                raumBearbeiten.doClick();
                                return;
                            }
                        }
                        raumbearbeitenBestaetigung.setText("Fehler: Raum nicht gefunden. Bitte wiederholen Sie den Vorgang.");
                        return;
                    }
                }
            }
            raumbearbeitenBestaetigung.setText("Fehler: Ausstattung nicht gefunden. Bitte wiederholen Sie den Vorgang.");
            return;

        });
        dozentLoeschenCheck.addActionListener(e -> {
            if(dozentLoeschenDozListe.getSelectedItem() == null)
            {
                dozentLoeschenBestaetigung.setText("Bitte wählen Sie einen Dozenten aus!");
                return;
            }
            String dozName = dozentLoeschenDozListe.getSelectedItem().toString();

            for (Dozent d : ServiceLocator.getInstance().getDozentenListe().getAlleDozenten()) {
                if (d.getName().equals(dozName)) {
                    //ServiceLocator.getInstance().getDozentenListe().getAlleDozenten().remove(d);
                    ServiceLocator.getInstance().getDozentenListe().removeDozent(d);
                    dozentLoeschenBestaetigung.setText("Der Dozent " + dozName + " wurde erfolgreich entfernt.");
                    dozentLoeschen.doClick();
                    return;
                }

            }
            dozentLoeschenBestaetigung.setText("Unerwarteter Fehler: Dozent existiert nicht. Bitte wiederholen Sie den Vorgang!");
        });
        dozentHinzufuegenButton.addActionListener(e -> {
            if(dozentHinzufuegenInput.getText().equals("")){
                dozentHinzufuegenBestaetigung.setText("Bitte geben Sie einen namen ein!");
                return;
            }

            String neuerDozent = dozentHinzufuegenInput.getText();

            //Wenn der Name bereits vergeben ist, nicht erstellen
            for (Dozent d : ServiceLocator.getInstance().getDozentenListe().getAlleDozenten()) {
                if (d.getName().equals(neuerDozent)) {
                    dozentHinzufuegenBestaetigung.setText("Dozent existiert bereits. Bitte wählen Sie einen anderen Namen aus!");
                    return;
                }
            }

            //Dozent hinzufügen
            ServiceLocator.getInstance().getDozentenListe().addDozent(new Dozent(neuerDozent));
            dozentHinzufuegenBestaetigung.setText("Dozent erfolgreich hinzugefügt.");
            dozentHinzufuegen.doClick();


        });
        dozTerminplanDozAuswahlInput.addActionListener(e -> {
            if(dozTerminplanDozAuswahlInput.getSelectedItem() == null){
                dozTerminplanBestaetigung.setText("Bitte wählen Sie einen Dozenten aus!");
                return;
            }

            String dozent = dozTerminplanDozAuswahlInput.getSelectedItem().toString();

            for(Dozent d : ServiceLocator.getInstance().getDozentenListe().getAlleDozenten()){
                if(d.getName().equals(dozent)){
                    dozTerminplanBestaetigung.setText(d.aktuelleBuchungenToString());
                    return;
                }
            }
            dozTerminplanBestaetigung.setText("Fehler: Dozent nicht gefunden!");



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
                switch (JOptionPane.showConfirmDialog(null, "Möchten Sie die Änderungen vor dem Schließen speichern?", "Schließen", JOptionPane.YES_NO_CANCEL_OPTION)) {
                    case JOptionPane.YES_OPTION -> {
                        ServiceLocator.getInstance().speicherAlleContainer("Grunddaten", ServiceLocator.getInstance());
                        System.exit(0);
                    }
                    case JOptionPane.NO_OPTION -> System.exit(0);
                    //case JOptionPane.CANCEL_OPTION ->

                }
            }
        });


        hausloeschenCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(hausloeschenHausInput.getSelectedItem() == null){
                    hausloeschenBestaetigung.setText("Bitte wählen Sie ein Haus aus!");
                    return;
                }

                String hausID = hausloeschenHausInput.getSelectedItem().toString();

                for (Haus h : ServiceLocator.getInstance().getHausliste().getAlleHaeuser()){
                    if(h.getHausnummer().equals(hausID)){
                        ServiceLocator.getInstance().getHausliste().removeHaus(h);
                        hausloeschenBestaetigung.setText("Haus " + hausID + " wurde entfernt.");
                        hausLoeschen.doClick();
                        return;
                    }
                }
                hausloeschenBestaetigung.setText("Haus nicht gefunden, Haus wurde nicht entfernt. Bitte wiederholen Sie den Vorgang!");
            }
        });
        hausHinzufuegenCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String hausnummer = hausHinzufuegenIDInput.getText();
                //Wenn keine Hausnummer angegeben wurde
                if(hausnummer.equals("")){
                    hausHinzufuegenBestaetigung.setText("Bitte geben Sie eine Hausnummer an!");
                    return;
                }

                for (Haus h : ServiceLocator.getInstance().getHausliste().getAlleHaeuser()) {
                    if(h.getHausnummer().equals(hausnummer)){
                        hausHinzufuegenBestaetigung.setText("Hausnummer bereits vergeben, bitte wählen Sie eine andere Nummer!");
                        return;
                    }
                }
                ServiceLocator.getInstance().getHausliste().getAlleHaeuser().add(new Haus(hausnummer,hausHinzufuegenBarrierefreInput.isSelected()));
                hausHinzufuegenBestaetigung.setText("Haus " + hausnummer + " wurde angelegt. Barrierefrei: " + hausHinzufuegenBarrierefreInput.isSelected());
                hausHinzufuegen.doClick();
            }
        });
        hausBearbeitenCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String hausnummerAktuell = hausBearbeitenHausInput.getSelectedItem().toString();
                String hausnummerNeu = hausBearbeitenNeueIDInput.getText();

                for (Haus h : ServiceLocator.getInstance().getHausliste().getAlleHaeuser()) {
                    if(h.getHausnummer().equals(hausnummerAktuell)){
                        h.setBarrierefrei(hausBearbeitenBarriefreiInput.isSelected());
                        if(hausnummerNeu.equals("")){
                            hausBearbeitenBestaetigung.setText("Haus " + hausnummerAktuell + " erfolgreich bearbeitet.");
                        }
                        else {
                            h.setHausnummer(hausnummerNeu);
                            hausBearbeitenBestaetigung.setText("Haus " + hausnummerAktuell + " erfolgreich bearbeitet. Neue Nummer: " + hausnummerNeu);

                        }
                        hausBearbeiten.doClick();
                        return;
                    }
                }
                hausBearbeitenBestaetigung.setText("Haus nicht gefunden, bitte wiederholen Sie den Vorgang.");
            }
        });
        raumEntblockenRaumInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int raumnummer;
                try {
                    raumnummer = Integer.parseInt(raumEntblockenRaumInput.getSelectedItem().toString());
                } catch (NullPointerException npe) {
                    raumEntblockenBestaetigung.setText("Kein Raum ausgewählt");
                    return;
                }

                for (Raum r : ServiceLocator.getInstance().getHausliste().getAlleRaeume()) {
                    if (r.getRaumnummer() == raumnummer) {
                        raumEntblockenTerminInput.removeAllItems();
                        for (Terminbuchung t : r.getBuchungen()) {
                            raumEntblockenTerminInput.addItem(t.getId() + " | " + t.getDozent().getName() + " | " + t.getIntervall().toString());
                        }
                        return;
                    }
                    raumEntblockenBestaetigung.setText("Raum nicht gefunden, bitte wiederholen Sie den Vorgang!");

                }
            }
        });
        raumEntblockenCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int raumnummer;
                try {
                    raumnummer = Integer.parseInt(raumEntblockenRaumInput.getSelectedItem().toString());
                } catch (NullPointerException npe) {
                    raumEntblockenBestaetigung.setText("Kein Raum ausgewählt");
                    return;
                }

                int buchungsID;
                try {
                    buchungsID = Integer.parseInt(raumEntblockenTerminInput.getSelectedItem().toString().split(" | ")[0]);
                } catch (NullPointerException npe) {
                    raumEntblockenBestaetigung.setText("Keine Terminbuchung ausgewählt");
                    return;
                }
                System.out.println(buchungsID);

                for (Raum r : ServiceLocator.getInstance().getHausliste().getAlleRaeume()) {
                    if (r.getRaumnummer() == raumnummer) {
                        r.cancelOrder(buchungsID);
                        raumEntblockenBestaetigung.setText("Terminbuchung " + buchungsID + " wurde erfolgeich storniert.");
                        raumEntblocken.doClick();
                        return;
                    }
                }
                raumEntblockenBestaetigung.setText("Raum nicht gefunden, bitte wiederholen Sie den Vorgang!");

            }
        });
        raumLoeschenCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(raumLoeschenIDInput.getSelectedItem() == null){
                    raumLoeschenBestaetigung.setText("Bitte wählen Sie einen Raum aus!");
                }

                else {
                    int raumID = Integer.parseInt(raumLoeschenIDInput.getSelectedItem().toString());
                    //Raum Objekt finden
                    for(Raum r : ServiceLocator.getInstance().getHausliste().getAlleRaeume()){
                        if (r.getRaumnummer() == raumID){
                            //Raum muss im Haus entfernt werden, passendes Haus finden
                            for(Haus h : ServiceLocator.getInstance().getHausliste().getAlleHaeuser()){
                                if(h.getRaeume().contains(r)){
                                    h.removeRaum(r);
                                    raumLoeschenBestaetigung.setText("Der Raum " + raumID + " wurde erfolgreich aus Haus " + h.getHausnummer() + " entfernt.");
                                    raumLoeschen.doClick();
                                    return;
                                }
                            }
                            raumLoeschenBestaetigung.setText("Fehler: Der Raum " + raumID + " wurde gefunden, ist aber keinem Haus zugeordnet. Raum wurde nicht gelöscht. Bitte wiederholen Sie den Vorgang!");
                            return;
                        }
                    }
                    raumLoeschenBestaetigung.setText("Fehler: Der Raum " + raumID + " konnte nicht gefunden werden. Bitte wiederholen Sie den Vorgang, laden Sie ggf. die Seite neu.");
                }
                return;

            }
        });
        dozentBearbeitenCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Wenn aus dem DropDownMenu kein Dozent ausgewählt wurde oder kein neuer Name eingegeben wurde, wird die Methode nicht ausgeführt und der Nutzer informiert
                if(dozentBearbeitenDozAuswahlInput.getSelectedItem() == null || dozentBearbeitenNameInput.getText().equals("")){
                    dozentBearbeitenBestaetigung.setText("Bitte wählen Sie einen Dozenten aus und geben Sie einen neuen Namen ein!");
                    return;
                }

                String dozent = dozentBearbeitenDozAuswahlInput.getSelectedItem().toString();
                String neuerName = dozentBearbeitenNameInput.getText();

                //Wenn der neue Name bereits vergeben wurde, Fehlermeldung und abbrechen
                for(Dozent d : ServiceLocator.getInstance().getDozentenListe().getAlleDozenten()){
                    if (d.getName().equals(neuerName)){
                        dozentBearbeitenBestaetigung.setText("Der Name ist bereits vergeben, bitte geben Sie einen anderen Namen aus!");
                        return;
                    }
                }

                for(Dozent d : ServiceLocator.getInstance().getDozentenListe().getAlleDozenten()){
                    if (d.getName().equals(dozent)){
                        d.setName(neuerName);
                        dozentBearbeitenBestaetigung.setText("Dozent " + dozent + " erfolgreich umbenannt. Neuer Name: " + neuerName);
                        dozentBearbeiten.doClick();
                        return;
                    }
                }
                dozentBearbeitenBestaetigung.setText("Dozent " + dozent + " wurde nicht gefunden. Bitte wiederholen Sie den Vorgang.");
                return;
            }
        });
    }

    /**
     * Methode ermittelt den Typ, basierend auf einem String der dem Typennamen entspricht
     *
     * @param typName
     * @return typ
     * @author ZanderLK
     * @version 1.0.1
     * @since 20220802
     */
    public AusstattungsTypIF getTyp(String typName) {
        for (BeamerTyp typ : ServiceLocator.getInstance().getBeamerTypen().getAlleBeamerTypen()) {
            if (typ.getModell().equals(typName)) {
                return (AusstattungsTypIF) typ;
            }

        }

        for (KreidetafelTyp typ : ServiceLocator.getInstance().getKreideTypen().getAlleKreidetafelTypen()) {
            if (typ.getModell().equals(typName)) {
                return (AusstattungsTypIF) typ;
            }

        }

        for (SmartboardTyp typ : ServiceLocator.getInstance().getSmartboardTypen().getAlleSmartboardTypen()) {
            if (typ.getModell().equals(typName)) {
                return (AusstattungsTypIF) typ;
            }

        }

        for (TischTyp typ : ServiceLocator.getInstance().getTischTypen().getAlleTischTypen()) {
            if (typ.getModell().equals(typName)) {
                return (AusstattungsTypIF) typ;
            }

        }

        for (WhiteboardTyp typ : ServiceLocator.getInstance().getWhiteboardTypen().getAlleWhiteboardTypen()) {
            if (typ.getModell().equals(typName)) {
                return (AusstattungsTypIF) typ;
            }

        }

        for (StuhlTyp typ : ServiceLocator.getInstance().getStuhlTypen().getAlleStuhlTypen()) {
            if (typ.getModell().equals(typName)) {
                return (AusstattungsTypIF) typ;
            }

        }

        for (KameraTyp typ : ServiceLocator.getInstance().getKameraTypen().getAlleKameraTypen()) {
            if (typ.getModell().equals(typName)) {
                return (AusstattungsTypIF) typ;
            }

        }

        for (PCTyp typ : ServiceLocator.getInstance().getPCTypen().getAllePCTypen()) {
            if (typ.getModell().equals(typName)) {
                return (AusstattungsTypIF) typ;
            }

        }

        for (MikrofonTyp typ : ServiceLocator.getInstance().getMikrofonTypen().getAlleMikrofonTypen()) {
            if (typ.getModell().equals(typName)) {
                return (AusstattungsTypIF) typ;
            }

        }

        for (LautsprecherTyp typ : ServiceLocator.getInstance().getLautsprecherTypen().getAlleLautsprecherTypen()) {
            if (typ.getModell().equals(typName)) {
                return (AusstattungsTypIF) typ;
            }

        }

        return null;
    }

    /**
     * Verbirgt alle Panels, die nicht dauerhaft notwendig sind
     *
     * @author ZanderLK
     */
    public void verbergeAllePanels() {
        panelRaumHinzufuegen.setVisible(false);
        panelRaumSuchenBuchen.setVisible(false);
        panelInventur.setVisible(false);
        panelDozentLoeschen.setVisible(false);
        panelDozentenTerminplan.setVisible(false);
        panelStartseite.setVisible(false);
        panelRaumBearbeiten.setVisible(false);
        panelDozentHinzufuegen.setVisible(false);
        panelHausBearbeiten.setVisible(false);
        panelHausHinzufuegen.setVisible(false);
        panelHausLoeschen.setVisible(false);
        panelRaumEntblocken.setVisible(false);
        panelRaumLoeschen.setVisible(false);
        panelDozentBearbeiten.setVisible(false);
        ScrollRaumbearbeiten.setVisible(false);
    }

    private void createUIComponents() {
        //place custom component creation code here
    }
}

