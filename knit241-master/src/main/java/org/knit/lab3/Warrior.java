package org.knit.lab3;

class Warrior extends Player {
    public Warrior(String name, Race race) {
        super(name, 100, 15, 10, race);
    }

    @Override
    public void attack(Player player) {
        if (player.positionX <= this.positionX + 5 && player.positionY <= this.positionY + 5) {
            player.decreaseHealth(attack);
            System.out.println(name + " attacks " + player.name);
        } else {
            System.out.println(name + " is too far away to attack " + player.name);
        }
    }

    @Override
    public void heal(Player player) {
        System.out.println(name + " cannot heal.");
    }
}
