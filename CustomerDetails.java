/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import carrentalsystem.Customer;
import carrentalsystem.DataManagement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class CustomerDetails extends JFrame {
    
    public CustomerDetails(){
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

		JTextField userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		panel.add(userText);

		JLabel passwordLabel = new JLabel("Email");
		passwordLabel.setBounds(10, 40, 80, 25);
		panel.add(passwordLabel);

		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 40, 160, 25);
		panel.add(passwordText);
               
		
                
		JButton enter = new JButton("Enter");
		enter.setBounds(10, 80, 80, 25);
		panel.add(enter);
                enter.addActionListener(new ActionListener() {
           
            @Override
            public void actionPerformed(ActionEvent e)
            {
                
               
            }
            }); 

		JButton back = new JButton("Back");
		back.setBounds(180, 80, 80, 25);
		panel.add(back);
                back.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent e)
            {
              
            }
        }); 
                
    
}
}
