package Builder;

public class UnitBuilder {
    private String race;
    private String proffesion;
    private String weapon;
    private double strength;
    private double speed;
    private double damage;
    private String name;

    public void setRace(String race) {
        this.race = race;
    }

    public void setProffesion(String proffesion) {
        this.proffesion = proffesion;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Unit getResult(){
        return new Unit(race, proffesion, weapon, strength, speed, damage, name);
    }
}
