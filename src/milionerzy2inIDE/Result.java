package milionerzy2inIDE;

import java.io.*;
import java.util.*;

public class Result {
    public static HashMap<String, Integer> list = new HashMap<>();
     static Scanner scanner = new Scanner(System.in);
     static String name = scanner.next();

    public static void addResult(){
        list.put(name,200);
    }


    public static void rs() throws FileNotFoundException {
        PrintWriter save = new PrintWriter("wyniki.txt");
        System.out.println();
        save.print(list);
        save.close();
        }

    }

