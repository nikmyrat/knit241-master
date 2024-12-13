package org.knit.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task7 {
    public void execute() {
        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\Nikita Muratov\\Desktop\\c#\\dictionary.txt"));
            StringBuilder wordsBuilder = new StringBuilder();

            while (scanner.hasNext()) {
                wordsBuilder.append(scanner.nextLine()).append(" ");
            }
            scanner.close();

            String[] words = wordsBuilder.toString().split("\\s+");

            char[] alphabet = "абвгдеёжзийклмнопрстуфхцчшщыэюя".toCharArray();


            DictionaryStatistic stats = new DictionaryStatistic(words, alphabet);

            System.out.println("Общее количество слов: " + stats.getDictionarySize());
            System.out.println("Количество полиндромов: " + stats.getPolindromCount());
            System.out.println("Максимальная длина слова: " + stats.getMaxWordLength());
            System.out.println("Минимальная длина слова: " + stats.getMinWordLength());

            stats.printSymbolsStat();


            System.out.println("Случайное слово из словаря: " + stats.getRandomWord());

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}

