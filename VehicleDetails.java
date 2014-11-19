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
public class VehicleDetails extends JFrame {
    
     public VehicleDetails(){
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

		JLabel userLabel1 = new JLabel("");
		userLabel1.setBounds(10, 10, 80, 25);
		panel.add(userLabel1);
                
                JLabel userLabel2 = new JLabel("");
		userLabel2.setBounds(10, 60, 80, 25);
		panel.add(userLabel2);
                
		JLabel userLabel3 = new JLabel("");
		userLabel3.setBounds(10, 110, 80, 25);
		panel.add(userLabel3);
                
                JLabel userLabel4 = new JLabel("");
		userLabel4.setBounds(10, 160, 80, 25);
		panel.add(userLabel4);
                
                JLabel userLabel5 = new JLabel("");
		userLabel5.setBounds(10, 210, 80, 25);
		panel.add(userLabel5);
                
                JLabel userLabel6 = new JLabel("");
		userLabel6.setBounds(10, 260, 80, 25);
		panel.add(userLabel6);
                
		JButton back = new JButton("Back");
		back.setBounds(180, 350, 80, 25);
		panel.add(back);
                back.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent e)
            {
              MainFrame frame = new MainFrame();
              frame.setVisible(true);
            }
        }); 
}
}
