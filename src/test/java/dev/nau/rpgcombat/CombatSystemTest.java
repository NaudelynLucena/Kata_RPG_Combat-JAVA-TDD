package dev.nau.rpgcombat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CombatSystemTest {

    @Test
    void testCharacterCanAttackAnother() {
        Character attacker = new Character("Warrior");
        Character target = new Character("Orc");

        CombatSystem.attack(attacker, target, 200);

        assertEquals(800, target.getHealth());
    }

    @Test
    void testDeadCharacterCannotAttack() {
        Character deadCharacter = new Character("Ghost");
        Character target = new Character("Orc");

        deadCharacter.receiveDamage(1000);
        boolean attackSuccess = CombatSystem.attack(deadCharacter, target, 200);

        assertFalse(attackSuccess);
        assertEquals(1000, target.getHealth());
    }

    @Test
    void testCannotAttackDeadCharacter() {
        Character attacker = new Character("Warrior");
        Character deadTarget = new Character("Skeleton");

        deadTarget.receiveDamage(1000);
        boolean attackSuccess = CombatSystem.attack(attacker, deadTarget, 200);

        assertFalse(attackSuccess);
        assertEquals(0, deadTarget.getHealth());
    }

    @Test
    void testCharacterCannotAttackItself() {
        Character attacker = new Character("Fighter");

        boolean attackSuccess = CombatSystem.attack(attacker, attacker, 200);

        assertFalse(attackSuccess);
        assertEquals(1000, attacker.getHealth());
    }

}
