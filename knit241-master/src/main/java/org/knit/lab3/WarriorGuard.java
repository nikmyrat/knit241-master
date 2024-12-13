package org.knit.lab3;

class WarriorGuard extends Warrior {
    private int additionalDefense = 10;

    public WarriorGuard(String name, Race race) {
        super(name, race);
        this.defense += additionalDefense; // дополнительная защита для Guard
    }

    @Override
    public void decreaseHealth(int value) {
        int finalDamage = value - defense + race.getDefenseBonus();
        this.health -= finalDamage;
        if (health <= 0) {
            isAlive = false;
            health = 0;
        }
    }

    @Override
    public void attack(Player player) {
        super.attack(player);
    }

    @Override
    public void heal(Player player) {
        super.heal(player);
    }
}
