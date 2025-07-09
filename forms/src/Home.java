import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home {

    private static boolean isTimerUp = false;

    public static void main(String[] args) {
        // Define colors
        Color homeBg = Color.WHITE;
        Color buttonBg = new Color(247, 157, 243);
        Color formsBg = new Color(222, 155, 219);

        // Create main frame
        JFrame f = new JFrame("Integrative Programming and Technologies Forms");

        // Create main content panel with CardLayout
        JPanel pnlContent = new JPanel(new CardLayout());

        // Create home panel
        JPanel pnlHome = new JPanel();
        pnlHome.setPreferredSize(new Dimension(1167, 585));
        pnlHome.setBackground(homeBg);

        // Create button and button panel
        JButton btnStart = new JButton("Start Now");
        btnStart.setPreferredSize(new Dimension(150, 40));
        btnStart.setBackground(buttonBg);
        btnStart.setFont(new Font("Arial", Font.BOLD, 20));

        JPanel pnlButton = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        pnlButton.setBackground(homeBg);
        pnlButton.add(btnStart);

        // Create start panel with title and description
        String title = "QUIZ 1";
        String description = "Please read each question carefully before you answer. Make sure to select or type"
                + " your answer for each question. Remember to rely solely on your own knowledge and understanding throughout"
                + " the quiz. You have only 5 minutes to complete"
                + " the form. When you are done, review your answers and click 'Submit.'";
        StartPanel pnlStart = new StartPanel(title, description);

        // Add components to home panel
        pnlHome.setLayout(new BorderLayout());
        pnlHome.add(pnlStart, BorderLayout.NORTH);
        pnlHome.add(pnlButton, BorderLayout.SOUTH);

        // Add home panel to content panel
        pnlContent.add(pnlHome, "homePanel");

        // Create and add new panel to content panel
        JPanel newPanel = new JPanel(new BorderLayout());
        newPanel.setBackground(formsBg);

        // Create timer panel and add to content panel
        TimerPanel pnlTimer = new TimerPanel("00:00", new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                isTimerUp = true;
            }
        });
        
        JPanel pnlTimerWrapper = new JPanel();
        pnlTimerWrapper.setPreferredSize(new Dimension(846, 50));
        pnlTimerWrapper.setBackground(formsBg);
        pnlTimerWrapper.add(pnlTimer);
        newPanel.add(pnlTimerWrapper, BorderLayout.NORTH);

        // Questions array
        String[][] questions = {
                {"JFrame works like the main window", "True", "False"},
                {"The JTextField class is used to create a labeled button that has platform independent implementation.", "True", "False"},
                {"The ActionListener interface is found in java.awt.event package.", "True", "False"},
                {"The object of a JPasswordField class is a text component specialized for password entry.", "True", "False"},
                {"The object of JLabel class is a component for placing text in a container.", "True", "False"},
                {"The JCheckBox class is used to create a radio button.", "True", "False"},
                {"The JButton is a simplest container class.", "True", "False"},
                {"The JOptionPane class is used to provide standard dialog boxes.", "True", "False"},
                {"It is used to arrange components in a particular manner.", "LayoutManagers", "BorderLayout"},
                {"It is used to arrange the components in five regions: north, south, east, west and center.", "LayoutManagers", "BorderLayout"},
                {"It is used to arrange the components in rectangular grid.", "GridLayout", "BorderLayout"}
        };

        // Create submit button
        JButton submitForm = new JButton("SUBMIT");
        submitForm.setPreferredSize(new Dimension(166, 40));
        submitForm.setBackground(buttonBg);
        submitForm.setFont(new Font("Arial", Font.BOLD, 20));

        // Add action listener to submit button
        submitForm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (pnlContent.getLayout());
                String endTitle = isTimerUp ? "QUIZ 1 - Not Submitted" : "QUIZ 1 - Submitted";
                String endDescription = isTimerUp ? "This form is no longer accepting responses. We appreciate your participation, but the time limit for submissions has passed."
                        + " If you have any further questions, please feel free to contact us."
                        : "You have already responded. Thank you for your participation."
                        + " Your answers have been recorded and will be reviewed shortly. If you have any further questions, please feel free to contact us.";

                EndPanel submittedPanel = new EndPanel(endTitle, endDescription);
                submittedPanel.setBackground(formsBg);
                pnlContent.add(submittedPanel, "submittedPanel");
                cl.show(pnlContent, "submittedPanel");
            }
        });

        // Create forms panel with questions and submit button
        FormsPanel formsPanel = new FormsPanel(questions, submitForm);

        JPanel formWrapper = new JPanel(new BorderLayout());
        formWrapper.setBackground(formsBg);

        // Create a JScrollPane for formsPanel
        JScrollPane scrollPane = new JScrollPane(formsPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setPreferredSize(new Dimension(850, 580));

        formWrapper.add(scrollPane, BorderLayout.CENTER);
        newPanel.add(formWrapper, BorderLayout.CENTER);

        // Add new panel to content panel
        JPanel npContent = new JPanel();
        npContent.setPreferredSize(new Dimension(850, 580));
        npContent.setBackground(formsBg);
        npContent.add(newPanel);
        pnlContent.add(npContent, "newPanel");

        // Action listener for start button
        btnStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (pnlContent.getLayout());
                cl.show(pnlContent, "newPanel");
            }
        });

        // Set frame settings
        f.setSize(1280, 680);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setContentPane(pnlContent);

        // Show the initial panel
        CardLayout cl = (CardLayout) (pnlContent.getLayout());
        cl.show(pnlContent, "homePanel");
    }
}
