package org.knit.lab5.Task9;

public class Task9 {
    public void execute() {
        String filePath = "C:\\Users\\Nikita Muratov\\Desktop\\c#\\dictionary.txt";
        Keyboard keyboard = new Keyboard(filePath);
        keyboard.startGame();
    }
}