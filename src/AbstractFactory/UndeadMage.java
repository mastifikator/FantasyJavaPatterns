package AbstractFactory;

public class UndeadMage extends Unit implements IMage {

    public UndeadMage(){
        System.out.println("Банши рождена");
    }

    @Override
    public void deadUnit() {
        System.out.println("Банши погибает");
    }

    @Override
    public void moveUnit() {
        System.out.println("Банши двигается");
    }

    @Override
    public void magicFight() {
        System.out.println("Банши парализует");
    }
}
