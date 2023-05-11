package GameOfQuestions;

import javax.swing.*;

public class mainWindowProgram {
    public static void main(String[] args) {
        windowUse okno = new windowUse();
        // zamkniecie operacji
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // ustawienie okna
        okno.setLocationRelativeTo(null);
        // widoczność okna
        okno.setVisible(true);
    }
}
