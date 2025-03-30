package dev.nau.rpgcombat;

public class Character {
    private String name;
    private int health;
    private int level;
    private boolean alive;

    public Character(String name) {
        this.name = name;
        this.health = 1000;
        this.level = 1;
        this.alive = true;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public boolean isAlive() {
        return alive;
    }

    public void receiveDamage(int amount) {
        this.health = Math.max(0, this.health - amount);
        if (this.health == 0) {
            this.alive = false;
        }
    }

    public void heal(int amount) {
        this.health += amount;
    }
}
