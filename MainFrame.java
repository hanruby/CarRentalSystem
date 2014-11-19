/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author jonathan
 */
public class MainFrame extends JFrame {
    
    public MainFrame(){
        super("Motor Rental System");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
		JPanel panel = new JPanel();
		add(panel);
		placeComponents(panel);
                
		setVisible(true);
    }
    
    private static void placeComponents(JPanel panel) {

		panel.setLayout(null);

		

		JButton Register = new JButton("Register");
		Register.setBounds(165, 100, 180, 25);
		panel.add(Register);
                Register.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent e)
            {
                 RegisterFrame frame = new RegisterFrame(); // construct a MyFrame object
                frame.setVisible( true );
                
            }
        }); 
		
		JButton Rent = new JButton("Rent");
		Rent.setBounds(165, 200, 180, 25);
		panel.add(Rent);
                Rent.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
                
                RentFrame frame = new RentFrame();
		frame.setVisible(true);
            }
        }); 
                
                JButton Details = new JButton("Customer Details");
		Details.setBounds(165, 300, 180, 25);
		panel.add(Details);
                Details.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
                
                CustomerDetails frame = new CustomerDetails();
		frame.setVisible(true);
            }
        }); 
                
                
                
                
	}
    
}
