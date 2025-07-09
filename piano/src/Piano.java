import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Piano {
	public static void main(String args[]) { 
		JFrame Piano = new JFrame("Virtual Piano");
		JPanel keyboard = new JPanel(new GridLayout(1, 15));
		JPanel background = new JPanel();
		JPanel display = new JPanel();
		JLabel play = new JLabel("JUST PLAY");
		JLabel instructions = new JLabel("USE YOUR KEYBOARD TO PLAY ANY SONG");
		JButton menu = new JButton("CLICK PLAY");
		
		Piano.setVisible(true);
		Piano.setResizable(false);
	    Piano.getContentPane().setBackground(Color.DARK_GRAY);
	    Piano.setLayout(null);
	    Piano.setSize(950,500);
	    
	    keyboard.setBackground(Color.black);
        keyboard.setBounds(62, 200, 825, 300);
        background.setBounds(54, 193, 840, 307);
	    background.setBackground(Color.black);
	    display.setBackground(Color.LIGHT_GRAY);
        display.setBounds(192, 33, 566, 128);
        play.setFont(new Font("Arial", Font.BOLD, 30));
        instructions.setFont(new Font("Arial", Font.PLAIN, 24));
        menu.setFont(new Font("Arial", Font.PLAIN, 24));
        menu.setForeground(Color.white);
        menu.setBackground(Color.BLACK);
        
     // Add ActionListener to the menu item
        menu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create and display a new frame when the menu item is clicked
                JFrame popupFrame = new JFrame("Congratulations!");
                popupFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                popupFrame.setSize(300, 150);
                JLabel label = new JLabel("<html><center>Congratulations! You've unlocked the 'Silent Mode.'<br/>Now your piano will only play in your dreams.</center></html>");
                popupFrame.add(label);
                popupFrame.setVisible(true);
            }
        });
	    
	    Piano.add(keyboard);
	    Piano.add(background);
	    Piano.add(display);
	    keyboard.add(new JButton("C"));
	    keyboard.add(new JButton("D"));
	    keyboard.add(new JButton("E"));
	    keyboard.add(new JButton("F"));
	    keyboard.add(new JButton("G"));
	    keyboard.add(new JButton("A"));
	    keyboard.add(new JButton("B"));
	    keyboard.add(new JButton("C"));
	    keyboard.add(new JButton("D"));
	    keyboard.add(new JButton("E"));
	    keyboard.add(new JButton("F"));
	    keyboard.add(new JButton("G"));
	    keyboard.add(new JButton("A"));
	    keyboard.add(new JButton("B"));
	    keyboard.add(new JButton("C"));
	    display.add(play);
	    display.add(instructions);
	    display.add(menu);
	 
	    
	}
}