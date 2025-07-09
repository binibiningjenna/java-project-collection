import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ContactPanel extends JPanel {
	JLabel lblTitle;
	boolean available;

	public ContactPanel(ImageIcon icn, String name) {
		this.setBackground(new Color(42, 36, 56));
		this.setPreferredSize(new Dimension(280,40));
		this.setLayout(null);
		
		JLabel lblPicture = new JLabel();
		lblPicture.setIcon(icn);
		lblPicture.setBounds(10, 3, 40, 40);
		
		JLabel lblName = new JLabel("<html><b><span style='font-family: Arial, Helvetica, sans-serif; font-size: 12px'>" + name + "</span></b></html>");
		lblName.setBounds(55, 3, 220, 33);
		lblName.setForeground(Color.WHITE);
		
		this.add(lblPicture);
		this.add(lblName);
	}
}