package org.knit.lab6.Task11;

import java.util.TreeSet;


public class StudentList {
    private TreeSet<String> students;

    public StudentList() {
        students = new TreeSet<>();
    }

    public void addStudent(String student) {
        if (!students.contains(student)) {
            students.add(student);
            System.out.println("Студент добавлен.");
        } else {
            System.out.println("Ошибка: Студент с таким именем уже существует.");
        }
    }

    public void removeStudent(String student) {
        if (students.contains(student)) {
            students.remove(student);
            System.out.println("Студент удален.");
        } else {
            System.out.println("Ошибка: Студент с таким именем не найден.");
        }
    }

    public void showAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Список студентов пуст.");
        } else {
            System.out.println("Список студентов:");
            students.forEach(System.out::println);
        }
    }


    public void findStudent(String name) {
        boolean found = false;
        for (String student : students) {
            if (student.toLowerCase().contains(name.toLowerCase())) {
                System.out.println("Студент найден: " + student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Ошибка: Студент с таким именем не найден.");
        }
    }
}
