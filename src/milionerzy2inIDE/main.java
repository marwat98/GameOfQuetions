package milionerzy2inIDE;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
/** Instrukcja obsługi:

 * Jezeli chcemy zacząć gre w pierwszej kolejności musimy
   nacisnąć przycisk "Run" który znajduje się w prawym górnym rogu lub
   na dole w konsoli gdzie wyśiwtlana jest cała gra

 * Następnie po uruchomieniu programu pojawią się na pulpicie konsoli informacje które są kluczowe do
   do uruchomienia gry. Czyli jeśli chcemy zagrać klikamy przycisk 1 zatwierdzając go enterem
   to samo tyczy sie przy udzielaniu odpowiedzi naciskamy dana litere i zatwierdzamy ją enetrerem



 ** Informacje dotyczące pytań w grze:

 * Jeśli udzielimy poprawnej odpowiedzi analogicznie przejdziemy do kolejnego pytania
 * W przypadku złej odpowiedzi kończymy gre

 ***** Jeśli wszystko jasne nie czekajmy dłużej zaczynajmy grę *****

 */
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Witamy w milionerach");
        System.out.println();
        System.out.println("1.Graj wcisnij przycisk 1");
        System.out.println("2.Pokarz wyniki wcisnij przycisk 2");
        System.out.println("3.Wyjdz wscisnij przycisk 3");
        int number = scanner.nextInt();

        switch(number){
            case 1:
                question.questanswer();
                break;
            case 2:
                Result.rs();
                break;
            case 3:
                System.exit(0);
                break;
        }

    }
}
