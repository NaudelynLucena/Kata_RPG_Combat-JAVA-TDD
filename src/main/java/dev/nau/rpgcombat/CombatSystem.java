package dev.nau.rpgcombat;

public class CombatSystem {

    public static void attack(Character attacker, Character target, int damage) {
        target.receiveDamage(damage);
    }
}
