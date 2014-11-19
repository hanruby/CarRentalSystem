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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author jonathan
 */
public class RentFrame extends JFrame {
   
    public RentFrame(){
        super("Rent");
        
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
		JPanel panel = new JPanel();
		add(panel);
		placeComponent(panel);
                
		setVisible(true);
    }
    private static void placeComponent(JPanel panel) {
            panel.setLayout(null);

		
		JButton car = new JButton("Car");
		car.setBounds(165, 110, 180, 25);
		panel.add(car);
                car.addActionListener(new ActionListener() {
                @Override
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
                CarFrame frame = new CarFrame(); // construct a MyFrame object
                frame.setVisible( true );
            }
        }); 
           
		
		JButton Bus = new JButton("Bus");
		Bus.setBounds(165, 220, 180, 25);
		panel.add(Bus);
                Bus.addActionListener(new ActionListener() {
                @Override
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
               BusGui frame = new BusGui(); // construct a MyFrame object
                frame.setVisible( true );
            }
        }); 
 
          
                
                JButton Motor = new JButton("MotorBike");
		Motor.setBounds(165, 330, 180, 25);
		panel.add(Motor);
                Motor.addActionListener(new ActionListener() {
                @Override
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
               MotorBikeFrame frame = new MotorBikeFrame(); // construct a MyFrame object
                frame.setVisible( true );
            }
        }); 
               
	}
                
		
}
    

