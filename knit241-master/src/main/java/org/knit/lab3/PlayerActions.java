package org.knit.lab3;


interface PlayerActions {
    void heal(Player player);
    void attack(Player player);
}

class Race {
    private int attackBonus;
    private int defenseBonus;
    private int healBonus;

    public Race(int attackBonus, int defenseBonus, int healBonus) {
        this.attackBonus = attackBonus;
        this.defenseBonus = defenseBonus;
        this.healBonus = healBonus;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public int getDefenseBonus() {
        return defenseBonus;
    }

    public int getHealBonus() {
        return healBonus;
    }
}

abstract class Player implements PlayerActions {
    protected String name;
    protected int health;
    protected int maxHealth;
    protected boolean isAlive;
    protected int positionX;
    protected int positionY;
    protected int attack;
    protected int defense;
    protected Race race;

    public Player(String name, int maxHealth, int attack, int defense, Race race) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.attack = attack;
        this.defense = defense;
        this.isAlive = true;
        this.race = race;
    }

    public void increaseHealth(int value) {
        this.health = Math.min(maxHealth, health + value);
    }

    public void decreaseHealth(int value) {
        int finalDamage = value - defense + race.getDefenseBonus();
        this.health -= finalDamage;
        if (health <= 0) {
            isAlive = false;
            health = 0;
        }
    }

    public void move(int x, int y) {
        this.positionX = x;
        this.positionY = y;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Health: " + health + "/" + maxHealth + ", Position: (" + positionX + ", " + positionY + ")";
    }
}
