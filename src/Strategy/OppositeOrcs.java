package Strategy;

public class OppositeOrcs implements IDefenceStrategy{
    ProtectiveStructure protectiveStructure;

    @Override
    public void alarm() {
        System.out.println("Берегитесь орки идут в нападение!");
    }

    @Override
    public void buildDefence(ProtectiveStructure protectiveStructure) {
        this.protectiveStructure = protectiveStructure;
    }

    @Override
    public void executeStrategy() {
        alarm();
        System.out.println("Возводим защитные сооружения.");
        buildDefence(new Wall());
        System.out.println("Защищаемся от глухой обороны, стражники на стены!");
    }
}
