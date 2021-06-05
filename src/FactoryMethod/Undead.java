package FactoryMethod;

public class Undead extends Unit {
    public Undead(){
    }

    @Override
    public void deadUnit() {
        System.out.println("Нежить не умирает, а отправляется к господину!");
    }

    @Override
    public void moveUnit() {
        System.out.println("Нежить двигается");
    }

    @Override
    public void fightUnit() {
        System.out.println("Нежить сражается");
    }
}
