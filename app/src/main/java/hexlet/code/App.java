package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCD;

import java.util.Scanner;

class App {
    public static void main(String[] arguments) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calculator");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");

        int number = scanner.nextInt();

        System.out.println("");

        if (number == 1) {
            Cli.userName();
        } else if (number == 2 ) {
            EvenGame.evenGame();
        } else if (number == 3) {
            Calculator.calcGame();
        } else if (number == 4) {
            GCD.gcdGame();
        } else {
            System.exit(0);
        }
    }
}
