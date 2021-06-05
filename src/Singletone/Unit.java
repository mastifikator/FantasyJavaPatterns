package Singletone;

public class Unit {
    private String race;
    private String proffesion;
    private String name;
    private static Unit instance;

    public void setRace(String race) {
        this.race = race;
    }

    public void setProffesion(String proffesion) {
        this.proffesion = proffesion;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Unit(String race, String proffesion, String name) {
        this.race = race;
        this.proffesion = proffesion;
        this.name = name;
    }


    public static Unit getInstance(String race, String proffesion, String name){
        if(instance == null){
            instance = new Unit(race, proffesion, name);
        }
        return instance;
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
