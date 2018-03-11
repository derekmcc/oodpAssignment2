package com.gui;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import com.abstract_factory.TeamFactory;
import com.command.CommandHolder;
import com.command.cmdButton;
import com.command.cmdMenu;
import com.command.firstTeamCommand;
import com.command.juniorTeamCommand;
import com.command.reserveTeamCommand;

public class MainMenu extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TeamFactory team = null;
	JRadioButton rdoFirstTeam, rdoReserveTeam, rdoJuniorTeam;
	ButtonGroup bgGroup1;
	Container contentPane = getContentPane();
	JPanel leftPanel = buildLeftPanel(), rightPanel = buildRightPanel();
	
	ImageIcon icon;
	JMenu mnuFile, mnuTeam;
	cmdMenu  mnuOpen, mnuExit, mnuUpdate, mnuFirstTeam, mnuReserveTeam, mnuJuniorTeam;
	cmdButton btnFirstTeam, btnReserveTeam, btnJuniorTeam;
	
	public MainMenu() {
		super("Man Utd App");
		JMenuBar mbar = new JMenuBar();
		setJMenuBar(mbar);
		mnuFile = new JMenu("File", true);
		mnuTeam = new JMenu("Teams", true);
		mbar.add(mnuFile);
		mbar.add(mnuTeam);
		
		mnuOpen = new cmdMenu("Open...", this);
		mnuFile.add(mnuOpen);
		
		//mnuOpen.setCommand (new fileCommand(this));
		mnuExit = new cmdMenu("Exit", this);
		//  mnuExit.setCommand (new ExitCommand());
		mnuUpdate = new cmdMenu("Update", this);
		// mnuUpdate.setCommand (new UpdateCommand(this));
		mnuFile.add(mnuUpdate);
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
		
		contentPane.add(leftPanel);
		
		//set the size & visibility
    	setSize(800,700);
    	setVisible(true);
    	setResizable(false);
		setLocationRelativeTo(null);
	}//end constructor
	
	public JPanel buildLeftPanel() {
		JPanel panel = null;
		panel = new JPanel();
				
		return panel;
	}//end leftPanel

	public JPanel buildRightPanel(){
		JPanel panel = null;
		panel = new JPanel();
		
		return panel;
	}//end rightPanel
	

	@Override
	public void actionPerformed(ActionEvent e) {
		CommandHolder obj = (CommandHolder)e.getSource();
		obj.getCommand().Execute();
		this.dispose();
	}//end actionPerformed
	
}//end class
