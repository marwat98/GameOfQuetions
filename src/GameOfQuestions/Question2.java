package GameOfQuestions;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Question2 extends BasicQuestion implements ActionListener {
    //Dodanie wylosowaych liczb do tablicy
    public Set<Integer> usedNumbers = new HashSet<>();
    JLabel label2 = new JLabel();

    Question2() {

        //Dodawanie tekstu pytania oraz odpowiedzi
        label2.setText("2.Pojawia się u Galla Anonima jako żona Piasta matka Siemowita.");
        answerA.setText("A.Rzepka");
        answerB.setText("B.Kalaperka");
        answerC.setText("C.Pietruszka");
        answerD.setText("D.Rzodkiewka");

        // Ustawienie tekstu
        label2.setBounds(50, -150, 600, 400);

        //dodawanie tekstu
        add(label2);

        // dodanie akcji przycisku
        answerA.addActionListener(this);
        answerB.addActionListener(this);
        answerC.addActionListener(this);
        answerD.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == answerA) {

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
        } else {
            windowsDefault quest1 = new windowsDefault();
            quest1.explain("Niestety to bledna odpowiedz przykro mi. Prawidłowa to: A");

        }
        dispose();
    }
}
/**
 * else if (e.getSource() == fiftyFifty){
 *             RescueFifty fif = new RescueFifty();
 *             fif.soultion(" B. 50% , D. 50%");
 *             useThingQ1();
 *
 *         } else if (e.getSource() == questionToPublic){
 *             RescueFifty questPublic = new RescueFifty();
 *             questPublic.soultion("Według publiczności prawdiłowa odpowiedź to: A. 30% , B. 70% , C. 20%, D. 50%");
 *             useThingQ1();
 *
 *         } else if(e.getSource() == phoneFriend){
 *             RescueFifty phone = new RescueFifty();
 *             phone.soultion("Cześć wiesz co mam zawachania między odpowiedzią B oraz D myśle że w 55% bedzie to odpowiedź B");
 *             useThingQ1();
 *
 *         } else  {
 *             windowsDefault quest1 = new windowsDefault();
 *             quest1.explain("Niestety to bledna odpowiedz przykro mi. Prawidłowa to: B");
 *             useThingQ1();
 *         }
 */
