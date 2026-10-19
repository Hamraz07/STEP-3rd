
public class Q1 {
    static class Character {
        private final int maximumHealth;private int health;
        Character(int maximumHealth){this.maximumHealth=maximumHealth;this.health=maximumHealth;}
        void takeDamage(int amount){if(amount>0)health=Math.max(0,health-amount);}
        void heal(int amount){if(amount>0)health=Math.min(maximumHealth,health+amount);}
        int getHealth(){return health;}
    }
    public static void main(String[] args) {
        Character player=new Character(100);player.takeDamage(30);System.out.println(player.getHealth());
        player.heal(50);System.out.println(player.getHealth());player.takeDamage(150);System.out.println(player.getHealth());
    }
}
