package hexlet.code;

import java.util.Scanner;

class App {
    public static void main(String[] arguments) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet /n0 - Exit");
        System.out.println("Your choice " + number );

        System.out.println("Welcome to the Brain Games!");
        Cli.userName();
    }
}
