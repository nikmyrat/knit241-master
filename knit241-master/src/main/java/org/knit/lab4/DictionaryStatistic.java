package org.knit.lab4;

import java.util.Random;

public class DictionaryStatistic {
    private String[] words;
    private int dictionarySize;
    private int polindrom;
    private int maxWordLength;
    private int minWordLength;
    private char[] alphabet;
    private int[] frequency;

    // Изменённый конструктор
    public DictionaryStatistic(String[] words, char[] alphabet) {
        this.words = words;
        this.alphabet = alphabet;
        this.dictionarySize = words.length;
        this.frequency = new int[alphabet.length];
        this.polindrom = 0;
        this.maxWordLength = Integer.MIN_VALUE;
        this.minWordLength = Integer.MAX_VALUE;

        calculateStatistics();
    }

    private void calculateStatistics() {
        for (String word : words) {
            word = word.toLowerCase();

            int wordLength = word.length();
            if (wordLength > maxWordLength) {
                maxWordLength = wordLength;
            }
            if (wordLength < minWordLength) {
                minWordLength = wordLength;
            }

            if (isPalindrome(word)) {
                polindrom++;
            }

            for (char c : word.toCharArray()) {
                int index = getAlphabetIndex(c);
                if (index != -1) {
                    frequency[index]++;
                }
            }
        }
    }

    private boolean isPalindrome(String word) {
        int len = word.length();
        for (int i = 0; i < len / 2; i++) {
            if (word.charAt(i) != word.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    private int getAlphabetIndex(char letter) {
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == letter) {
                return i;
            }
        }
        return -1;
    }

    public String getRandomWord() {
        Random random = new Random();
        int index = random.nextInt(dictionarySize);
        return words[index];
    }

    public void printSymbolsStat() {
        System.out.println("Статистика по буквам:");
        for (int i = 0; i < alphabet.length; i++) {
            System.out.println(alphabet[i] + " - " + frequency[i]);
        }
    }


    public int getPolindromCount() {
        return polindrom;
    }


    public int getMaxWordLength() {
        return maxWordLength;
    }


    public int getMinWordLength() {
        return minWordLength;
    }

    public int getDictionarySize() {
        return dictionarySize;
    }

    public void printAlphabetStats() {
        System.out.println("Частота букв в словаре:");
        for (int i = 0; i < alphabet.length; i++) {
            System.out.println(alphabet[i] + ": " + frequency[i]);
        }
    }
}
