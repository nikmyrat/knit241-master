package org.knit.lab6.Task10;

import java.util.Scanner;

public class Task10 {
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        String filePath = "C:\\Users\\Nikita Muratov\\Desktop\\c#\\dictionary.txt";

        while (playAgain) {
            HangmanGame game = new HangmanGame(filePath);
            game.play();

            System.out.println("\nХотите сыграть снова? (да/нет): ");
            String response = scanner.nextLine().toLowerCase();
            if (!response.equals("да")) {
                playAgain = false;
            }
        }

        System.out.println("Спасибо за игру!");
    }
}
