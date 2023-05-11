package GameOfQuestions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class windowUse extends JFrame implements ActionListener {
    JLabel welcome = new JLabel("Witaj w grze Gra w pytania");
    JButton button = new JButton("Graj");

    public Set<Integer> usedNumbers;

    windowUse() {

        setSize(500, 500);
        setTitle("20-Questions");
        setLayout(null);

        //Dodanie wylosowaych liczb do tablicy
        usedNumbers = new HashSet<>();

        // parametry przycisków i napisów
        welcome.setBounds(170, 50, 200, 20);
        button.setBounds(175, 100, 150, 50);

        // dodanie akcji przycisku
        button.addActionListener(this);

        add(welcome);
        add(button);

    }
    // metoda wykonująca czynność po naciśnięciu przycisku
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
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
            dispose();
        }
    }
}






