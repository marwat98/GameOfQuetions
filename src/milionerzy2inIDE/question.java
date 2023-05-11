package milionerzy2inIDE;

import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public  class question {
    public static void questanswer() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(31);
        for (int i = 0; i <= 2; i++) {
                switch (number) {
                    case 0:
                        System.out.println("1.Jałowka to młoda krowa. A jałowiec?");
                        System.out.println("A.młody byk");
                        System.out.println("B.drzewo lub krzew");
                        System.out.println("C.drobnoziarnista skała");
                        System.out.println("D.sterylny opatrunek");
                        String answer = scanner.nextLine();

                        if (answer.equals("b")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println();
                            Result.addResult();
                            Result.rs();

                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.out.println("Prawidłowa odpowiedź to: B.drzewo lub krzew");
                            System.exit(0);
                        }
                        break;


                    case 1:
                        System.out.println("2.Pojawia się u Galla Anonima jako żona Piasta matka Siemowita.");
                        System.out.println("A.Rzepka");
                        System.out.println("B.Kalaperka");
                        System.out.println("C.Pietruszka");
                        System.out.println("D.Rzodkiewka");
                        String answer1 = scanner.next();
                        if (answer1.equals("a")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println();
                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.out.println("Prawidłowa odpowiedź to: A.Rzepka");
                            System.exit(0);

                        }
                        break;

                    case 2:
                        System.out.println("3.W przód to do przodu, a wprzód?");
                        System.out.println("A.tez do przodu");
                        System.out.println("B.do tylu");
                        System.out.println("C.najpierw");
                        System.out.println("D.potem");
                        String answer2 = scanner.next();
                        if (answer2.equals("c")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println();
                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.out.println("Prawidłowa odpowiedź to: C.najpierw");
                            System.exit(0);
                        }
                        break;

                    case 3:
                        System.out.println("4.Jezioro Goczałkowickie to utworzony w 1965 r. zbiornik zaporowy w województwie śląskim. Na jakiej rzece?");
                        System.out.println("A.na Odrze");
                        System.out.println("B.na Obrze");
                        System.out.println("C.na Wisle");
                        System.out.println("D.na Wisloce");
                        String answer3 = scanner.next();
                        if (answer3.equals("c")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println();
                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.out.println("Prawidłowa odpowiedź to: C.na Wisle");
                            System.exit(0);
                        }
                        break;

                    case 4:
                        System.out.println("5.Do sikor nie zalicza się...");
                        System.out.println("A.bogatek");
                        System.out.println("B.modraszek");
                        System.out.println("C.cyraneczek");
                        System.out.println("D.czubatek");
                        String answer4 = scanner.next();
                        if (answer4.equals("c")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println();
                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.out.println("Prawidłowa odpowiedź to: C.cyraneczek");
                            System.exit(0);
                        }
                        break;

                    case 5:
                        System.out.println("6.Do sikor nie zalicza się...");
                        System.out.println("A.Synaj");
                        System.out.println("B.Karmel");
                        System.out.println("C.Ararat");
                        System.out.println("D.Gora Oliwna");
                        String answer5 = scanner.next();
                        if (answer5.equals("a")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println();
                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.out.println("Prawidłowa odpowiedź to: A.Synaj");
                            System.exit(0);
                        }
                        break;

                    case 6:
                        System.out.println("7.Saksy to okresowa praca zarobkowa za granicą. Określenie to pochodzi od nazwy niemieckiego kraju związkowego, którego stolicą jest:");
                        System.out.println("A.Drezno");
                        System.out.println("B.Hamburg");
                        System.out.println("C.Brema");
                        System.out.println("D.Kolonia");
                        String answer6 = scanner.next();
                        if (answer6.equals("a")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println();
                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.out.println("Prawidłowa odpowiedź to: A.Drezno");
                            System.exit(0);
                        }
                        break;

                    case 7:
                        System.out.println("8.Który z wymienionych to odmiana kwarcu o fioletowej barwie wywołanej domieszką żelaza?");
                        System.out.println("A.akwamaryn");
                        System.out.println("B.turkus");
                        System.out.println("C.szmaragd");
                        System.out.println("D.ametyst");
                        String answer7 = scanner.next();
                        if (answer7.equals("a")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println();
                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.out.println("Prawidłowa odpowiedź to: A.akwamaryn");
                            System.exit(0);
                        }
                        break;

                    case 8:
                        System.out.println("9.W związku Harcerstwa Polskiego młodzikowi odpowiada ochotniczka, harcerce orlej – harcerz orli. Kto odpowiada samarytance?");
                        System.out.println("A.wywiadowca");
                        System.out.println("B.odkrywca");
                        System.out.println("C.cwik");
                        System.out.println("D.samarytanin");
                        String answer8 = scanner.next();
                        if (answer8.equals("a")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println();
                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.out.println("Prawidłowa odpowiedź to: A.wywiadowca");
                            System.exit(0);
                        }
                        break;

                    case 9:
                        System.out.println("10.Hybrydy...");
                        System.out.println("A.zmywa sie acetonem");
                        System.out.println("B.utwardza sie lampa UV");
                        System.out.println("C.leza u wybrzezy Polski");
                        System.out.println("D.leza u wybrzezy Szkocji");
                        String answer9 = scanner.next();
                        if (answer9.equals("a")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println();
                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.out.println("Prawidłowa odpowiedź to: A.zmywa sie acetonem");
                            System.exit(0);
                        }
                        break;

                    case 10:
                        System.out.println("11. Jakie środki dodaje się do benzyny?");
                        System.out.println("A.przeciwstukowe");
                        System.out.println("B.przeciwlomotowe");
                        System.out.println("C.antyposlizgowe");
                        System.out.println("D.antystrzelnicze");
                        String answer10 = scanner.next();
                        if (answer10.equals("a")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println();
                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.out.println("Prawidłowa odpowiedź to: A.przeciwstukowe");
                            System.exit(0);
                        }
                        break;

                    case 11:
                        System.out.println("12. Jeśli trzy kuguary obserwują trzy kazuary, to ile mają nóg zwierzęta obserwujące i obserwowane w sumie?");
                        System.out.println("A.szesc");
                        System.out.println("B.dwanascie");
                        System.out.println("C.osiemnascie");
                        System.out.println("D.dwadziescia cztery");
                        String answer11 = scanner.next();
                        if (answer11.equals("c")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println();
                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.out.println("Prawidłowa odpowiedź to: C.osiemnascie");
                            System.exit(0);
                        }
                        break;

                    case 12:
                        System.out.println("13.Bose z nazwy.");
                        System.out.println("A.wizytki");
                        System.out.println("B.szarytki");
                        System.out.println("C.karmelitanki");
                        System.out.println("D.nazaretanki");
                        String answer12 = scanner.next();
                        if (answer12.equals("c")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println();
                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.out.println("Prawidłowa odpowiedź to: C.karmelitanki");
                            System.exit(0);
                        }
                        break;

                    case 13:
                        System.out.println("14. Kto w XIX wieku terroryzował dzielnicę Londynu Whitechapel?");
                        System.out.println("A.Tedy Bundy");
                        System.out.println("B.Andriej Czikatilo");
                        System.out.println("C.Zodiak");
                        System.out.println("D.Kuba Rozpruwacz");
                        String answer13 = scanner.next();
                        if (answer13.equals("d")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println();
                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.out.println("Prawidłowa odpowiedź to: D.Kuba Rozpruwacz");
                            System.exit(0);
                        }
                        break;

                    case 14:
                        System.out.println("15. Antaba ma zwykle kształt...");
                        System.out.println("A.malenkiej drazetki");
                        System.out.println("B.deseczki z mlotkiem");
                        System.out.println("C.muszli slimaka");
                        System.out.println("D.lwiej glowy z obrecza");
                        String answer14 = scanner.next();
                        if (answer14.equals("d")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println();
                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.out.println("Prawidłowa odpowiedź to: D.lwiej glowy z obrecza");
                            System.exit(0);
                        }
                        break;

                    case 15:
                        System.out.println("16. Który związek najczęściej nazywany jest białkiem młodości?");
                        System.out.println("A.platoniczny");
                        System.out.println("B.poligamiczny");
                        System.out.println("C.keratyna");
                        System.out.println("D.kolagen");
                        String answer15 = scanner.next();
                        if (answer15.equals("d")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println();
                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.out.println("Prawidłowa odpowiedź to: D.kolagen");
                            System.exit(0);
                        }
                        break;

                    case 16:
                        System.out.println("17. Z pewnością oksymoron.");
                        System.out.println("A.swiety Mateusz");
                        System.out.println("B.swiety ateusz");
                        System.out.println("C.snieta inka");
                        System.out.println("D.snieta swinka");
                        String answer16 = scanner.next();
                        if (answer16.equals("b")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println("Prawidłowa odpowiedź to: B.swiety ateusz");
                            System.out.println();
                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.exit(0);
                        }
                        break;

                    case 17:
                        System.out.println("18. Jakiej tematyce poświęcone jest renomowane pismo, z którym w 1983 r. Anna Wintour związała swoje losy?");
                        System.out.println("A.kuchni molekularnej");
                        System.out.println("B.modzie i stylowi zycia");
                        System.out.println("C.medycynie holistycznej");
                        System.out.println("D.zjawiskom paranormalnym");
                        String answer17 = scanner.next();
                        if (answer17.equals("b")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println();
                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.out.println("Prawidłowa odpowiedź to: B.modzie i stylowi zycia");
                            System.exit(0);
                        }
                        break;

                    case 18:
                        System.out.println("19. W którym kraju większą część ludności stanowią Khmerowie?");
                        System.out.println("A.w Wietnamie");
                        System.out.println("B.w Kambodzy");
                        System.out.println("C.w Tajlandii");
                        System.out.println("D.w Laosie");
                        String answer18 = scanner.next();
                        if (answer18.equals("b")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println();
                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.out.println("Prawidłowa odpowiedź to: B.w Kambodzy");
                            System.exit(0);
                        }
                        break;

                    case 19:
                        System.out.println("20. Głośny transfer 2021 roku to przejście piłkarza Lionela Messiego z Barcelony do klubu...");
                        System.out.println("A.Manchaster United");
                        System.out.println("B.Bayern Munachium");
                        System.out.println("C.Juventus Turyn");
                        System.out.println("D.Paris Saint-Germain");
                        String answer19 = scanner.next();
                        if (answer19.equals("d")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println("Prawidłowa odpowiedź to: D.Paris Saint-Germain");
                            System.out.println();
                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.exit(0);
                        }
                        break;

                    case 20:
                        System.out.println("21. „Arko! tyś żadnym nie złamana ciosem” napisał Adam Mickiewicz, odnosząc się do...");
                        System.out.println("A.korabia syna Lamecha");
                        System.out.println("B.zloconej skrzyni ojca Chama");
                        System.out.println("C.statku Mojzesza");
                        System.out.println("D.wiesci gminnej");
                        String answer20 = scanner.next();
                        if (answer20.equals("d")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println();
                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.out.println("Prawidłowa odpowiedź to: D.wiesci gminnej");
                            System.exit(0);
                        }
                        break;

                    case 21:
                        System.out.println("22. I ta, i ten.");
                        System.out.println("A.obojczyk");
                        System.out.println("B.piszczel");
                        System.out.println("C.strzalka");
                        System.out.println("D.zuchwa");
                        String answer21 = scanner.next();
                        if (answer21.equals("b")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println();
                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.out.println("Prawidłowa odpowiedź to: B.piszczel");
                            System.exit(0);
                        }
                        break;

                    case 22:
                        System.out.println("23. Przyklejane noski robimy sobie...");
                        System.out.println("A.ze skrzydlakow klonu");
                        System.out.println("B.z miseczek owocowych debu");
                        System.out.println("C.z orzeszkow buka");
                        System.out.println("D.z lisci bukszpanu");
                        String answer22 = scanner.next();
                        if (answer22.equals("a")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println();
                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.out.println("Prawidłowa odpowiedź to: A.ze skrzydlakow klonu");
                            System.exit(0);
                        }
                        break;

                    case 23:
                        System.out.println("24. Gdzie Nowy Rok świętuje się co roku najwcześniej?");
                        System.out.println("A.na Alasce");
                        System.out.println("B.w Australii");
                        System.out.println("C.na Grenlandii");
                        System.out.println("D.w Ghanie");
                        String answer23 = scanner.next();
                        if (answer23.equals("b")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println();
                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.out.println("Prawidłowa odpowiedź to: B.w Australii");
                            System.exit(0);
                        }
                        break;

                    case 24:
                        System.out.println("25. W jakim szyku do nieba szli żołnierze z Westerplatte, „kiedy się wypełniły dni i przyszło zginąć latem”?");
                        System.out.println("A.dwojkami");
                        System.out.println("B.czworkami");
                        System.out.println("C.w defiladowym");
                        System.out.println("D.w bitewnym");
                        String answer24 = scanner.next();
                        if (answer24.equals("b")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println();
                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.out.println("Prawidłowa odpowiedź to: B.czworkami");
                            System.exit(0);
                        }
                        break;

                    case 25:
                        System.out.println("26. Tangram to stara chińska łamigłówka. Co tworzy jej siedem elementów?\n");
                        System.out.println("A.krotkie wierszyki");
                        System.out.println("B.figury geometryczne");
                        System.out.println("C.utwory muzyczne");
                        System.out.println("D.wzory algebraiczne");
                        String answer25 = scanner.next();
                        if (answer25.equals("b")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println();
                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.out.println("Prawidłowa odpowiedź to: B.figury geometryczne");
                            System.exit(0);
                        }
                        break;

                    case 26:
                        System.out.println("27. Fjut to tradycyjny produkt województwa kujawsko-pomorskiego. Jego głównym składnikiem jest sacharoza, bo powstaje...\n");
                        System.out.println("A.z miodu");
                        System.out.println("B.z mleka");
                        System.out.println("C.z burakow cukrowych");
                        System.out.println("D.z jablek i winogron");
                        String answer26 = scanner.next();
                        if (answer26.equals("c")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println();
                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.out.println("Prawidłowa odpowiedź to: B.z burakow cukrowych");
                            System.exit(0);
                        }
                        break;

                    case 27:
                        System.out.println("28. Dziś kontent to treść, a dawniej...");
                        System.out.println("A.pluton");
                        System.out.println("B.uran");
                        System.out.println("C.rad");
                        System.out.println("D.radon");
                        String answer27 = scanner.next();
                        if (answer27.equals("c")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println();
                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.out.println("Prawidłowa odpowiedź to: C.rad");
                            System.exit(0);
                        }
                        break;

                    case 28:
                        System.out.println("29. Wykonywana przez Elvisa Presleya piosenka „It’s Now or Never” to wersja słynnego utworu. Jakiego?");
                        System.out.println("A.Ave Maria");
                        System.out.println("B.Besame mucho");
                        System.out.println("C.O sole Mio");
                        System.out.println("D.Quando, quando, quando");
                        String answer28 = scanner.next();
                        if (answer28.equals("c")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println();
                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.out.println("Prawidłowa odpowiedź to: C.O sole Mio");
                            System.exit(0);
                        }
                        break;

                    case 29:
                        System.out.println("30. Mniej więcej w jakiej odległości od nas uderzył piorun, jeśli od błysku do grzmotu upłynęło 10 sekund?");
                        System.out.println("A. 1km");
                        System.out.println("B. 3,5km");
                        System.out.println("C. 6,5km");
                        System.out.println("D. 10km");
                        String answer29 = scanner.next();
                        if (answer29.equals("b")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println();
                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.out.println("Prawidłowa odpowiedź to: B. 3,5km");
                            System.exit(0);
                        }
                        break;

                    case 30:
                        System.out.println("31. Który sakrament Kościoła katolickiego odpowiada sakramentowali miropomazania w Kościele prawosławnym?");
                        System.out.println("A.namaszczenie chorych");
                        System.out.println("B.bierzmowanie");
                        System.out.println("C.slub");
                        System.out.println("D.eucharystia");
                        String answer30 = scanner.next();
                        if (answer30.equals("b")) {
                            System.out.println("Gratulacje to dobra odpowiedz");
                            System.out.println();
                        } else {
                            System.out.println("Niestety to bledna odpowiedz przykro mi");
                            System.out.println("Prawidłowa odpowiedź to: B.bierzmowanie");
                            System.exit(0);
                        }
                        break;
                }

            }
        }
    }

