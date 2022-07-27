package GUI_Moritz;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuBarFrame extends JFrame implements ActionListener{
	
	JMenuBar menuBar;
	
	JMenu raumVerwaltungMenu;
	JMenu einstellungen;
	JMenu inventarMenu;
	JMenu dozentenVerwaltung;
	
	//Items for RaumVerwaltung
	JMenuItem raumListe;
	JMenuItem raumSuche;
	
	//Items for Inventar
	JMenuItem inventarListe;
	JMenuItem inventarSuche;
	
	//Items for Dozentenverwaltung
	JMenuItem dozentHinzufuegen;
	JMenuItem dozentTerminplan;
	
	//Items for Einstellungen
	
	//ImageIcons for Items
	ImageIcon loadIcon;
	ImageIcon saveIcon;
	ImageIcon exitIcon;
	
	ImageIcon image; 
	JLabel label;
	
	MenuBarFrame(){
		//create window
	 	this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
	 	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 	this.setMinimumSize(new Dimension(500, 500));
		//this.setSize(500,500);
	 	this.setLayout(new FlowLayout());
	 	
	 	//Background Image
	 	image = new ImageIcon("src/GUI/Moritz/HWR Berlin.jpg");
	 	label = new JLabel(); // create a label
	 	label.setHorizontalTextPosition(JLabel.CENTER);

	 	label.setIcon(image);
	 	this.add(label);
	 	 	
	 	menuBar = new JMenuBar();
	 	
	 	this.setJMenuBar(menuBar);
	 	JMenu raumVerwaltung = new JMenu("Raumverwaltung");
	 	JMenu inventarMenu = new JMenu("Inventar");
	 	JMenu dozentenVerwaltung = new JMenu("Dozentenverwaltung");
	 	JMenu einstellungen = new JMenu("Einstellungen");
	 	
	 	menuBar.add(raumVerwaltung);
	 	menuBar.add(inventarMenu);
	 	menuBar.add(dozentenVerwaltung);
		menuBar.add(einstellungen);
	 	
		//Raumverwaltung
	 	raumListe = new JMenuItem("Raumliste");
	 	raumSuche = new JMenuItem("Raumsuche");

	 	//Inventar
	 	inventarListe = new JMenuItem("Inventarliste");
		inventarSuche = new JMenuItem("Inventarsuche");
		
		//Items for Dozentenverwaltung
		dozentHinzufuegen = new JMenuItem("Dozenten hinzuf�gen");
		dozentTerminplan = new JMenuItem("dozentTerminplan");
	 	
		//Items wird ActionListener hinzugef�gt
	 	raumListe.addActionListener(this);
	 	raumSuche.addActionListener(this);
	 	inventarListe.addActionListener(this);
	 	inventarSuche.addActionListener(this);
	 	dozentHinzufuegen.addActionListener(this);
	 	dozentTerminplan.addActionListener(this);
	 	
	 	
/*	 	raumVerwaltung.setMnemonic(KeyEvent.VK_F); //alt + f to work
	 	einstellungen.setMnemonic(KeyEvent.VK_E); //alt + e for edit
	 	inventarMenu.setMnemonic(KeyEvent.VK_H); //alt + h for help
	 	
	 	raumListe.setMnemonic(KeyEvent.VK_L); //L Keyboard Shortcut for Load
	 	raumSuche.setMnemonic(KeyEvent.VK_S); //S for saving
	 	exitItem.setMnemonic(KeyEvent.VK_E); //E for exiting
*/	 	
	 	raumVerwaltung.add(raumListe);
	 	raumVerwaltung.add(raumSuche);

	 	inventarMenu.add(inventarListe);
	 	inventarMenu.add(inventarSuche);
	 	
	 	dozentenVerwaltung.add(dozentHinzufuegen);
	 	dozentenVerwaltung.add(dozentTerminplan);
	 	

	 	
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==raumListe) {
			Raumliste raumlisteFenster = new Raumliste();
		}
		if(e.getSource()==raumSuche) {
			Raumsuche raumsucheFenster = new Raumsuche();	
		}
		if(e.getSource()==inventarListe) {
			Inventarliste inventarlisteFenster = new Inventarliste();
		}
		if(e.getSource()==inventarSuche) {
			Inventarsuche inventarsucheFenster = new Inventarsuche();
		}
		if(e.getSource()==dozentHinzufuegen) {
			DozentHinzufuegen dozenthinzufuegenFenster = new DozentHinzufuegen();
		}
		if(e.getSource()==dozentTerminplan) {
			DozentTerminplan dozentterminplanFenster = new DozentTerminplan();
		}
		
		
	} 
}


/*
 * 	 	//get the window size
	 	Rectangle r = this.getBounds();
	 	int h = r.height;
	 	int w = r.width;
	 	//make the picture adjust to the window size
	 	int pic_height = (int)Math.round(h*3);
	 	int pic_width  = (int)Math.round(w*4);
	 	Image im = image.getImage().getScaledInstance(pic_width, pic_height, Image.SCALE_DEFAULT);	 
	 	
	 	image = new ImageIcon(im);
*/