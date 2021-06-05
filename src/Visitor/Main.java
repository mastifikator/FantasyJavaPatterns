package Visitor;

public class Main {
    public static void main(String[] args) {
        OrcLeader orcLeader = new OrcLeader("Тралл");
        HumanLeader humanLeader = new HumanLeader("Артас");
        NightElfLeader nightElfLeader = new NightElfLeader("Сильвана");


        System.out.println("Изначально помыслы лидеров были такими:");
        System.out.print(orcLeader.getName() + " думал: ");
        orcLeader.warWithHuman();
        System.out.print(humanLeader.getName() + " думал: ");
        humanLeader.goToTheFrostmourne();
        System.out.print(nightElfLeader.getName() + " думала: ");
        nightElfLeader.goToWakeUpDemigod();
        System.out.println();

        Present present = new Present("Баблишко", 2000);
        Visitor visitor = new Visitor(present);

        System.out.println("Затем их посетил провидец " + visitor.NAME);
        visitor.visitHuman(humanLeader);
        System.out.println();
        visitor.visitOrc(orcLeader);
        System.out.println();
        visitor.visitNightElf(nightElfLeader);
        System.out.println();

        System.out.println("И лидеры поменяли свои планы:");
        System.out.print(orcLeader.getName() + " думает: ");
        orcLeader.warWithHuman();
        System.out.print(humanLeader.getName() + " думает: ");
        humanLeader.goToTheFrostmourne();
        System.out.print(nightElfLeader.getName() + " думает: ");
        nightElfLeader.goToWakeUpDemigod();
        System.out.println();


    }
}
