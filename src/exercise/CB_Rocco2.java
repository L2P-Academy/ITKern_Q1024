package exercise;
import java.awt.*;

import java.awt.event.*;

import java.io.File;

import java.io.FileWriter;

import java.io.IOException;


import javax.accessibility.Accessible;

import javax.accessibility.AccessibleContext;

import javax.swing.JButton;

import javax.swing.JComponent;

import javax.swing.JFileChooser;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JMenuBar;

import javax.swing.JPanel;

import javax.swing.JTabbedPane;

import javax.swing.JTextArea;

import javax.swing.JTextField;

import javax.swing.filechooser.FileFilter;


public class CB_Rocco2 extends Frame implements ActionListener, WindowListener 

{

  public static void main(String args[])

  {

	  CB_Rocco2 Fenster1 = new CB_Rocco2();

     Fenster1.setSize(240, 420);

     Fenster1.setLocation(450, 400);

     Fenster1.setTitle("Pv_Anlage_Test");

     Fenster1.setBackground(Color.BLUE);

     Fenster1.show();



     JButton button = new JButton("Öffnen");

     button.addActionListener(

    		 new ActionListener() {


					public void actionPerformed( ActionEvent ae) {

						JFileChooser fc = new JFileChooser(); 


					    fc.setFileFilter( new FileFilter() 

					    { 

					      @Override public boolean accept( File f ) 

					      { 

					        return f.isDirectory() || 

					          f.getName().toLowerCase().endsWith( ".txt" ); 

					      } 

					      @Override public String getDescription() 

					      { 

					        return "*.txt"; 

					      } 

					    } ); 


					    int state = fc.showOpenDialog( null ); 


					    if ( state == JFileChooser.APPROVE_OPTION ) 

					    { 

					      File file = fc.getSelectedFile(); 

					      System.out.println( file.getName() ); 

					    } 

					    else 

					    	{

					    	System.exit( 0 );


					    	}

					}

    		 }


);	

 	    JTabbedPane tab = new JTabbedPane();

 	    Fenster1.add(tab,BorderLayout.CENTER);





 	    JLabel l1 = new JLabel("PV-Ertrag");

 	    JLabel l2 = new JLabel("Batterieladung");
 	    
 	   JLabel l11 = new JLabel("Einspeisung LEW");

 	    JLabel l4 = new JLabel("Gesamtverbrauch Haus");
 	    
 	    JLabel l5 = new JLabel("Batterie Verbrauch");

 	    JLabel l3 = new JLabel ("Netzbezug LEW");

 	    JLabel l10 = new JLabel("Bemerkung");


 	    JLabel l8 = new JLabel ("LEW Grundgebühr €");

 	    JLabel l9 = new JLabel ("LEW Zählerkosten €");

 	    JLabel l7 = new JLabel ("Verbrauchspreis €");

 	    JLabel l6 = new JLabel ("Einspeisung €");

 	    JLabel l12 = new JLabel ("Anmerkungen");



 	    JTextField TextFeld = new JTextField("                                                                           ");

 	    JTextField TextFeld2 = new JTextField ("                                                                         ");

 	    JTextField TextFeld3 = new JTextField ("                                                                         ");

 	    JTextField TextFeld4 = new JTextField ("                                                                         ");

 	    JTextField TextFeld5 = new JTextField("                                                                          ");

 	    JTextField TextFeld6 = new JTextField("                                                                          ");

 	    JTextField TextFeld7 = new JTextField("                                                                          ");

 	    JTextField TextFeld8 = new JTextField("                                                                          ");

 	    JTextField TextFeld9 = new JTextField("                                                                          ");

 	    JTextArea TextFeld10 = new JTextArea(10, 20);

 	    JTextField TextFeld11 = new JTextField("                                                                         ");


 	    JPanel panel = new JPanel();


 	       panel.add(l1);

 	       panel.add(TextFeld);

 	       panel.add(l2);

 	       panel.add(TextFeld2);

 	       panel.add(l3);

 	       panel.add(TextFeld3);

 	       panel.add(l4);

 	       panel.add(TextFeld4);

 	       panel.add(l11);

 	       panel.add(TextFeld11);

 	       panel.add(l5);

 	       panel.add(TextFeld5);

 	       panel.add(button);

 	       tab.add("PV-Tagesdaten",panel);


 	    JPanel panel1 = new JPanel();

 	       panel1.add(l6);

 	       panel1.add(TextFeld6);

 	       panel1.add(l7);

 	       panel1.add(TextFeld7);

 	       panel1.add(l8);

 	       panel1.add(TextFeld8);

 	       panel1.add(l9);

 	       panel1.add(TextFeld9);

 	       tab.add("LEW Grunddaten", panel1);


 	    JPanel panel2 = new JPanel();

 	    	panel2.add(l10);

 	    	panel2.add(TextFeld10);

 	    	tab.add("Wichtig!!!", panel2);

  }



  public CB_Rocco2 ()

  {

     MenuBar hauptMenue = new MenuBar();

     Menu menue1 = new Menu("Datei(T)");

     Menu menue4 = new Menu("Hilfe(T)");

     menue1.add("Laden(T)");

     menue1.add("Speichern(T)");

     menue1.add("Speichern unter(T)");

     menue1.addSeparator();

     menue1.add("Beenden");

     menue4.add("Index(T)");

     menue4.add("Hilfe(T)");

     hauptMenue.add(menue1);

     hauptMenue.setHelpMenu(menue4);

     setMenuBar(hauptMenue);

     menue1.addActionListener(this);

     addWindowListener(this); 

   }


  public void actionPerformed(ActionEvent evt)

  {

     if (evt.getSource() instanceof MenuItem)

    {

       String menuAdd = evt.getActionCommand();

       if (menuAdd.equals("Beenden")) System.exit(0);

     }

   }


  public void windowClosing(WindowEvent evt)

  {

     System.exit(0);

   }


  public void windowOpened(WindowEvent evt){}

  public void windowIconified(WindowEvent evt){}

  public void windowDeiconified(WindowEvent evt){}

  public void windowClosed(WindowEvent evt){}

  public void windowActivated(WindowEvent evt){}

  public void windowDeactivated(WindowEvent evt){}







}


	
	
	
	
	
	
	
	
	

