package org.knit.lab2.Task3;
import java.util.Scanner;

public class Task3 {

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean running = true;

        while (running) {
            System.out.print("Введите первое число (или exit для выхода): ");
            String input1 = scanner.nextLine();

            if (input1.equalsIgnoreCase("exit")) {
                System.out.println("Выход из программы.");
                running = false;
                continue;
            }

            double num1;
            try {
                num1 = Double.parseDouble(input1);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Неверный ввод числа.");
                continue;
            }

            System.out.print("Введите оператор (+, -, *, /): ");
            String operator = scanner.nextLine();

            System.out.print("Введите второе число: ");
            String input2 = scanner.nextLine();

            double num2;
            try {
                num2 = Double.parseDouble(input2);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Неверный ввод числа.");
                continue;
            }

            try {
                double result = 0;
                switch (operator) {
                    case "+":
                        result = calculator.add(num1, num2);
                        break;
                    case "-":
                        result = calculator.subtract(num1, num2);
                        break;
                    case "*":
                        result = calculator.multiply(num1, num2);
                        break;
                    case "/":
                        result = calculator.divide(num1, num2);
                        break;
                    default:
                        System.out.println("Ошибка: Неверный оператор.");
                        continue;
                }
                System.out.println("Результат: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
