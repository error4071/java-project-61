package hexlet.code;

import java.util.Scanner;
import java.util.Random;


public class Engine {
    public static void engineMode() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
