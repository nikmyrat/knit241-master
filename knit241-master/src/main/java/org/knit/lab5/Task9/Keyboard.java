package org.knit.lab5.Task9;


import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Keyboard {
    private Words wordsLoader;
    private int correctWords;
    private int totalTypedChars;
    private int totalWords;

    public Keyboard(String filePath) {
        wordsLoader = new Words(filePath); // Теперь передаем путь к файлу
    }

    public void startGame() {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + 60000;

        List<String> words = wordsLoader.getWords();
        Random random = new Random();

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Начинайте вводить слова! У вас 1 минута.");

        while (System.currentTimeMillis() < endTime) {
            String wordToType = words.get(random.nextInt(words.size()));

            System.out.println("Введите слово: " + wordToType);

            String userInput = inputScanner.nextLine();
            totalWords++;

            if (userInput.equals(wordToType)) {
                correctWords++;
            }

            totalTypedChars += userInput.length();
        }

        long elapsedTime = System.currentTimeMillis() - startTime;
        double seconds = elapsedTime / 1000.0;
        double typingSpeed = totalTypedChars / seconds;

        System.out.println("\nВремя вышло!");
        System.out.println("Общее количество слов: " + totalWords);
        System.out.println("Правильных слов: " + correctWords);
        System.out.println("Количество введенных символов: " + totalTypedChars);
        System.out.println("Скорость ввода: " + typingSpeed + " символов в секунду");
    }
}
