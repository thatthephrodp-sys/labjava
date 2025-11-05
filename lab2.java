public class Game
{
    public static void main(String[] args) {
        Character hero = new Character("Sir Valor", 100, 20, 5);
        Character monster = new Character("Goblin Chief", 60, 15, 2);
        Weapon katana = new Weapon("katana", 45);
        Weapon spear = new Weapon("spear", 30);
        Armor helmet = new Armor("Helmet", 30);
        Armor shield = new Armor("Shield", 25);
        System.out.println("\n--- Starting Combat ---\n");
        hero.addWeapon(1, katana );
        hero.addWeapon(2, spear);
        hero.addArmor(1, helmet);
        hero.addArmor(2, shield);
        hero.attack(monster);
        
        System.out.println(monster.getName() + " HP remaining: " + monster.getHealthPoints());
        
        System.out.println("\n");
        
        monster.attack(hero);
        
        System.out.println(hero.getName() + " HP remaining: " + hero.getHealthPoints());
    }
}