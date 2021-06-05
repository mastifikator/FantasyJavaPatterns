package Strategy;

public class OppositeHuman implements IDefenceStrategy{
    ProtectiveStructure protectiveStructure;

    @Override
    public void alarm() {
        System.out.println("Люди возводят базу рядом с нами!");
    }

    @Override
    public void buildDefence(ProtectiveStructure protectiveStructure) {
        this.protectiveStructure = protectiveStructure;
    }

    @Override
    public void executeStrategy() {
        alarm();
        System.out.println("Организуем засаду!");
        buildDefence(new ArcherOnTrees());
        System.out.println("Устроим им партизанскую войну, друиды перевоплощайтесь в зверей!");
    }
}
