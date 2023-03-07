package hexlet.code;

import java.util.Scanner;
import java.util.Random;


public class EvenGame {
    public static void evenGame() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println("Answer is 'yes' if the number is even, otherwise answer is 'no'.");

        for (int i = 0; i < 3; i++) {

            int number = random.nextInt(100);
            System.out.println("Question: " + number);
            System.out.println("Your answer is: ");

            String answer = scanner.nextLine();


            if (number % 2 == 0 && answer.equals("yes") || number % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");

            } else if (number % 2 != 0 && answer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                        "Let's try again, " + userName + "!");
                break;
            } else if (number % 2 == 0 && answer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\n" +
                        "Let's try again, " + userName + "!");
                break;
            } else if (number % 2 == 0 && answer.equals(answer)) {
                System.out.println(answer + " is wrong answer ;(. Correct answer was 'yes'.\n" +
                        "Let's try again, " + userName + "!");
                break;
            } else if (number % 2 != 0 && answer.equals(answer)) {
                System.out.println(answer + " is wrong answer ;(. Correct answer was 'no'.\n" +
                        "Let's try again, " + userName + "!");
                break;
            }
            if (i == 2) {
                System.out.println("Congratulations, " + userName);
            }
        }
    }
}
