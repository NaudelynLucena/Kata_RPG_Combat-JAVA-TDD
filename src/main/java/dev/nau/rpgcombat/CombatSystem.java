package dev.nau.rpgcombat;

public class CombatSystem {
    public static boolean attack(Character attacker, Character target, int damage) {
        if (!attacker.isAlive() || !target.isAlive())
            return false;
        if (attacker == target)
            return false;

        target.receiveDamage(damage);
        return true;
    }
}
