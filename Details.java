/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author jonathan
 */
public class Details extends JFrame {
    public Details(){
        super("Details");
        
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
		JPanel panel = new JPanel();
		add(panel);
		placeComponent(panel);
                
		setVisible(true);
    }
    
    private static void placeComponent(JPanel panel) {
                
		panel.setLayout(null);

		JLabel userLabel = new JLabel("Name");
		userLabel.setBounds(10, 10, 80, 25);
		panel.add(userLabel);

		JLabel userTextL = new JLabel("");
		userTextL.setBounds(100, 10, 160, 25);
		panel.add(userTextL);

		JLabel passwordLabel = new JLabel("Email");
		passwordLabel.setBounds(10, 40, 80, 25);
		panel.add(passwordLabel);

		JLabel passwordText = new JLabel("");
		passwordText.setBounds(100, 40, 160, 25);
		panel.add(passwordText);
                
                JLabel vehicle = new JLabel("Vehicle currently rented?");
                vehicle.setBounds(10,70,220,25);
                panel.add(vehicle);
                
                JLabel vehicleL = new JLabel("");
                vehicleL.setBounds(100,70,220,25);
                panel.add(vehicleL);
                
                JLabel Type = new JLabel("Vehicle type");
                Type.setBounds(10,100,220,25);
                panel.add(Type);
                
                JLabel TypeL = new JLabel("");
                TypeL.setBounds(100,100,220,25);
                panel.add(TypeL);
                
                JLabel Make = new JLabel("Model");
                Make.setBounds(10,130,220,25);
                panel.add(Make);
                
                JLabel MakeL = new JLabel("");
                MakeL.setBounds(100,130,220,25);
                panel.add(MakeL);
                
                JLabel days = new JLabel("Number of days rented");
                days.setBounds(10,160,220,25);
                panel.add(days);
                
                JLabel daysL = new JLabel("");
                daysL.setBounds(100,160,220,25);
                panel.add(daysL);
                
                JLabel Amount = new JLabel("Amount due");
                Amount.setBounds(10,190,220,25);
                panel.add(Amount);
                
                JLabel AmountL = new JLabel("");
                AmountL.setBounds(100,190,220,25);
                panel.add(AmountL);
                
		
                
		
    
    
    }
    
    
}
