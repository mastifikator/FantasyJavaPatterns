package FactoryMethod;

public class Main {

    public static void main(String[] args) {
        HumanFactory humanFactory = new HumanFactory();
        Human human = humanFactory.createUnit();
        human.moveUnit();
        human.fightUnit();
        human.deadUnit();

        System.out.println();

        OrcFactory orcFactory = new OrcFactory();
        Orc orc = orcFactory.createUnit();
        orc.moveUnit();
        orc.fightUnit();
        orc.deadUnit();

        System.out.println();

        NightElfFactory nightElfFactory = new NightElfFactory();
        NightElf nightElf = nightElfFactory.createUnit();
        nightElf.moveUnit();
        nightElf.fightUnit();
        nightElf.deadUnit();

        System.out.println();

        UndeadFactory undeadFactory = new UndeadFactory();
        Undead undead = undeadFactory.createUnit();
        undead.moveUnit();
        undead.fightUnit();
        undead.deadUnit();
    }
}
