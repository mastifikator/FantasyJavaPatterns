package Adapter;

public class Orc {
    private String name;
    private String proffesion;
    private double strength;
    private static int orcPassword = 666;

    public Orc(String name, String proffesion, double strength) {
        this.name = name;
        this.proffesion = proffesion;
        this.strength = strength;
    }

    public Orc() {
    }

    public String getName() {
        return name;
    }

    public String getProffesion() {
        return proffesion;
    }

    public double getStrength() {
        return strength;
    }

    public void setOrcPassword(int orcPassword) {
        this.orcPassword = orcPassword;
    }

    public int tellMeTheOrcPassword(){
        return orcPassword;
    }
}
