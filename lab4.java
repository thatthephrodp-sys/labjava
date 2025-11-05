public class Armor {
    private String name;
    private int defenseBonus;

    public Armor() {

    }

    public Armor(String name, int defenseBonus) {
        this.name = name;
        this.defenseBonus = defenseBonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDefenseBonus() {
        return defenseBonus;
    }

    public void setDefenseBonus(int defenseBonus) {
        this.defenseBonus = defenseBonus;
    }
}