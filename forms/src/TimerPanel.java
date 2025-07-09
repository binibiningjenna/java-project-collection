import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TimerPanel extends JPanel{
	
    int remainingTime = 300;
    
    public TimerPanel(String time, ActionListener timeUpListener) {
        this.setPreferredSize(new Dimension(846, 50));
        this.setBackground(Color.WHITE);
      
        JLabel lblTimer = new JLabel(time, SwingConstants.CENTER);
        lblTimer.setPreferredSize(new Dimension(846, 50));
        lblTimer.setFont(new Font("Arial", Font.BOLD, 25));
       
        this.setLayout(new BorderLayout());
        this.add(lblTimer, BorderLayout.CENTER);
        
     // Create and start a timer to countdown
        Timer quizTimer = new Timer(1000, e -> {
            remainingTime--;
            int minutes = remainingTime / 60;
            int seconds = remainingTime % 60;
            lblTimer.setText(String.format("%02d:%02d", minutes, seconds));
            if (remainingTime <= 0) {
                ((Timer)e.getSource()).stop();
                lblTimer.setText("Time's up!");
                timeUpListener.actionPerformed(null);
            }
        });
        
        quizTimer.start();
    }
}
