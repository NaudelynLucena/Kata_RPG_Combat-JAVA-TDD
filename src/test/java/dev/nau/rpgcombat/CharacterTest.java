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
}