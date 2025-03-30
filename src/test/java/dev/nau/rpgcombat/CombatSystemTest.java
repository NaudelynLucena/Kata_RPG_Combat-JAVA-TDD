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
}
