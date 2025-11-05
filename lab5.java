public class Character
{
    private String name;
    private int healthPoints;
    private int maxHealth;
    private int attackPower;
    private int defense;
    private Weapon weapon01 = new Weapon();
    private Weapon weapon02 = new Weapon();
    private Armor armor01 = new Armor();
    private Armor armor02 = new Armor();

    public Character(String name, int maxHp, int attack, int defense) {
        this.name = name;
        this.maxHealth = maxHp;
        this.healthPoints = maxHp;
        this.attackPower = attack;
        this.defense = defense;
        System.out.println(this.name + " has entered the game!");
    }
    
    public void takeDamage(int amount) {
        int totalDefense = this.calculateTotalDefense();
        int damageTaken = Math.max(1, amount - totalDefense);
        this.healthPoints -= damageTaken;
        
        System.out.println(this.name + " took " + damageTaken + " damage. (Defense:" + totalDefense + ")");
        
        if (!isAlive()) {
            System.out.println(this.name + " has been defeated!");
        }
    }

    public void attack(Character target) {
        if (!this.isAlive()) {
            return;
        }
        int damageDealt = this.calculateTotalAttack();
        System.out.println(this.name + " attacks " + target.getName() + " for " + damageDealt + " base damage.");
        target.takeDamage(damageDealt);
    }

    public void addWeapon(int slotNo, Weapon weapon) {
        if (slotNo == 1) {
            this.weapon01 = weapon;
            System.out.println(this.name + " equipped weapon slot 1:" + weapon.getName());
        }
        else {
            this.weapon02 = weapon;
            System.out.println(this.name + " equipped weapon slot 2:" + weapon.getName());
        }
    }

    public void addArmor(int slotNo, Armor armor) {
        if (slotNo == 1) {
            this.armor01 = armor;
            System.out.println(this.name + " equipped armor slot 1:" + armor.getName());
        }
        else {
            this.armor02 = armor;
            System.out.println(this.name + " equipped armor slot 2:" + armor.getName());
        }
    }
    
    private int calculateTotalAttack() {
        int totalAttack = (this.weapon01 != null) ? this.attackPower + weapon01.getDamageBonus() : 0;
        totalAttack = (this.weapon02 != null) ? totalAttack + weapon02.getDamageBonus() : totalAttack;
        return totalAttack;
    }

    private int calculateTotalDefense() {
        int totalDefense = (this.armor01 != null) ? this.defense + armor01.getDefenseBonus() : 0;
        totalDefense = (this.armor02 != null) ? totalDefense + armor02.getDefenseBonus() : totalDefense;
        return totalDefense;
    }

    public boolean isAlive() {
        return this.healthPoints > 0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getHealthPoints() {
        return this.healthPoints;
    }
    
    public int getAttackPower() {
        return this.attackPower;
    }
    
    public int getDefense() {
        return this.defense;
    }
}