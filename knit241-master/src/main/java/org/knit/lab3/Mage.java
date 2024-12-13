package org.knit.lab3;

class Mage extends Player {
    public Mage(String name, Race race) {
        super(name, 80, 25, 5, race);
    }

    @Override
    public void attack(Player player) {
        player.decreaseHealth(attack + race.getAttackBonus());
        System.out.println(name + " casts an attack spell on " + player.name);
    }

    @Override
    public void heal(Player player) {
        System.out.println(name + " cannot heal.");
    }
}
