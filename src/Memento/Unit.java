package Memento;

public class Unit {
    private String name;
    private double health;
    private double damage;
    private double armor;

    public Unit(String name, double health, double damage, double armor) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.armor = armor;
    }

    public Unit saveUnit(){
        Unit saveUnit = new Unit(name, health, damage, armor);
        return saveUnit;
    }

    public Unit loadUnit(Unit unit){
        this.name = unit.name;
        this.health = unit.health;
        this.damage = unit.damage;
        this.armor = unit.armor;
        return unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                ", armor=" + armor +
                '}';
    }
}
