import java.awt.*;
import javax.swing.*;

public class ContactButton extends JButton {
	public ContactButton(String text, Color fgColor) {
		this.setBackground(new Color(42, 36, 56));
		this.setText("<html><b><span style='font-size: 15px'>" + text + "</span></b></html>");
		this.setForeground(fgColor);
		this.setBorderPainted(false); 
	}
}