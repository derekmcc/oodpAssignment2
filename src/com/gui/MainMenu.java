package com.gui;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import com.abstract_factory.TeamFactory;
import com.command.CommandHolder;
import com.command.ExitCommand;
import com.command.cmdButton;
import com.command.cmdMenu;
import com.command.firstTeamButtonCommand;
import com.command.firstTeamCommand;
import com.command.firstTeamManagerCommand;
import com.command.fixturesButtonCommand;
import com.command.juniorTeamButtonCommand;
import com.command.juniorTeamCommand;
import com.command.juniorTeamManagerCommand;
import com.command.reserveTeamButtonCommand;
import com.command.reserveTeamCommand;
import com.command.reserveTeamManagerCommand;
import com.composite.FixtureTree;
import com.factory_method.Manager;
import com.factory_method.ManagerFactory;
import com.singleton.FixtureTreeLimitException;
import com.singleton.Singleton;

public class MainMenu extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private TeamFactory team = null;
	JRadioButton rdoFirstTeam, rdoReserveTeam, rdoJuniorTeam;
	ButtonGroup bgGroup1;
	Container contentPane = getContentPane();
	JPanel northPanel = buildNorthPanel(), centerPanel = buildCenterPanel(), southPanel = buildSouthPanel();
	ImageIcon icon;
	JMenu mnuFile, mnuTeam;
	cmdMenu  mnuOpen, mnuExit, mnuUpdate, mnuFirstTeam, mnuReserveTeam, mnuJuniorTeam;
	cmdButton btnFirstTeam, btnReserveTeam, btnJuniorTeam, btnFixtures;
	cmdButton btnFirstTeamManager, btnReserveTeamManager, btnJuniorTeamManager;
	firstTeamManagerCommand ftmCommand;
	juniorTeamManagerCommand jtmCommand;
	reserveTeamManagerCommand rtmCommand;
	firstTeamButtonCommand ftbmCommand;
	juniorTeamButtonCommand jtbmCommand;
	reserveTeamButtonCommand rtbmCommand;
	fixturesButtonCommand fCommand;
	ManagerFactory managerFactory;
	
	public MainMenu() {
		super("Man Utd App");
		JMenuBar mbar = new JMenuBar();
		setJMenuBar(mbar);
		mnuFile = new JMenu("File", true);
		mnuTeam = new JMenu("Teams", true);
		mbar.add(mnuFile);
		mbar.add(mnuTeam);
		
		mnuExit = new cmdMenu("Exit", this);
		mnuExit.setCommand (new ExitCommand());
		mnuFile.add(mnuExit);
	      
		mnuFirstTeam = new cmdMenu("First Team", this);
		mnuReserveTeam = new cmdMenu("Reserve Team", this);
		mnuJuniorTeam = new cmdMenu("Under 18's Team", this);
		
		mnuTeam.add(mnuFirstTeam);
		mnuTeam.add(mnuReserveTeam);
		mnuTeam.add(mnuJuniorTeam);
		
		mnuFirstTeam.setCommand (new firstTeamCommand(this));
		mnuReserveTeam.setCommand (new reserveTeamCommand(this));
		mnuJuniorTeam.setCommand (new juniorTeamCommand(this));
		
		mnuFirstTeam.addActionListener(this);
		mnuReserveTeam.addActionListener(this);
		mnuJuniorTeam.addActionListener(this);
		mnuExit.addActionListener(this);
		
		JPanel panel = new JPanel();
		JPanel iconPanel = new JPanel();
		JPanel wrapper = new JPanel();
		panel.setLayout(new GridLayout(3,1,0,0));

		Icon icon = new ImageIcon("images/mu.jpg");
	    JLabel lblIcon = new JLabel("");
		lblIcon.setIcon(icon);
		
		iconPanel.add(lblIcon);
		panel.add(northPanel);
		panel.add(centerPanel);
		panel.add(southPanel);
		wrapper.add(iconPanel);
		wrapper.add(panel);

		contentPane.add(wrapper);
		
		//set the size & visibility
    	setSize(600,700);
    	setVisible(true);
    	setResizable(false);
		setLocationRelativeTo(null);
	}//end constructor
	
	public JPanel buildNorthPanel() {
		JPanel panel = null;
		panel = new JPanel();
		panel.setLayout(new GridLayout(2,1));
		
		JRadioButton btnFixtures = new JRadioButton("Fixtures");
		btnFixtures.addItemListener(new FixtureListener());
		
		JPanel btnPanel = new JPanel();
		JPanel lblPanel = new JPanel();
		
		Font font = new Font(("SansSerif"), Font.BOLD,40); 
		
		JLabel lblPlayers = new JLabel("Players");
		lblPlayers.setFont(font);
		
		btnFirstTeam = new cmdButton("First Team");
		ftbmCommand = new firstTeamButtonCommand(this);
	    btnFirstTeam.setCommand (ftbmCommand);
	    btnFirstTeam.addActionListener(this);
	    
	    btnReserveTeam = new cmdButton("Reserve Team");
		rtbmCommand = new reserveTeamButtonCommand(this);
	    btnReserveTeam.setCommand (rtbmCommand);
	    btnReserveTeam.addActionListener(this);
	    
	    btnJuniorTeam = new cmdButton("Junior Team");
		jtbmCommand = new juniorTeamButtonCommand(this);
	    btnJuniorTeam.setCommand (jtbmCommand);
	    btnJuniorTeam.addActionListener(this);
	    
	    btnFirstTeam.setPreferredSize(new Dimension(120, 50));
	    btnReserveTeam.setPreferredSize(new Dimension(120, 50));
	    btnJuniorTeam.setPreferredSize(new Dimension(120, 50));	    
	    
		JPanel iconPanel = new JPanel();
		JPanel wrapper = new JPanel();
		JPanel iconPanel2 = new JPanel();
	
	    btnPanel.add(btnFirstTeam);
	    btnPanel.add(btnReserveTeam);
	    btnPanel.add(btnJuniorTeam);
	    lblPanel.add(lblPlayers);
	    
	    panel.add(lblPanel);
	    panel.add(btnPanel);

	    wrapper.add(panel);
		return wrapper;
	}//end leftPanel

	public JPanel buildCenterPanel(){
		JPanel panel = null;
		panel = new JPanel();
		
		panel.setLayout(new GridLayout(2,1));
		
		JPanel btnPanel = new JPanel();
		JPanel lblPanel = new JPanel();
		JPanel wrapper = new JPanel();
		
		Font font = new Font(("SansSerif"), Font.BOLD,40); 
		
		JLabel lblManagers = new JLabel("Head Coaches");
		lblManagers.setFont(font);
		
		btnFirstTeamManager = new cmdButton("First Team");
		ftmCommand = new firstTeamManagerCommand(this);
	    btnFirstTeamManager.setCommand (ftmCommand);
	    btnFirstTeamManager.addActionListener(this);
		
	    btnReserveTeamManager = new cmdButton("Reserve Team");
		rtmCommand = new reserveTeamManagerCommand(this);
	    btnReserveTeamManager.setCommand (rtmCommand);
	    btnReserveTeamManager.addActionListener(this);
	    
	    btnJuniorTeamManager = new cmdButton("Junior Team");
		jtmCommand = new juniorTeamManagerCommand(this);
	    btnJuniorTeamManager.setCommand (jtmCommand);
	    btnJuniorTeamManager.addActionListener(this);
	    
	    btnFirstTeamManager.setPreferredSize(new Dimension(120, 50));
	    btnReserveTeamManager.setPreferredSize(new Dimension(120, 50));
	    btnJuniorTeamManager.setPreferredSize(new Dimension(120, 50));
	    
	    btnPanel.add(btnFirstTeamManager);
	    btnPanel.add(btnJuniorTeamManager);
	    btnPanel.add(btnReserveTeamManager);
		
	    lblPanel.add(lblManagers);
	    
	    panel.add(lblPanel);
	    panel.add(btnPanel);
	    wrapper.add(panel);
		return wrapper;
	}//end rightPanel
	
	public JPanel buildSouthPanel(){
		JPanel panel = null;
		panel = new JPanel();
		panel.setLayout(new GridLayout(2,1));
		
		JPanel btnPanel = new JPanel();
		JPanel lblPanel = new JPanel();
		JPanel wrapper = new JPanel();
		Font font = new Font(("SansSerif"), Font.BOLD,40); 
		
		JLabel lblFixtures = new JLabel("Fixtures");
		lblFixtures.setFont(font);
		
		btnFixtures = new cmdButton("Fixtures");
		fCommand = new fixturesButtonCommand(this);
	    btnFixtures.setCommand (fCommand);
	    btnFixtures.addActionListener(this);
		 
	    btnFixtures.setPreferredSize(new Dimension(200, 50));
	    
	    btnPanel.add(btnFixtures);
		
	    lblPanel.add(lblFixtures);
	    
	    panel.add(lblPanel);
	    panel.add(btnPanel);
	    wrapper.add(panel);
		return wrapper;
	}//end rightPanel
	
	public class FixtureListener implements ItemListener {
	    public void itemStateChanged(ItemEvent e) {
	        try {
				Singleton fixtureTree = Singleton.getFixtureTree();
				dispose();
			} catch (FixtureTreeLimitException e1) {
				JOptionPane.showMessageDialog(contentPane, "ERROR ONLY ONE instance of the Fixture list can be created","ERROR",JOptionPane.ERROR_MESSAGE);
			}//end catch
	    }//end ISC
	}//end listener
	
	@Override
	public void actionPerformed(ActionEvent e) {
		CommandHolder obj = (CommandHolder)e.getSource();
		obj.getCommand().Execute();
		this.dispose();
	}//end actionPerformed	
}//end class
