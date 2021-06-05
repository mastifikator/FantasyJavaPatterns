package Mediator;

public class Undead extends Unit {

    public Undead(String name, double damage, double health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    @Override
    public void battleRoar(String nameAttacked) {
        System.out.println("Господин ждет тебя " + nameAttacked);
    }

    @Override
    public void dead() {
        System.out.println("Хозяин я иду к тебе!");
    }
}
