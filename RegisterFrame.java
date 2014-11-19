/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;
import carrentalsystem.Customer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import carrentalsystem.DataManagement;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author jonathan
 */
public class RegisterFrame  extends JFrame {
   
    public RegisterFrame(){
        super("Register");
        
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

		JTextField emailTxt = new JTextField(20);
		emailTxt.setBounds(100, 40, 160, 25);
		panel.add(emailTxt);
                JLabel registerLabel = new JLabel("You are registered");
		registerLabel.setBounds(10, 120, 160, 25);
                registerLabel.setVisible(false);
		panel.add(registerLabel);
                
                JLabel field = new JLabel("Please enter the required information");
		field.setBounds(10, 160, 240, 25);
                field.setVisible(false);
		panel.add(field);
                
		JButton loginButton = new JButton("Enter");
		loginButton.setBounds(10, 80, 80, 25);
		panel.add(loginButton);
                loginButton.addActionListener(new ActionListener() {
           
            @Override
            public void actionPerformed(ActionEvent e)
            {
                
                
                String name = userText.getText();
                String email = emailTxt.getText();
                if(name.equals("")){
                    field.setVisible(true);
                    registerLabel.setVisible(false);
                }else if(email.equals("")){
                    field.setVisible(true);
                    registerLabel.setVisible(false);
                }else if(name.equals("") && email.equals("")){
                    field.setVisible(true);
                    registerLabel.setVisible(false);
                }else{
                    field.setVisible(false);
                DataManagement d = new DataManagement();
                Customer cust = new Customer(name,email);
                d.registerCustomer(cust);
                registerLabel.setVisible(true);
            }
            }}); 
		
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
