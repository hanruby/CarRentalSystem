/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import carrentalsystem.Customer;
import carrentalsystem.Rental;
import carrentalsystem.DataManagement;
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
public class CarFrame extends JFrame {
    private static String[] Cars = { "Audi", "BMW", "Mercedez" };
    private static String[] numdays = {"1","2","3","4","5","6","7","8","10"};
    public CarFrame(){
        super("Cars");
        setSize(600, 600);
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
                
                JLabel carLabel = new JLabel("Car Type");
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
		priceLabel.setBounds(10, 150, 200, 25);
		panel.add(priceLabel);
                
                JLabel rented = new JLabel("Car is now being rented");
		rented.setBounds(100, 450, 200, 25);
                rented.setVisible(false);
                
		panel.add(rented);
                
                JLabel days = new JLabel("How many days");
		days.setBounds(10, 200, 200, 25);
		panel.add(days);

		
                
                JTextField pricetext = new JTextField(20);
		pricetext.setBounds(150, 150, 160, 25);
                pricetext.setText("50");
                pricetext.setEditable(false);
		panel.add(pricetext);
               
               
                int cunt = 0;
                JComboBox d = new JComboBox();
                d.setBounds(150, 200, 160, 25);
                panel.add(d);
                for (String day : numdays){
                    d.addItem(numdays[cunt++]);
                }
                int count = 0;
                JComboBox c = new JComboBox();
                c.setBounds(150,100,160,25);
                panel.add(c);
                for (String Car : Cars) {
                c.addItem(Cars[count++]);
                
          }
               c.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(c.getSelectedIndex()== 0){
                    pricetext.setText("50");
                } else if(c.getSelectedIndex()== 1){
                    pricetext.setText("70");
                } else if
                    (c.getSelectedIndex()== 2){
                    pricetext.setText("100");
                } else{
                
        }
              
            }
        }); 
                JLabel field = new JLabel("Please enter the required information");
		field.setBounds(10, 450, 240, 25);
                field.setVisible(false);
		panel.add(field);
		JButton loginButton = new JButton("Enter");
		loginButton.setBounds(150, 400, 80, 25);
		panel.add(loginButton);
                loginButton.addActionListener(new ActionListener() {
                
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String name = userText.getText();
                String email = emailTxt.getText();
                String type = "Car";
                String model = c.getActionCommand();
                String day = d.getActionCommand();
                int days = Integer.parseInt(day);
                String pric = pricetext.getText();
                double price = Double.parseDouble(pric);
                if(name.equals("")){
                    field.setVisible(true);
                    
                }else if(email.equals("")){
                    field.setVisible(true);
                    
                }else if(name.equals("") && email.equals("")){
                    field.setVisible(true);
                    
                }else{
                    field.setVisible(false);
                DataManagement d = new DataManagement();
                Rental newRental = new Rental(name,email,days,model,price,type);
                d.saveRental(name,email,days,model,price,type);
                rented.setVisible(true);
               
            }
            }}); 
    
}
}
