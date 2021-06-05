package Mediator;

public class Orc extends Unit {

    public Orc(String name, double damage, double health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    @Override
    public void battleRoar(String nameAttacked) {
        System.out.println("Агрррхххх " + nameAttacked);
    }

    @Override
    public void dead() {
        System.out.println("За Орду!");
    }

}
