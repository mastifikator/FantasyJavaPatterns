package FactoryMethod;

public class UndeadFactory extends UnitFactory {
    public Undead createUnit(){
        System.out.println("Нежить вылупилась");
        System.out.println("Нежить накормлена трупом");
        return new Undead();
    }
}


