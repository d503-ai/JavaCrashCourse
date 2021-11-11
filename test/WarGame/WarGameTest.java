package WarGame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class WarGameTest {
    @Test
    @DisplayName("Fight between chunk-bruce")
    void fight() {
        Warrior chunk = new Warrior();
        Warrior bruce = new Warrior();
        WarGame.fight(chunk, bruce);
    }

    @Test
    @DisplayName("Fight between chuck-bruce, dave-carl")
    void fightOfTwo() {
        Warrior chuck = new Warrior();
        Warrior bruce = new Warrior();
        Warrior carl = new Knight();
        Warrior dave = new Warrior();
        Assertions.assertTrue(WarGame.fight(chuck, bruce));
        Assertions.assertFalse(WarGame.fight(dave, carl));
        Assertions.assertTrue(chuck.isAlive());
        Assertions.assertFalse(bruce.isAlive());
        Assertions.assertTrue(carl.isAlive());
        Assertions.assertFalse(dave.isAlive());
    }

    @Test
    @DisplayName("Army 1 versus Army 2")
    void fightArmy() {
        Army army1 = new Army(new ArrayList<>(Arrays.asList(new Warrior(), new Warrior(), new Warrior())));
        Army army2 = new Army(new ArrayList<>(Arrays.asList(new Warrior(), new Knight(), new Warrior())));
        boolean result = WarGame.fightArmy(army1, army2);
        Assertions.assertTrue(result, "Army1 should have won");
    }

    @Test
    @DisplayName("Defender versus Warrior and Knight")
    void fightDefender(){
        Warrior defender = new Defender();
        Warrior bruce = new Warrior();

        Warrior defender_2 = new Defender();
        Warrior carl = new Knight();

        Assertions.assertTrue(WarGame.fight(defender, bruce));
        Assertions.assertFalse(WarGame.fight(defender_2, carl));
    }

    @Test
    @DisplayName("Vampire vs Warrior, Knight, Defender")
    void fightVampire(){
        Warrior vampire = new Vampire();
        Warrior chuck = new Warrior();
        Warrior vampire_2 = new Vampire();
        Warrior knight = new Knight();
        Warrior vampire_3 = new Vampire();
        Warrior defender = new Defender();

        Assertions.assertTrue(WarGame.fight(vampire, chuck));
        Assertions.assertFalse(WarGame.fight(vampire_2, knight));
        Assertions.assertFalse(WarGame.fight(vampire_3, defender));
    }

    @Test
    @DisplayName("Army fight with lancer in it")
    void fightArmyWithLancer(){

    }
}
