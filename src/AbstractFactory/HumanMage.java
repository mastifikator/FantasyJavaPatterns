package AbstractFactory;

public class HumanMage extends Unit implements IMage {

    public HumanMage(){
        System.out.println("Зачарователь рожден");
    }

    @Override
    public void deadUnit() {
        System.out.println("Зачарователь погибает");
    }

    @Override
    public void moveUnit() {
        System.out.println("Зачарователь двигается");
    }

    @Override
    public void magicFight() {
        System.out.println("Зачарователь ревращает в овцу");
    }
}
