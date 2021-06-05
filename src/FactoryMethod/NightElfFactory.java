package FactoryMethod;

public class NightElfFactory extends UnitFactory {
    public NightElf createUnit(){
        System.out.println("Ночной эльф рожден");
        System.out.println("Тёмному эльфу выдан лук, модный");
        return new NightElf();
    }
}
