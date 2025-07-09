import java.awt.*;
import javax.swing.*;

public class Home {
	public static void main(String[] args) {
		MyCanvas c = new MyCanvas();

		JFrame f=new JFrame();
		f.setSize(700,700);
		f.setVisible(true);

		f.add(c);
	}
}