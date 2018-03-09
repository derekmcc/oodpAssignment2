import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

import java.applet.*;
public class Main extends JFrame implements ActionListener {
		
	private TeamFactory team = null;
	JRadioButton rdoFirstTeam, rdoReserveTeam, rdoJuniorTeam;
	ButtonGroup group1;
	JPanel leftPanel = buildLeftPanel(), rightPanel = buildRightPanel(), panButtons, panDetails, iconPanel, layoutPanel = new JPanel();
	Container contentPane = getContentPane();
	JButton btnDrummer, btnGuitarist, btnVocalist, btnAlbums, btnAlbum1, btnAlbum2, btnAlbum3, btnAlbum4;
	String vocal;
	JLabel lblName, lblDesc, lblAge, lblIcon;
	JTextArea txtDesc;
	ImageIcon icon;
	int numButtons=1;
	Object obj = null;
	AudioClip audio;
	Dimension d = new Dimension(100,100);
	
	public MainTest() {
        super("Music Store");
        //setGUI();
        
        //set the layout of the layoutPanel to grid
        layoutPanel.setLayout(new GridLayout(1, 2));
        
        //add the panels to the main panel
    	layoutPanel.add(leftPanel);
    	layoutPanel.add(rightPanel);;
    	contentPane.add(layoutPanel);
		
    	//set the size & visibility
    	setSize(800,700);
    	setVisible(true);
    	setResizable(false);
		setLocationRelativeTo(null);
    }//end constructor
	
	public JPanel buildLeftPanel(){
    	//set the panel to null
    	JPanel panel = null;
    	Font font = new Font(("SansSerif"), Font.PLAIN,24); 
    	Font font2 = new Font(("SansSerif"), Font.BOLD,26); 
    	//create a new panel
    	panel = new JPanel();
    	JPanel btnPan = new JPanel();
    	
    	panel.setLayout(new GridLayout(2, 1));
    	JLabel lblChoice = new JLabel("Choose A Band");
    	lblChoice.setFont(font2);
    	panel.add(lblChoice);
    	
    	//create radio buttons
    	rdoFirstTeam = new JRadioButton("D12",false);
    	rdoReserveTeam = new JRadioButton("The Script",false);
    	rdoJuniorTeam = new JRadioButton("U2",false);
    	rdoBand4 = new JRadioButton("G-Unit",false);
    	
   		//add item listeners 
    	rdoFirstTeam.addItemListener(new Band1Listener());
    	rdoReserveTeam.addItemListener(new Band2Listener());
    	rdoJuniorTeam.addItemListener(new Band3Listener());
    	rdoBand4.addItemListener(new Band4Listener());
    	
    	rdoFirstTeam.setFont(font);
    	rdoReserveTeam.setFont(font);
    	rdoJuniorTeam.setFont(font);
    	rdoBand4.setFont(font);
    	
    	//create the button group 
    	group1 = new ButtonGroup();
    	
    	//add the buttons to the group
   		group1.add(rdoFirstTeam);
    	group1.add(rdoReserveTeam);
    	group1.add(rdoJuniorTeam);
    	group1.add(rdoBand4);
    	
    	btnPan.setLayout(new GridLayout(4,1));
    	//add the radio buttons to the panel
    	btnPan.add(rdoFirstTeam);
    	btnPan.add(rdoReserveTeam);
    	btnPan.add(rdoJuniorTeam);
    	btnPan.add(rdoBand4);
    	
    	panel.add(btnPan);
    	//return the panel
    	return panel;
    }//end buildQ1Panel
	
	public JPanel buildRightPanel(){
		//set the panel to null
    	JPanel panel = null;
    	
    	Font font3 = new Font(("SansSerif"), Font.BOLD,16); 
    	
    	//create a new panel
    	panel = new JPanel();
    	panButtons = new JPanel();
    	panDetails = new JPanel();
    	JPanel temp = new JPanel();
    	JPanel temp2 = new JPanel();
    	JPanel temp3 = new JPanel();
    	iconPanel = new JPanel();
    	
    	panel.setLayout(new BorderLayout());
    	panButtons.setLayout(new GridLayout(1,4,10,10));
    	
    	btnVocalist = new JButton("Vocalist");
    	btnDrummer = new JButton("Drummer");
    	btnGuitarist = new JButton("Guitarist");
    	btnAlbums = new JButton("Albums");
    	
    	btnVocalist.addActionListener(this);
    	btnAlbums.addActionListener(this);
    	btnGuitarist.addActionListener(this);
    	btnDrummer.addActionListener(this);
    	
    	Dimension d = new Dimension(50,50);
    	
    	btnVocalist.setPreferredSize(d);
    	
    	panButtons.add(btnVocalist);
    	panButtons.add(btnDrummer);
    	panButtons.add(btnGuitarist);
    	panButtons.add(btnAlbums);
    	
    	lblName = new JLabel();
    	lblAge = new JLabel();
    	lblIcon = new JLabel();
    	
    	lblName.setFont(font3);
    	lblAge.setFont(font3);
    	
    	icon = new ImageIcon("");
    	txtDesc = new JTextArea(15,30);
    	txtDesc.setEditable(false);
    	
    	JScrollPane scroll = new JScrollPane(txtDesc);

    	lblName.setText("");
    	lblAge.setText("");
    	lblIcon.setIcon(icon);
    	txtDesc.setText("");
    	iconPanel.add(lblIcon);
    	txtDesc.setLineWrap(true);
    	panDetails.setLayout(new GridLayout(3,1));
    	panDetails.add(lblName);
    	panDetails.add(lblAge);
    	
    	temp2.add(scroll);
    	temp3.add(panDetails, BorderLayout.NORTH);
    	temp3.add(temp2, BorderLayout.SOUTH);
    	
    	temp.add(panButtons);
    	panel.add(iconPanel,BorderLayout.NORTH);
    	panel.add(temp3, BorderLayout.CENTER);
    	panel.add(temp,BorderLayout.SOUTH);
    	
		return panel;
	}//end buildRightSide panel
	
	public JPanel buildAlbumPanel(){
		//set the panel to null
    	JPanel panel = null;
		//create a new panel
    	panel = new JPanel();
    	panButtons = new JPanel();
    	panDetails = new JPanel();
    	JPanel temp = new JPanel();
    	iconPanel = new JPanel();
    	System.out.println("WOrking");
    	panel.setLayout(new BorderLayout());
    	panButtons.setLayout(new GridLayout(1,numButtons));
    	
    	//if(band != null){

    	if(band.getAlbum1().getAlbum() == null){
    		
    		btnAlbum1 = new JButton(band.getAlbum1().getAlbum());
    		btnAlbum1.addActionListener(this);
    		panButtons.add(btnAlbum1);
    	}
    	if(band.getAlbum2() != null){
    		btnAlbum2 = new JButton(band.getAlbum1().getAlbum());
    		btnAlbum2.addActionListener(this);
    		panButtons.add(btnAlbum2);
    	}
    	if(band.getAlbum3() != null){
    		btnAlbum3 = new JButton(band.getAlbum1().getAlbum());
    		btnAlbum3.addActionListener(this);
    		panButtons.add(btnAlbum3);
    	}
    	if(band.getAlbum4() != null){
    		btnAlbum4 = new JButton(band.getAlbum1().getAlbum());
    		btnAlbum4.addActionListener(this);
    		panButtons.add(btnAlbum4);
    	}
    	//}
    	panDetails.setLayout(new GridLayout(3,1));
    
    	temp.add(panButtons);
    	panel.add(iconPanel,BorderLayout.NORTH);
    	panel.add(panDetails, BorderLayout.CENTER);
    	panel.add(temp,BorderLayout.SOUTH);
    	
    	return panel;
	}//end panel method
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object selected = e.getSource();
		
		if (selected == btnVocalist){
			setVocalist();
		}//end if
		else if (selected == btnDrummer) {
			setDrummer();
		}//end else if
		else if (selected == btnGuitarist) {
			setGuitarist();
		}//end else if
		else if (selected == btnAlbums) {
			if(band != null){
				this.dispose();
				new AlbumPanel(band);
			}//end if
			//setAlbums();
		}//end else if	
	}//end actionListener
	
	private void setVocalist() {
		if (band != null) {
			lblName.setText("Name: " + band.getVocalist().getName());
			lblAge.setText("Age: " + band.getVocalist().getAge());
			txtDesc.setText("Description: " + band.getVocalist().getDesc());
			icon = new ImageIcon(band.getVocalist().getImage());
			lblIcon.setIcon(icon);
		}//end if
	}//end setVocalist
	
	private void setGuitarist() {
		
		if (band != null) {
			lblName.setText("Name: " + band.getGuitarist().getName());
			lblAge.setText("Age: " + band.getGuitarist().getAge());
			txtDesc.setText("Description: " + band.getGuitarist().getDesc());
			icon = new ImageIcon(band.getGuitarist().getImage());
			lblIcon.setIcon(icon);
		}//end if
	}//end setGuitarist
	
	private void setDrummer() {

		if (band != null) {
			lblName.setText("Name: " + band.getDrummer().getName());
			lblAge.setText("Age: " + band.getDrummer().getAge());
			txtDesc.setText("Description: " + band.getDrummer().getDesc());
			icon = new ImageIcon(band.getDrummer().getImage());
			lblIcon.setIcon(icon);
		}//end if
	}//end setDrummer
		
	public class Band1Listener implements ItemListener {
	    public void itemStateChanged(ItemEvent e) {
	    	clearLabels();
	        band = new Band1(); 
	    }//end IST
	}//end listener
	
	public class Band2Listener implements ItemListener {
	    public void itemStateChanged(ItemEvent e) {
	    	clearLabels();
	        band = new Band2(); 
	    }//end IST
	}//end listener
	
	public class Band3Listener implements ItemListener {
	    public void itemStateChanged(ItemEvent e) {
	    	band = new Band3();
	        clearLabels();
	    }//end IST
	}//end listener
	
	public class Band4Listener implements ItemListener {
	    public void itemStateChanged(ItemEvent e) {
	        band = new Band4();
	        clearLabels();
	    }//end IST
	}//end listener
	
	private void clearLabels() {
        lblName.setText(""); 
        lblAge.setText("");; 
        txtDesc.setText("");
        icon = new ImageIcon("");
        lblIcon.setIcon(icon);
    }//end clearLabel method
	
	public static void main (String args[]) {
		//create the frame
    	JFrame frame = new MainTest();
    	frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}//end main method
}//end class
