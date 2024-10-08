package main.com.JavaProgrammingMasterclassUpdatedToJava17.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Player player=new Player();
        player.name="Tim";
        player.health=20;
        player.weapon="Sword";

        int damage=10;
        player.loseHealth(damage);
        System.out.println("Remaining Health= "+player.healthRemaining());

        player.loseHealth(11);
        System.out.println("Remaining Health= "+player.healthRemaining());

        EnhancedPlayer tim = new EnhancedPlayer("Tim",200,"Sword");
        System.out.println("Initial health is "+tim.healthRemaining());
    }
}
