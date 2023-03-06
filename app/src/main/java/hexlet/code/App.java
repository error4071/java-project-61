package hexlet.code;

import java.util.Scanner;

class App {
    public static void main(String[] arguments) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        int number = scanner.nextInt();

        System.out.println("Your choice " + number );

        if (number == 1) {
            Cli.userName();
        } else if (number == 2 ) {
            EvenGame.evenGame();
        } else {
            System.exit(0);
        }
    }
}
