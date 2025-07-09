import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class EndPanel extends JPanel {
 
    public EndPanel(String endTitle, String endDescription) {
    	this.setPreferredSize(new Dimension(1167, 278));
    	
    	JLabel lblTitle = new JLabel(endTitle);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 64));
        
        JLabel lblDescription = new JLabel("<html><div style='width: 100%; text-align: left;'>" + endDescription + "</div></html>");
        lblDescription.setFont(new Font("Arial", Font.PLAIN, 20));
        
        // Set layout and padding
        int padding = 20;
        lblTitle.setBorder(new EmptyBorder(0, padding, 0, padding));
        lblDescription.setBorder(new EmptyBorder(0, padding, 50, padding));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        // Add components with vertical spacing
        this.add(Box.createVerticalStrut(40)); 
        this.add(lblTitle);
        this.add(Box.createVerticalStrut(45)); 
        this.add(lblDescription);
        
     // Create and add components to end panel
        JPanel pnlEnd = new JPanel();
        pnlEnd.setPreferredSize(new Dimension(1167, 307));
        pnlEnd.setBackground(Color.WHITE);
        this.add(pnlEnd, BorderLayout.SOUTH);
    }
}