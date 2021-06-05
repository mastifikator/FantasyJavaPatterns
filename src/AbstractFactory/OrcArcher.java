package AbstractFactory;

public class OrcArcher extends Unit implements IArcher {

    public OrcArcher(){
        System.out.println("Тролль рожден");
    }

    @Override
    public void deadUnit() {
        System.out.println("Тролль погибает");
    }

    @Override
    public void moveUnit() {
        System.out.println("Тролль двигается");
    }

    @Override
    public void rangeFight() {
        System.out.println("Тролль метает копье");
    }
}
