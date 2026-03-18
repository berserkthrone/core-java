package AdvancedOOPs.Encapsulation;

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health: " + player.healthRemaining());
//
//        player.loseHealth(11);
//        System.out.println("Remaining health: " + player.healthRemaining());

        EnhancedPlayer tim = new EnhancedPlayer("tim", 200,
                "Sword");
        // as u can see the output its showing 100 health instead of 200
        // cuzz I control that (This is encapsulation)
        System.out.println("Initial health = " + tim.healthRemaining());
    }
}
