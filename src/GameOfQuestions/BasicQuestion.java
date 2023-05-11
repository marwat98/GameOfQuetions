package GameOfQuestions;

import javax.swing.*;

public class BasicQuestion extends JFrame {
    // Ustawienie tekstu do okna
    JLabel label = new JLabel();
    // Ustawienie tekstu kół ratunkowych
    JLabel rescue = new JLabel("Koła ratunkowe");

    // Dodanie przycisków
    JButton answerA = new JButton();
    JButton answerB = new JButton();
    JButton answerC = new JButton();
    JButton answerD = new JButton();
    JButton fiftyFifty = new JButton("50/50");
    JButton questionToPublic = new JButton("Publiczność");
    JButton phoneFriend = new JButton("Telefon");


    BasicQuestion() {
        // Ustawienie tytułu okna
        setTitle("20-Questions");

        // Ustawienie rozmiaru okna
        setSize(500, 500);


        // Dodanie przycisków do okna
        add(answerA);
        add(answerB);
        add(answerC);
        add(answerD);
        //add(fiftyFifty);
        //add(questionToPublic);
        //add(phoneFriend);
        add(label);
        //add(rescue);

        // Ustawienie layoutu na null, aby móc ręcznie pozycjonować przyciski
        setLayout(null);

        // Ustawienie położenia przycisków na oknie
        answerA.setBounds(30, 100, 180, 20);
        answerB.setBounds(30, 150, 180, 20);
        answerC.setBounds(300, 100, 180, 20);
        answerD.setBounds(300, 150, 180, 20);
        //fiftyFifty.setBounds(40, 300, 120, 20);
        //questionToPublic.setBounds(195, 300, 120, 20);
        //phoneFriend.setBounds(350, 300, 120, 20);


        // Ustawienie tekstu
        label.setBounds(150, -150, 600, 400);
        rescue.setBounds(205, 250, 200, 20);


        // Wyświetlenie okna
        setVisible(true);
        // Umiejscowienie okna
        setLocationRelativeTo(null);
    }

}

