package Composite;

import java.util.ArrayList;

public class Squad extends Army{
    private int strength = 0;
    private String name;
    private ArrayList<Soldier> soldiers = new ArrayList<>();

    public ArrayList<Soldier> getSoldiers() {
        return soldiers;
    }

    public Squad(String name) {
        this.name = name;
    }

    public Squad() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addSoldier(Soldier soldier){
        return soldiers.add(soldier);
    }

    @Override
    public String getType() {
        return "Отряд";
    }

    @Override
    public int getPower() {
        for(Soldier s : soldiers){
            strength += s.getStrength();
        }

        return strength;
    }

}
