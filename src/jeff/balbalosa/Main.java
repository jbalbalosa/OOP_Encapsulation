package jeff.balbalosa;

public class Main {
    public static void main(String[] args) {
        System.out.println("Udemy: Java Programming Masterclass");
        System.out.println("Object Oriented Programming: Encapsulation");

        EnhancePlayer player = new EnhancePlayer("Jeff", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}