package AbstractFactory;

public class UndeadArcher extends Unit implements IArcher {

    public UndeadArcher(){
        System.out.println("Адепт рожден");
    }

    @Override
    public void deadUnit() {
        System.out.println("Адепт погибает");
    }

    @Override
    public void moveUnit() {
        System.out.println("Адепт двигается");
    }

    @Override
    public void rangeFight() {
        System.out.println("Адепт насылает болезнь");
    }
}
