package AbstractFactory;

public class UndeadWarrior extends Unit implements IWarrior {

    public UndeadWarrior(){
        System.out.println("Гуль рожден");
    }

    @Override
    public void deadUnit() {
        System.out.println("Гуль погибает");
    }

    @Override
    public void moveUnit() {
        System.out.println("Гуль двигается");
    }

    @Override
    public void meleeFight() {
        System.out.println("Гуль рвет когтями");
    }
}
