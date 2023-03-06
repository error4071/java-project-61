package hexlet.code;

import java.util.Scanner;
import java.util.Random;


public class EvenGame {
    public static void evenGame() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(1000);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println("Answer is 'yes' if the number is even, otherwise answer is 'no'.");
        System.out.println("Question: " + number);
        System.out.println("Your answer is: ");

        String answer = scanner.nextLine();

        while (true) {
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

            int number1 = random.nextInt(1000);
            System.out.println("Question: " + number1);
            System.out.println("Your answer is: ");
            String answer1 = scanner.nextLine();

            if (number1 % 2 == 0 && answer1.equals("yes") || number1 % 2 != 0 && answer1.equals("no")) {
                System.out.println("Correct!");
            } else if (number1 % 2 != 0 && answer1.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                        "Let's try again, " + userName + "!");
                break;
            } else if (number1 % 2 == 0 && answer1.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\n" +
                        "Let's try again, " + userName + "!");
                break;
            } else if (number1 % 2 == 0 && answer1.equals(answer1)) {
                System.out.println(answer1 + " is wrong answer ;(. Correct answer was 'yes'.\n" +
                        "Let's try again, " + userName + "!");
                break;
            } else if (number1 % 2 != 0 && answer1.equals(answer1)) {
                System.out.println(answer1 + " is wrong answer ;(. Correct answer was 'no'.\n" +
                        "Let's try again, " + userName + "!");
                break;
            }

            int number2 = random.nextInt(1000);
            System.out.println("Question: " + number2);
            System.out.println("Your answer is: ");
            String answer2 = scanner.nextLine();

            if (number2 % 2 == 0 && answer2.equals("yes") || number2 % 2 != 0 && answer2.equals("no")) {
                System.out.println("Correct!");
                System.out.println("Congratulations, " + userName + "!");
                break;
            } else if (number2 % 2 != 0 && answer2.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                        "Let's try again, " + userName + "!");
                break;
            } else if (number2 % 2 == 0 && answer2.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\n" +
                        "Let's try again, " + userName + "!");
                break;
            } else if (number2 % 2 == 0 && answer2.equals(answer2)) {
                System.out.println(answer2 + " is wrong answer ;(. Correct answer was 'yes'.\n" +
                        "Let's try again, " + userName + "!");
                break;
            } else if (number2 % 2 != 0 && answer2.equals(answer2)) {
                System.out.println(answer2 + " is wrong answer ;(. Correct answer was 'no'.\n" +
                        "Let's try again, " + userName + "!");
                break;
            }
        }
    }
}
