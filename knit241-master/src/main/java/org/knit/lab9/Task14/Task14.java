package org.knit.lab9.Task14;

import java.util.Scanner;

public class Task14 {
    public static void execute(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите цвет (RED, YELLOW, GREEN)");
            String light = scanner.nextLine();
            System.out.println((TrafficLight.valueOf(light)).getLight());
        }
    }
}
