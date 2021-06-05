package Composite;

public class Soldier extends Squad{
    private int strength = 1;
    private String name;

    public Soldier(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getPower() {
        return strength;
    }

    @Override
    public String getType() {
        return "Солдат";
    }
}
