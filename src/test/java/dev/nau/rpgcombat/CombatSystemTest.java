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

}
