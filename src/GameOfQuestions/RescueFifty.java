package GameOfQuestions;

import javax.swing.*;

public class RescueFifty extends JFrame {
    public void soultion(String answer) {
        JPanel panel = new JPanel(Boolean.parseBoolean(answer));
        JOptionPane.showMessageDialog(null, answer);
        add(panel);
    }
}









