package Adapter;

public class Human {
    private String name;
    private String proffesion;
    private double strength;
    private static int humanPassword = 111;

    public Human(String name, String proffesion, double strength) {
        this.name = name;
        this.proffesion = proffesion;
        this.strength = strength;
    }

    public static int getHumanPassword() {
        return humanPassword;
    }

    public static void setHumanPassword(int humanPassword) {
        Human.humanPassword = humanPassword;
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

    public int tellMeTheHumanPassword(){
        return humanPassword;
    }

}
