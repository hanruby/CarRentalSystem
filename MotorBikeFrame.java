/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author jonathan
 */
public class MotorBikeFrame extends JFrame {
    private static String[] Bikes = { "Sazuki", "Toyota", "Honda" };
    public MotorBikeFrame(){
        super("Bikes");
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
                
                JLabel carLabel = new JLabel("Bike Type");
		carLabel.setBounds(10, 100, 200, 25);
		panel.add(carLabel);

		JTextField userText = new JTextField(20);
		userText.setBounds(150, 10, 160, 25);
		panel.add(userText);
                
                JLabel email = new JLabel("Customer Email");
		email.setBounds(10, 50, 200, 25);
		panel.add(email);

		JTextField emailTxt = new JTextField(20);
		emailTxt.setBounds(150, 50, 160, 25);
		panel.add(emailTxt);
                
               JLabel priceLabel = new JLabel("Price per day");
		priceLabel.setBounds(10, 250, 200, 25);
		panel.add(priceLabel);
                
                JTextField pricetext = new JTextField(20);
		pricetext.setBounds(150, 250, 160, 25);
                pricetext.setText("35");
                pricetext.setEditable(false);
		panel.add(pricetext);
               
               
                
                int count = 0;
                JComboBox c = new JComboBox();
                c.setBounds(150,100,160,25);
                panel.add(c);
                for (String Car : Bikes) {
                c.addItem(Bikes[count++]);
                
          }
               c.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(c.getSelectedIndex()== 0){
                    pricetext.setText("35");
                } else if(c.getSelectedIndex()== 1){
                    pricetext.setText("80");
                } else if
                    (c.getSelectedIndex()== 2){
                    pricetext.setText("110");
                } else{
                
        }
              
            }
        }); 
                
		JButton loginButton = new JButton("Enter");
		loginButton.setBounds(150, 400, 80, 25);
		panel.add(loginButton);
    
}
}
