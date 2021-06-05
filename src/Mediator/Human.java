package Mediator;

public class Human extends Unit {

    public Human(String name, double damage, double health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    @Override
    public void battleRoar(String nameAttacked) {
        System.out.println("Я уничтожу тебя " + nameAttacked + " во имя света!");
    }

    @Override
    public void dead() {
        System.out.println("Богиня прими мою душу!");
    }
}
