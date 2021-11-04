package WarGame;

/**
 * Warrior class
 */
public class Warrior {
    protected int health;
    protected int attack;

    /**
     * Default ctor
     */
    public Warrior(){
        this.health = 50;
        this.attack = 5;
    }

    /**
     * Protected ctor to extend by another classes
     * @param   health    amount of health
     * @param   attack    strength of attack
     */
    protected  Warrior(int health, int attack) {
        this.health = health;
        this.attack = attack;
    }

    /**
     * Check if Warrior is alive
     * @return true or false
     */
    public boolean isAlive() {
        return health > 0;
    }

    /**
     * Warrior gets damage from another warrior
     * @param warrior - attacking warrior
     */
    void getDamage(Warrior warrior){
        this.health -= warrior.getAttack();
    }

    /**
     * Set health with health param
     * @param health health of the warrior
     */
    void setHealth(int health) {
        this.health = health;
    }

    /**
     * Getter of health
     */
    public int getHealth() {
        return health;
    }

    /**
     * Getter of attack
     */
    public int getAttack() {
        return attack;
    }
}