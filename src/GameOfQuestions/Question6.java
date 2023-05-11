package GameOfQuestions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Question6 extends BasicQuestion implements ActionListener {
    //Dodanie wylosowaych liczb do tablicy
    public Set<Integer> usedNumbers = new HashSet<>();
    JLabel label6 = new JLabel();

    Question6() {
        //Dodawanie tekstu pytania
        label6.setText("6. Kto w XIX wieku terroryzował dzielnicę Londynu Whitechapel?");
        answerA.setText("A.Tedy Bundy");
        answerB.setText("B.Andriej Czikatilo");
        answerC.setText("C.Brema");
        answerD.setText("D.Kuba Rozpruwacz");

        // Ustawienie tekstu
        label6.setBounds(50, -150, 600, 400);

        //dodawanie tekstu
        add(label6);


        // dodanie akcji przycisku
        answerA.addActionListener(this);
        answerB.addActionListener(this);
        answerC.addActionListener(this);
        answerD.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == answerD) {

            Random rand = new Random();
            // zmienna losowanych numerów
            int number;

            // pętla losowania liczb
            do {
                number = rand.nextInt(10);
            } while (usedNumbers.contains(number));

            // dodanie liczb do zbioru wykorzystywanych
            usedNumbers.add(number);

            switch (number) {
                case 0 -> new Question1();
                case 1 -> new Question2();
                case 2 -> new Question3();
                case 3 -> new Question4();
                case 4 -> new Question5();
                case 5 -> new Question6();
                case 6 -> new Question7();
                case 7 -> new Question8();
                case 8 -> new Question9();
                case 9 -> new Question10();
            }
        } else  {
            windowsDefault quest1 = new windowsDefault();
            quest1.explain("Niestety to bledna odpowiedz przykro mi. Prawidłowa to: D");
        }
        dispose();
    }
}
