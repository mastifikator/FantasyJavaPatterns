package Strategy;

public class ArcherOnTrees extends ProtectiveStructure{

    public ArcherOnTrees() {
        this.health = 700;
        buildingNotify();
    }

    @Override
    public void buildingNotify() {
        System.out.println("Лучники снайперы заняли позиции!");
    }
}
