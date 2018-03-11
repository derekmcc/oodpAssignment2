package com.gui;


import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

import com.abstract_factory.TeamFactory;


public class PlayerPanel extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	JButton btnGoalKeeper, btnRback, btnRCback, btnLCback, btnLback, btnRcenter, btnCenter, 
	btnLcenter, btnRattack, btnForward, btnLattack, btnBack;
	Container contentPane = getContentPane();
	JPanel leftPanel = buildLeftPanel(), rightPanel = buildRightPanel(), wrapper;
	TeamFactory team;
	JLabel lblName, lblAge, lblNationality, lblGoals, lblNumber, lblIcon;
	JLabel lblNamelbl, lblAgelbl, lblNationalitylbl, lblGoalslbl, lblNumberlbl;
	ImageIcon icon;
	Color colour;

	public PlayerPanel(TeamFactory team, String title) {
		super(title);
		this.team = team;
		
		wrapper = new JPanel();
		wrapper.setLayout(new GridLayout(1,2));
		wrapper.add(leftPanel);
		wrapper.add(rightPanel);
		contentPane.add(wrapper);
		
		//set the size & visibility
    	setSize(650,600);
    	setVisible(true);
    	setResizable(false);
		setLocationRelativeTo(null);
	}//end constructor
	
	public JPanel buildLeftPanel() {
		JPanel panel = null;
		panel = new JPanel();
		
		btnGoalKeeper = new JButton("Goalkeeper");
		btnRback = new JButton("Right Back");
		btnRCback = new JButton("Right Center Back");
		btnLCback = new JButton("Left Center Back");
		btnLback = new JButton("Left Back");
		btnRcenter = new JButton("Right Center Midfield");
		btnCenter = new JButton("Center Midfield");
		btnLcenter = new JButton("Left Center Midfield");
		btnRattack = new JButton("Right Attack");
		btnForward = new JButton("Forward");
		btnLattack = new JButton("Left Attack");
		btnBack = new JButton("Back To Main Menu");
		
		btnBack.addActionListener(this);
		btnGoalKeeper.addActionListener(this);
		btnRback.addActionListener(this);
		btnRCback.addActionListener(this);
		btnLCback.addActionListener(this);
		btnLback.addActionListener(this);
		btnRcenter.addActionListener(this);
		btnCenter.addActionListener(this);
		btnLcenter.addActionListener(this);
		btnRattack.addActionListener(this);
		btnForward.addActionListener(this);
		btnLattack.addActionListener(this);
		
		btnGoalKeeper.setPreferredSize(new Dimension(40, 40));
		panel.setLayout(new GridLayout(12,1,0,5));
		
		btnBack.setBackground(Color.RED);
		
		panel.add(btnGoalKeeper);
		panel.add(btnRback);
		panel.add(btnRCback);
		panel.add(btnLCback);
		panel.add(btnLback);
		panel.add(btnRcenter);
		panel.add(btnCenter);
		panel.add(btnLcenter);
		panel.add(btnRattack);
		panel.add(btnForward);
		panel.add(btnLattack);
		panel.add(btnBack);
		JPanel tempPanel = new JPanel();
		tempPanel.add(panel);
		return tempPanel;
	}//end leftPanel

	public JPanel buildRightPanel(){
		JPanel panel = null;
		Font font1 = new Font(("SansSerif"), Font.BOLD,20); 
		Font font2 = new Font(("SansSerif"), Font.PLAIN,20); 
		colour = UIManager.getColor ("Panel.background");
		panel = new JPanel();
		JPanel iconPanel = new JPanel();
		JPanel detailsPanel = new JPanel();
		
		detailsPanel.setLayout(new GridLayout(5,2));
		detailsPanel.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
		lblNamelbl = new JLabel("");
		lblAgelbl = new JLabel("");
		lblNationalitylbl = new JLabel("");
		lblGoalslbl = new JLabel("");
		lblNumberlbl = new JLabel("");
		lblNamelbl = new JLabel("");
		lblAgelbl = new JLabel("");
		lblNationalitylbl = new JLabel("");
		lblGoalslbl = new JLabel("");
		lblNumberlbl = new JLabel("");
		
		lblName = new JLabel("");
		lblAge = new JLabel("");
		lblNationality = new JLabel("");
		lblGoals = new JLabel("");
		lblNumber = new JLabel("");
		lblIcon = new JLabel();
		
		lblNumberlbl.setFont(font1);
		lblNamelbl.setFont(font1);
		lblAgelbl.setFont(font1);
		lblNationalitylbl.setFont(font1);
		lblGoalslbl.setFont(font1);
		lblNumberlbl.setFont(font1);
		
		//set font of player labels
		lblNumber.setFont(font2);
		lblName.setFont(font2);
		lblAge.setFont(font2);
		lblNationality.setFont(font2);
		lblGoals.setFont(font2);
		lblNumber.setFont(font2);
		
		icon = new ImageIcon("");
		
		lblIcon.setIcon(icon);
		
		iconPanel.add(lblIcon);
		lblNamelbl.setBorder(BorderFactory.createLineBorder(colour));
		detailsPanel.add(lblNamelbl);
		lblName.setBorder(BorderFactory.createLineBorder(colour));
		detailsPanel.add(lblName);
		lblAgelbl.setBorder(BorderFactory.createLineBorder(colour));
		detailsPanel.add(lblAgelbl);
		lblAge.setBorder(BorderFactory.createLineBorder(colour));
		detailsPanel.add(lblAge);
		lblNationalitylbl.setBorder(BorderFactory.createLineBorder(colour));
		detailsPanel.add(lblNationalitylbl);
		lblNationality.setBorder(BorderFactory.createLineBorder(colour));
		detailsPanel.add(lblNationality);
		lblNumberlbl.setBorder(BorderFactory.createLineBorder(colour));
		detailsPanel.add(lblNumberlbl);
		lblNumber.setBorder(BorderFactory.createLineBorder(colour));
		detailsPanel.add(lblNumber);
		lblGoalslbl.setBorder(BorderFactory.createLineBorder(colour));
		detailsPanel.add(lblGoalslbl);
		lblGoals.setBorder(BorderFactory.createLineBorder(colour));
		detailsPanel.add(lblGoals);
		
		panel.add(iconPanel);
		panel.add(detailsPanel);
		
		return panel;
	}//end rightPanel
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object selected = e.getSource();
		addInfoLabels();
		if (selected == btnGoalKeeper) {
			setGoalkeeper();
		}//end if
		else if (selected == btnRback) {
			setRightBack();
		}//end else if
		else if (selected == btnRCback) {
			setRCBack();
		}//end else if
		else if (selected == btnLCback) {
			setLCBack();
		}//end else if
		else if (selected == btnLback) {
			setLeftBack();
		}//end else if
		else if (selected == btnRcenter) {
			setRightCenterMid();
		}//end else if
		else if (selected == btnCenter) {
			setCenterMid();
		}//end else if
		else if (selected == btnLcenter) {
			setLeftCenterMid();
		}//end else if
		else if (selected == btnRattack) {
			setRightAttackMid();
		}//end else if
		else if (selected == btnForward) {
			setForward();
		}//end else if
		else if (selected == btnLattack) {
			setLeftAttackMid();
		}//end else if
		else if (selected == btnBack) {
			this.dispose();
			new MainMenu();
		}//end else if
	}//end actionPerformed
	
	private void addInfoLabels() {
		lblNamelbl.setText("Name");
		lblAgelbl.setText("Age");
		lblNationalitylbl.setText("Nationality");
		lblGoalslbl.setText("Goals");
		lblNumberlbl.setText("Shirt Number");
		lblNamelbl.setBorder(BorderFactory.createLineBorder(Color.RED));
		lblName.setBorder(BorderFactory.createLineBorder(Color.RED));
		lblAgelbl.setBorder(BorderFactory.createLineBorder(Color.RED));
		lblAge.setBorder(BorderFactory.createLineBorder(Color.RED));
		lblNationalitylbl.setBorder(BorderFactory.createLineBorder(Color.RED));
		lblNationality.setBorder(BorderFactory.createLineBorder(Color.RED));
		lblNumberlbl.setBorder(BorderFactory.createLineBorder(Color.RED));
		lblNumber.setBorder(BorderFactory.createLineBorder(Color.RED));
		lblGoalslbl.setBorder(BorderFactory.createLineBorder(Color.RED));
		lblGoals.setBorder(BorderFactory.createLineBorder(Color.RED));
	}//end addLabels
	
	private void setGoalkeeper() {
		if (team != null) {
			lblName.setText(team.getGoalkeeper().getName());
			lblAge.setText(String.valueOf(team.getGoalkeeper().getAge()));
			lblNationality.setText(team.getGoalkeeper().getNationality());
			lblGoals.setText(team.getGoalkeeper().getGoals());
			lblNumber.setText(String.valueOf(team.getGoalkeeper().getNumber()));
			icon = new ImageIcon(team.getGoalkeeper().getImage());
			lblIcon.setIcon(icon);
		}//end if
	}//end setGoalkeeper
	
	private void setRightBack() {
		if (team != null) {
			lblName.setText(team.getRightBack().getName());
			lblAge.setText(String.valueOf(team.getRightBack().getAge()));
			lblNationality.setText(team.getRightBack().getNationality());
			lblGoals.setText(team.getRightBack().getGoals());
			lblNumber.setText(String.valueOf(team.getRightBack().getNumber()));
			icon = new ImageIcon(team.getRightBack().getImage());
			lblIcon.setIcon(icon);
		}//end if
	}//end setRightBack
	
	private void setRCBack() {
		if (team != null) {
			lblName.setText(team.getRightCenterBack().getName());
			lblAge.setText(String.valueOf(team.getRightCenterBack().getAge()));
			lblNationality.setText(team.getRightCenterBack().getNationality());
			lblGoals.setText(team.getRightCenterBack().getGoals());
			lblNumber.setText(String.valueOf(team.getRightCenterBack().getNumber()));
			icon = new ImageIcon(team.getRightCenterBack().getImage());
			lblIcon.setIcon(icon);
		}//end if
	}//end setRightCenterBack
	
	private void setLCBack() {
		if (team != null) {
			lblName.setText(team.getLeftCenterBack().getName());
			lblAge.setText(String.valueOf(team.getLeftCenterBack().getAge()));
			lblNationality.setText(team.getLeftCenterBack().getNationality());
			lblGoals.setText(team.getLeftCenterBack().getGoals());
			lblNumber.setText(String.valueOf(team.getLeftCenterBack().getNumber()));
			icon = new ImageIcon(team.getLeftCenterBack().getImage());
			lblIcon.setIcon(icon);
		}//end if
	}//end setLeftCenterBack
	
	private void setLeftBack() {
		if (team != null) {
			lblName.setText(team.getLeftBack().getName());
			lblAge.setText(String.valueOf(team.getLeftBack().getAge()));
			lblNationality.setText(team.getLeftBack().getNationality());
			lblGoals.setText(team.getLeftBack().getGoals());
			lblNumber.setText(String.valueOf(team.getLeftBack().getNumber()));
			icon = new ImageIcon(team.getLeftBack().getImage());
			lblIcon.setIcon(icon);
		}//end if
	}//end setLeftBack
	
	private void setRightCenterMid() {
		if (team != null) {
			lblName.setText(team.getRightCenterMid().getName());
			lblAge.setText(String.valueOf(team.getRightCenterMid().getAge()));
			lblNationality.setText(team.getRightCenterMid().getNationality());
			lblGoals.setText(team.getRightCenterMid().getGoals());
			lblNumber.setText(String.valueOf(team.getRightCenterMid().getNumber()));
			icon = new ImageIcon(team.getRightCenterMid().getImage());
			lblIcon.setIcon(icon);
		}//end if
	}//end setRightCenterMid
	
	private void setCenterMid() {
		if (team != null) {
			lblName.setText(team.getCenterMid().getName());
			lblAge.setText(String.valueOf(team.getCenterMid().getAge()));
			lblNationality.setText(team.getCenterMid().getNationality());
			lblGoals.setText(team.getCenterMid().getGoals());
			lblNumber.setText(String.valueOf(team.getCenterMid().getNumber()));
			icon = new ImageIcon(team.getCenterMid().getImage());
			lblIcon.setIcon(icon);
		}//end if
	}//end setCenterMid
	
	private void setLeftCenterMid() {
		if (team != null) {
			lblName.setText(team.getLeftCenterMid().getName());
			lblAge.setText(String.valueOf(team.getLeftCenterMid().getAge()));
			lblNationality.setText(team.getLeftCenterMid().getNationality());
			lblGoals.setText(team.getLeftCenterMid().getGoals());
			lblNumber.setText(String.valueOf(team.getLeftCenterMid().getNumber()));
			icon = new ImageIcon(team.getLeftCenterMid().getImage());
			lblIcon.setIcon(icon);
		}//end if
	}//end setLeftCenterMid
	
	private void setRightAttackMid() {
		if (team != null) {
			lblName.setText(team.getRightAttackMid().getName());
			lblAge.setText(String.valueOf(team.getRightAttackMid().getAge()));
			lblNationality.setText(team.getRightAttackMid().getNationality());
			lblGoals.setText(team.getRightAttackMid().getGoals());
			lblNumber.setText(String.valueOf(team.getRightAttackMid().getNumber()));
			icon = new ImageIcon(team.getRightAttackMid().getImage());
			lblIcon.setIcon(icon);
		}//end if
	}//end setRightAttackMid
	
	private void setLeftAttackMid() {
		if (team != null) {
			lblName.setText(team.getLeftAttackMid().getName());
			lblAge.setText(String.valueOf(team.getLeftAttackMid().getAge()));
			lblNationality.setText(team.getLeftAttackMid().getNationality());
			lblGoals.setText(team.getLeftAttackMid().getGoals());
			lblNumber.setText(String.valueOf(team.getLeftAttackMid().getNumber()));
			icon = new ImageIcon(team.getLeftAttackMid().getImage());
			lblIcon.setIcon(icon);
		}//end if
	}//end setLeftAttackMid
	
	private void setForward() {
		if (team != null) {
			lblName.setText(team.getForward().getName());
			lblAge.setText(String.valueOf(team.getForward().getAge()));
			lblNationality.setText(team.getForward().getNationality());
			lblGoals.setText(team.getForward().getGoals());
			lblNumber.setText(String.valueOf(team.getForward().getNumber()));
			icon = new ImageIcon(team.getForward().getImage());
			lblIcon.setIcon(icon);
		}//end if
	}//end setForward
}//end class
