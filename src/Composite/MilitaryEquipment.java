package Composite;

public class MilitaryEquipment implements IMilitary{
    private String title;
    private int strength = 5;

    public MilitaryEquipment(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public int getPower() {
        return strength;
    }

    @Override
    public String getName() {
        return title;
    }

    @Override
    public String getType() {
        return "Экипировка";
    }
}
