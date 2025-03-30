package dev.nau.rpgcombat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    @Test
    void testCharacterCreation() {
        Character character = new Character("Warrior");
        assertEquals("Warrior", character.getName());
        assertEquals(1000, character.getHealth());
        assertEquals(1, character.getLevel());
        assertTrue(character.isAlive());
    }

    @Test
    void testReceiveDamage() {
        Character character = new Character("Warrior");
        character.receiveDamage(200);
        assertEquals(800, character.getHealth());
    }

    @Test
    void testCharacterDiesWhenHealthIsZero() {
        Character character = new Character("Warrior");
        character.receiveDamage(1000);
        assertFalse(character.isAlive());
    }

    @Test
    void testHeal() {
        Character character = new Character("Cleric");
        character.receiveDamage(300);
        character.heal(100);
        assertEquals(800, character.getHealth());
    }

    @Test
    void testHealCannotExceedMaxHealth() {
        Character character = new Character("Cleric");
        character.heal(500);

        assertEquals(1000, character.getHealth());
    }

}
