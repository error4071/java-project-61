package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    public static void gcdGame() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println("Find the greatest common divisor of given numbers.");

        for (int i = 0; i < 3; i++) {

            int a = random.nextInt(100);
            int b = random.nextInt(100);

            System.out.println("Question: " + a + " " + b);
            System.out.print("Your answer: ");

            int number = scanner.nextInt();

            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }

            if (number == a) {
                System.out.println("Correct!");
            } else {
                System.out.println(number + " is wrong answer ;(. Correct answer was: " + a);
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
            if (i == 2) {
                System.out.println("Congratulations, " + userName);
            }
        }
    }
}
