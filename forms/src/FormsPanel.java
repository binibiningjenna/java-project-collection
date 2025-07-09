import javax.swing.*;
import java.awt.*;

public class FormsPanel extends JPanel {

    private Color homeBg = Color.WHITE;

    public FormsPanel(String[][] questions, JButton submitButton) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); 
        this.setBackground(homeBg);

        // Create each question panel and add to the FormsPanel
        for (String[] question : questions) {
            String questionText = question[0];
            String[] choices = { question[1], question[2] };
            add(createQuestionPanel(questionText, choices));
            add(Box.createVerticalStrut(20)); 
        }

        // Create panel for the submit button and add to FormsPanel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.setBackground(homeBg);
        buttonPanel.add(submitButton); 
        this.add(buttonPanel); 
    }

    // Method to create a panel for each question
    private JPanel createQuestionPanel(String question, String[] choices) {
        JPanel questionPanel = new JPanel();
        questionPanel.setLayout(new BorderLayout()); 
        questionPanel.setBackground(homeBg);
        questionPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); 

        JLabel lblQuestion = new JLabel(question);
        lblQuestion.setFont(new Font("Arial", Font.PLAIN, 16));
        questionPanel.add(lblQuestion, BorderLayout.NORTH); 

        JPanel choicesPanel = new JPanel();
        choicesPanel.setLayout(new BoxLayout(choicesPanel, BoxLayout.Y_AXIS));
        choicesPanel.setBackground(homeBg);

        ButtonGroup buttonGroup = new ButtonGroup();

        // Create checkboxes for each choice and add to choices panel
        for (String choice : choices) {
            JCheckBox checkBox = new JCheckBox(choice);
            checkBox.setFont(new Font("Arial", Font.PLAIN, 16)); 
            checkBox.setAlignmentX(Component.LEFT_ALIGNMENT);
            checkBox.setBackground(homeBg);
            choicesPanel.add(checkBox);
            buttonGroup.add(checkBox); 
        }

        questionPanel.add(choicesPanel, BorderLayout.CENTER); 
        return questionPanel;
    }
}
