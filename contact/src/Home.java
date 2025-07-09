import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Home {

	public static void main(String[] args) {
		
	Color backgroundColor = new Color(42, 36, 56);
	
	// DECLARE ALL COMPONENTS
	JFrame frmContact = new JFrame("Contacts");
	JPanel pnlNav = new JPanel();
	ContactButton btnContacts = new ContactButton("Contacts", Color.WHITE);
	JPanel pnlContent = new JPanel();
	JPanel pnlContacts = new JPanel();
	pnlContacts.setLayout(new BoxLayout(pnlContacts, BoxLayout.Y_AXIS));
    
	// CREATE A CONTACT PANEL CONTENT

	String[][] Contacts = {
			{"1.png", "Albert Domingo"},
			{"2.png", "Allison Cruz"},
			{"3.png", "Benedict Diaz"},
			{"4.png", "Bianca Umali"},
			{"5.png", "Charles Sarmiento"},
			{"6.png", "Cherry May"},
			{"7.png", "Diane Barameda"},
			{"8.png", "DingDong Dantes"},
			{"9.png", "Eunice Nazaret"},
			{"10.png", "Eugene Nazaret"},
			{"11.png", "Francine Betito"},
			{"12.png", "Faye Villanueva"},
			{"13.png", "Gwynn Dobouzet"},
			{"14.png", "Gina Croox"},
			{"15.png", "Hannah Dulce"},
			{"16.png", "Harry Potter"},
			{"17.png", "Ina Paganiban"},
			{"18.png", "Inigo Pascual"},
			{"19.png", "Jenna Reyes"},
			{"20.png", "Jomari Castillo"},
	};
	
	List<String> contactNames = new ArrayList<>();
	// for each
	for(String[] Contact : Contacts) {
		
		URL imgurl1 = Home.class.getResource("/" + Contact[0]);
		ImageIcon icnContact = new ImageIcon(imgurl1);
		
        String name = Contact[1];
        contactNames.add(name);
		
        ContactPanel pnlPhoneNum = new ContactPanel(icnContact, name);
		pnlContent.add(pnlPhoneNum);
		pnlContent.setLayout(new WrapLayout());
		
		pnlPhoneNum.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Calling " + name + "...");
            }
            public void mouseEntered(MouseEvent e) {
                pnlPhoneNum.setBackground(new Color(62, 56, 76));
            }
            public void mouseExited(MouseEvent e) {
                pnlPhoneNum.setBackground(backgroundColor);
            }
        });
	}
    
	// SCROLLPANE
	JScrollPane scrContacts = new JScrollPane(pnlContent);

	// SET FRAME SETTINGS
	frmContact.setVisible(true);
	frmContact.setSize(350, 500);
	frmContact.setLayout(new BorderLayout());
	
	// SET PNL NAV SETTINGS
	pnlNav.setLayout(new GridLayout());
	
	// SET PNL CONTENT SETTINGS
	pnlContent.setBackground(backgroundColor);
	
	// ADD TO PANEL
	pnlNav.add(btnContacts);
	pnlContent.add(pnlContacts);
	
	// ADD TO FRAME
	frmContact.add(pnlNav, BorderLayout.NORTH);
	frmContact.add(scrContacts, BorderLayout.CENTER);
	}
}
	