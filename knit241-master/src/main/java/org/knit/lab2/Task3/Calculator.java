package org.knit.lab2.Task3;

public class Calculator {

    // Сложение
    public double add(double a, double b) {
        return a + b;
    }

    // Вычитание
    public double subtract(double a, double b) {
        return a - b;
    }

    // Умножение
    public double multiply(double a, double b) {
        return a * b;
    }

    // Деление
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно.");
        }
        return a / b;
    }
}
