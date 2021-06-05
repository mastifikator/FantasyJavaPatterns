package AbstractFactory;

public class OrcWarrior extends Unit implements IWarrior {

    public OrcWarrior(){
        System.out.println("Бугай рожден");
    }

    @Override
    public void deadUnit() {
        System.out.println("Бугай погибает");
    }

    @Override
    public void moveUnit() {
        System.out.println("Бугай двигается");
    }

    @Override
    public void meleeFight() {
        System.out.println("Бугай бьет топором");
    }
}
