package GameOfQuestions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class windowLifeRing extends JFrame implements ActionListener {
        JButton back = new JButton("Wróć do pytania");
        JLabel label = new JLabel("Odpowiedź to:");
        public void explain(String answerQuest) {

            JLabel explain = new JLabel(answerQuest);

            // wymiary okna
            setSize(500, 500);
            // tytuł apki
            setTitle("20-Questions");

            setLayout(null);
            //określenie pozycji tekstu
            explain.setBounds(200, 100, 500, 20);
            label.setBounds(210, 40, 500, 20);


            // określenie pozycji przycisku
            back.setBounds(180, 200, 150, 20);

            //dodanie tekstu
            add(explain);
            add(label);

            // dodanie przycisku wroć
            add(back);

            // dodanie akcji przycisku
            back.addActionListener(this);

            // Wyświetlenie okna
            setVisible(true);

            // Umiejscowienie okna
            setLocationRelativeTo(null);
        }


        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == back){
                new Question1();

            }
        }
    }

