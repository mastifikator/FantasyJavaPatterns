package AbstractFactory;

public class HumanWarrior extends Unit implements IWarrior {

    public HumanWarrior(){
        System.out.println("Футмэн рожден");
    }

    @Override
    public void deadUnit() {
        System.out.println("Футмэн погибает");
    }

    @Override
    public void moveUnit() {
        System.out.println("Футмэн двигается");
    }

    @Override
    public void meleeFight() {
        System.out.println("Футман режет мечом");
    }
}
