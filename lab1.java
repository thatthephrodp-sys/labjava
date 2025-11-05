public class Weapon
{
    private String name;
    private int damageBonus;
    
    public Weapon() {
        
    }
    
    public Weapon(String name, int damageBonus) {
        this.name = name;
        this.damageBonus = damageBonus;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getDamageBonus() {
        return damageBonus;
    }
    
    public void setDamageBonus(int damageBonus) {
        this.damageBonus = damageBonus;
    }
}