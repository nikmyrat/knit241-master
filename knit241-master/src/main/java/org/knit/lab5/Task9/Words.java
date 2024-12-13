package org.knit.lab5.Task9;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Words {
    private String filePath;

    public Words(String filePath) {
        this.filePath = filePath;
    }

    public List<String> getWords() {
        List<String> words = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(filePath));
            while (scanner.hasNext()) {
                words.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + filePath);
            e.printStackTrace();
        }
        return words;
    }
}
