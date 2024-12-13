package org.knit.lab3;

public class Task6 {
    public static void execute() {
        // Создаем расы
        Race humanRace = new Race(10, 5, 5);
        Race elfRace = new Race(15, 10, 10);

        // Создаем персонажей
        Player warrior = new WarriorGuard("Ork Warrior", humanRace);
        Player mage = new Mage("Elven Mage", elfRace);
        Player priest = new Priest("Healing Priest", humanRace);

        // Перемещение персонажей
        warrior.move(5, 5);
        mage.move(10, 10);
        priest.move(3, 3);

        // Демонстрация действий
        System.out.println(warrior);
        System.out.println(mage);
        System.out.println(priest);

        warrior.attack(mage);
        priest.heal(mage);
        mage.attack(warrior);
    }
}
