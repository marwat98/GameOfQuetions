package GameOfQuestions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class Question1 extends BasicQuestion implements ActionListener{
    //Dodanie wylosowaych liczb do tablicy
    public Set<Integer>usedNumbers = new HashSet<>();

    Question1() {

        //Dodawanie tekstu pytania oraz odpowiedzi
        label.setText("1.Jałowka to młoda krowa. A jałowiec?");
        answerA.setText("A. młody byk");
        answerB.setText("B. drzewo lub krzew");
        answerC.setText("C. drobnoziarnista skała");
        answerD.setText("D. sterylny opatrunek");
        //Tekst koła ratunkowego
        rescue.setText("Koła ratunkowe");

        // dodanie akcji przycisku
        answerA.addActionListener(this);
        answerB.addActionListener(this);
        answerC.addActionListener(this);
        answerD.addActionListener(this);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == answerB) {

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
        }
        else {
            windowsDefault quest1 = new windowsDefault();
            quest1.explain("Niestety to bledna odpowiedz przykro mi. Prawidłowa to: B");
        }
        dispose();
    }
}






