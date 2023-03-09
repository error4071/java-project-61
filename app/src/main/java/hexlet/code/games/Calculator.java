package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Calculator {
    public static void calcGame() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println("What is the result of the expression?");

        for (int i = 0; i < 3; i++) {

        String name[];
        int index;
        name = new String[2];
        name[0] = " + ";
        name[1] = " * ";
        index = random.nextInt(2);
        int a = random.nextInt(100);
        int b = random.nextInt(100);

        System.out.println("Question: " + a + name[index] + b);
        System.out.print("Your answer is: ");

        int number = scanner.nextInt();

            if (number == (a + b) || number == (a * b)) {
                System.out.println("Correct!");
            } else if (number != (a * b)) {
                System.out.println(number + " is wrong answer ;(. Correct answer was: " + (a * b));
                System.out.println("Let's try again, " + userName + "!");
                break;
            } else if (number != (a + b)) {
                System.out.println(number + " is wrong answer ;(. Correct answer was: " + (a + b));
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
                if (i == 2) {
                    System.out.println("Congratulations, " + userName);
            }
        }
    }
}
