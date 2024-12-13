package org.knit.lab6.Task11;

import java.util.Scanner;

public class Task11 {
    private StudentList studentList;

    public Task11() {
        studentList = new StudentList();
    }


    public void execute() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить студента");
            System.out.println("2. Удалить студента");
            System.out.println("3. Показать всех студентов");
            System.out.println("4. Найти студента");
            System.out.println("5. Выйти");

            System.out.print("Выберите опцию: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введено не число. Попробуйте снова.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Введите имя студента: ");
                    String nameToAdd = scanner.nextLine();
                    studentList.addStudent(nameToAdd);
                    break;
                case 2:
                    System.out.print("Введите имя студента для удаления: ");
                    String nameToRemove = scanner.nextLine();
                    studentList.removeStudent(nameToRemove);
                    break;
                case 3:
                    studentList.showAllStudents();
                    break;
                case 4:
                    System.out.print("Введите имя студента для поиска: ");
                    String nameToFind = scanner.nextLine();
                    studentList.findStudent(nameToFind);
                    break;
                case 5:
                    System.out.println("Выход из программы...");
                    return;
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }
    }
}

