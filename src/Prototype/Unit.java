package Prototype;

public class Unit implements Cloneable{
    private String race;
    private String proffesion;
    private String name;

    public Unit(String race, String proffesion, String name) {
        this.race = race;
        this.proffesion = proffesion;
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public String getProffesion() {
        return proffesion;
    }

    public String getName() {
        return name;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setProffesion(String proffesion) {
        this.proffesion = proffesion;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Unit{" +
                "race='" + race + '\'' +
                ", proffesion='" + proffesion + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
