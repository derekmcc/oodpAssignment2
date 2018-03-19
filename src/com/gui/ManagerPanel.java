package com.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import com.factory_method.Manager;
import com.factory_method.ManagerFactory;

public class ManagerPanel extends JFrame implements ActionListener {
	
	Container contentPane = getContentPane();
	JLabel lblName, lblAge, lblNationality, lblImage;
	JLabel lblNamelbl, lblAgelbl, lblNationalitylbl;
	Icon icon;
	JButton btnBack;
	
	public ManagerPanel(String manager) {
		super(manager);
		
		ManagerFactory managerFactory = new ManagerFactory();
		Manager m1 = managerFactory.getManager(manager);
		
		Font font1 = new Font(("SansSerif"), Font.BOLD,20); 
		Font font2 = new Font(("SansSerif"), Font.PLAIN,20); 
		
		lblName = new JLabel(m1.getName());
		lblNationality = new JLabel(m1.getNationality());
		lblAge = new JLabel(String.valueOf(m1.getAge()));
		lblImage = new JLabel("");
		icon = new ImageIcon(m1.getImage());
		lblImage.setIcon(icon);
		
		lblName.setFont(font2);
		lblNationality.setFont(font2);
		lblAge.setFont(font2);
		
		lblNamelbl = new JLabel("Name ");
		lblNationalitylbl = new JLabel("Age ");
		lblAgelbl = new JLabel("Nationality");
		
		lblNamelbl.setFont(font1);
		lblNationalitylbl.setFont(font1);
		lblAgelbl.setFont(font1);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(this);
		btnBack.setPreferredSize(new Dimension(200, 60));
		btnBack.setBackground(Color.RED);
		btnBack.setFont(font2);
		
		JPanel panel = new JPanel();
		JPanel wrapper = new JPanel();
		JPanel panDetails = new JPanel();
		JPanel iconPanel = new JPanel();
		JPanel detailsWrapper = new JPanel();
		JPanel btnPanel = new JPanel();
		panDetails.setLayout(new GridLayout(3,2));
		wrapper.setLayout(new GridLayout(2,1,0,20));
		detailsWrapper.setLayout(new GridLayout(2,1,0,0));
		
		panDetails.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
		
	    iconPanel.add(lblImage);
	    
	    panDetails.add(lblNamelbl);
	    panDetails.add(lblName);
	    panDetails.add(lblAgelbl);
	    panDetails.add(lblAge);
	    panDetails.add(lblNationalitylbl);
	    panDetails.add(lblNationality);
	    
	    lblNamelbl.setBorder(BorderFactory.createLineBorder(Color.RED));
	    lblName.setBorder(BorderFactory.createLineBorder(Color.RED));
	    lblAgelbl.setBorder(BorderFactory.createLineBorder(Color.RED));
	    lblAge.setBorder(BorderFactory.createLineBorder(Color.RED));
	    lblNationalitylbl.setBorder(BorderFactory.createLineBorder(Color.RED));
	    lblNationality.setBorder(BorderFactory.createLineBorder(Color.RED));
	    
	    btnPanel.add(btnBack);
	    detailsWrapper.add(panDetails);
	    detailsWrapper.add(btnPanel);
	    wrapper.add(iconPanel);
	    wrapper.add(detailsWrapper);
	    
		contentPane.add(wrapper);
		
		//set the size & visibility
    	setSize(450,600);
    	setVisible(true);
    	setResizable(false);
    	setLocationRelativeTo(null);
	}//end constructor

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBack) {
			new MainMenu();
			dispose();
		}//end if
	}//end actionPerformed
}//end class
