package FactoryMethod;

public class OrcFactory extends UnitFactory {
    public Orc createUnit(){
        System.out.println("Орк рожден");
        System.out.println("Орку выдан топор");
        return new Orc();
    }
}
