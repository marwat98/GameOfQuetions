package GameOfQuestions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class windowsDefault extends JFrame implements ActionListener {
    JButton comeBack = new JButton("Wróć do menu");
    public void explain(String answerQuest) {

        JLabel explain = new JLabel(answerQuest);

        // wymiary okna
        setSize(500, 500);
        // tytuł apki
        setTitle("20-Questions");

        setLayout(null);
        //określenie pozycji tekstu
        explain.setBounds(70, 50, 500, 20);

        // określenie pozycji przycisku
        comeBack.setBounds(200, 150, 100, 20);

        //dodanie tekstu
        add(explain);

        // dodanie przycisku wroć
        add(comeBack);

        // dodanie akcji przycisku
        comeBack.addActionListener(this);

        // Wyświetlenie okna
        setVisible(true);

        // Umiejscowienie okna
        setLocationRelativeTo(null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == comeBack){
            windowUse okno = new windowUse();
            setVisible(false);
            dispose();
            okno.setVisible(true);
            okno.setLocationRelativeTo(null);
        }
    }
}


