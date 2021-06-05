package Strategy;

public class Wall extends ProtectiveStructure{

    public Wall() {
        this.health = 1000;
        buildingNotify();
    }

    @Override
    public void buildingNotify() {
        System.out.println("Возведены стены, врагу не пройти!");
    }
}
