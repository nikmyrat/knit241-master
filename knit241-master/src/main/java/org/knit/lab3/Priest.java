package org.knit.lab3;

class Priest extends Player {
    public Priest(String name, Race race) {
        super(name, 70, 10, 10, race);
    }

    @Override
    public void attack(Player player) {
        System.out.println(name + " cannot attack.");
    }

    @Override
    public void heal(Player player) {
        int healPower = 20 + race.getHealBonus();
        player.increaseHealth(healPower);
        System.out.println(name + " heals " + player.name + " for " + healPower + " health.");
    }
}
