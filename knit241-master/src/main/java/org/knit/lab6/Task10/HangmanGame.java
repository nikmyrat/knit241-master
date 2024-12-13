package org.knit.lab6.Task10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HangmanGame {
    private static final int MAX_ATTEMPTS = 6;
    private List<String> wordList;
    private Set<Character> guessedLetters;
    private String wordToGuess;
    private List<Character> currentState;

    public HangmanGame(String filePath) {
        wordList = new ArrayList<>();
        guessedLetters = new HashSet<>();
        loadWordsFromFile(filePath);
    }


    private void loadWordsFromFile(String filePath) {
        try {
            Scanner scanner = new Scanner(new File(filePath));
            while (scanner.hasNextLine()) {
                String word = scanner.nextLine().trim();
                if (!word.isEmpty() && word.length() >= 4 && word.length()<=8) {
                    wordList.add(word);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + filePath);
            e.printStackTrace();
        }
    }


    private void chooseWord() {
        Random random = new Random();
        wordToGuess = wordList.get(random.nextInt(wordList.size()));
        currentState = new ArrayList<>(Collections.nCopies(wordToGuess.length(), '_'));
    }

    private void printCurrentState() {
        for (char c : currentState) {
            System.out.print(c + " ");
        }
        System.out.println();
    }


    private boolean makeGuess(char letter) {
        if (guessedLetters.contains(letter)) {
            System.out.println("Эту букву вы уже угадывали.");
            return false;
        }

        guessedLetters.add(letter);

        boolean correctGuess = false;


        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == letter) {
                currentState.set(i, letter);
                correctGuess = true;
            }
        }

        return correctGuess;
    }

    public void play() {
        if (wordList.isEmpty()) {
            System.out.println("Словарь пуст или файл не загружен корректно.");
            return;
        }

        chooseWord();

        int attemptsLeft = MAX_ATTEMPTS;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в игру Виселица!");
        System.out.println("Загаданное слово: ");
        printCurrentState();

        while (attemptsLeft > 0) {
            System.out.println("\nВведите букву:");
            char guess = scanner.nextLine().toLowerCase().charAt(0);

            if (makeGuess(guess)) {
                System.out.println("Правильно!");
            } else {
                attemptsLeft--;
                System.out.println("Неверно! Осталось попыток: " + attemptsLeft);
            }

            printCurrentState();

            if (!currentState.contains('_')) {
                System.out.println("Поздравляем! Вы угадали слово: " + wordToGuess);
                return;
            }
        }

        System.out.println("Вы проиграли! Загаданное слово было: " + wordToGuess);
    }
}
