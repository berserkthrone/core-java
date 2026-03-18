package AdvancedOOPs.Encapsulation;

public class Player {

    public String fullName;
    public int health;
    public String weapon;
    // above class is public cuzz it is very easily accessible in the main class.

    public void loseHealth(int damage){

        health -= damage;
        if(health <= 0){
            System.out.println("Game Over 0_0");
        }
    }

    public int healthRemaining(){
        return health;
    }

    public void restoreHealth(int extraHealth){
        health += extraHealth;
        if(health > 100){
            System.out.println("Health is full 100%");
            health = 100;
        }
    }
}
