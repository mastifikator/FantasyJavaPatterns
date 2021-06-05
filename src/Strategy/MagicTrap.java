package Strategy;

public class MagicTrap extends ProtectiveStructure{

    public MagicTrap() {
        this.health = 400;
        buildingNotify();
    }

    @Override
    public void buildingNotify() {
        System.out.println("В окрестностях установлены магические ловушки, врага ждет сюрприз");
    }
}
