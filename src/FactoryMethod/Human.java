package FactoryMethod;

public class Human extends Unit {

    public Human(){
    }

    @Override
    public void deadUnit() {
        System.out.println("Человек погибает");
    }

    @Override
    public void moveUnit() {
        System.out.println("Человек двигается");
    }

    @Override
    public void fightUnit() {
        System.out.println("Человек сражается");
    }
}
