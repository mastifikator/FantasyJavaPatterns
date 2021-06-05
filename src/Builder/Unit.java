package Builder;

public class Unit {
    private String race;
    private String proffesion;
    private String weapon;
    private double strength;
    private double speed;
    private double damage;
    private String name;

    public Unit(String race, String proffesion, String weapon, double strength, double speed, double damage, String name) {
        this.race = race;
        this.proffesion = proffesion;
        this.weapon = weapon;
        this.strength = strength;
        this.speed = speed;
        this.damage = damage;
        this.name = name;

        System.out.println(this.toString());
    }

    public String getRace() {
        return race;
    }

    public String getProffesion() {
        return proffesion;
    }

    public String getWeapon() {
        return weapon;
    }

    public Double getStrength() {
        return strength;
    }

    public Double getSpeed() {
        return speed;
    }

    public Double getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "race='" + race + '\'' +
                ", proffesion='" + proffesion + '\'' +
                ", weapon='" + weapon + '\'' +
                ", strength=" + strength +
                ", speed=" + speed +
                ", damage=" + damage +
                ", name='" + name + '\'' +
                '}';
    }
}
