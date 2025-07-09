import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class StartPanel extends JPanel {
   
	Color pnlHeader = new Color(247, 157, 243);

    public StartPanel(String title, String description) {
        this.setPreferredSize(new Dimension(1167, 278));
        this.setBackground(pnlHeader);
        
        JLabel lblTitle = new JLabel(title);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 64));
        
        JLabel lblDescription = new JLabel("<html><div style='width: 100%; text-align: left;'>" + description + "</div></html>");
        lblDescription.setFont(new Font("Arial", Font.PLAIN, 19));
        
        // Set layout and padding
        int padding = 20;
        lblTitle.setBorder(new EmptyBorder(0, padding, 0, padding));
        lblDescription.setBorder(new EmptyBorder(0, padding, 0, padding));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        // Add components with vertical spacing
        add(Box.createVerticalStrut(40)); 
        add(lblTitle);
        add(Box.createVerticalStrut(45)); 
        add(lblDescription);
    }
}
