package Composite;

import java.util.ArrayList;

public class Army implements IMilitary{

    private int strength = 0;
    private String name ="";
    ArrayList<Squad> squads = new ArrayList<>();

    public Army(String name) {
        this.name = name;
    }

    public Army() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Squad> getSquads() {
        return squads;
    }

    public boolean addSquad(Squad squad){
        return squads.add(squad);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "Армия";
    }

    @Override
    public int getPower() {
        for(Squad s : squads){
            strength += s.getPower();
        }

        return strength;
    }
}
