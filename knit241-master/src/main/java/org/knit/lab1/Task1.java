package org.knit.lab1;

public class Task1 {

    public void execute() {
        for (int j = 0; j < 10; j++) {
            String line = "";
            for (int i = 1; i <= 10; i++) {
                int number = i + j * 10;
                line += (i != 10) ? number + "," : number;
            }
            System.out.println(line);
        }
    }
}
