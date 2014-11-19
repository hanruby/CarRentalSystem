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
import javax.swing.JTextField;

/**
 *
 * @author jonathan
 */
public class Pay extends JFrame {
   
    public Pay(){
        super("Cars");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
		JPanel panel = new JPanel();
		add(panel);
		placeComponent(panel);
                
		setVisible(true);
    }
     private static void placeComponent(JPanel panel) {

		panel.setLayout(null);

		JLabel userLabel = new JLabel("Customer Name");
		userLabel.setBounds(10, 10, 200, 25);
		panel.add(userLabel);

		JTextField userText = new JTextField(20);
		userText.setBounds(150, 10, 160, 25);
		panel.add(userText);

		

		JButton loginButton = new JButton("Enter");
		loginButton.setBounds(10, 80, 80, 25);
		panel.add(loginButton);
		
		JButton registerButton = new JButton("Back");
		registerButton.setBounds(180, 80, 80, 25);
		panel.add(registerButton);
	}
    
}
