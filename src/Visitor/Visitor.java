package Visitor;

public class Visitor {
    Present present;
    String NAME = "theWiseMan";

    public Visitor(Present present) {
        this.present = present;
    }

    public void visitOrc(OrcLeader orcLeader){
        System.out.println("Приветствую достопочтенный " + orcLeader.getName());
        System.out.println("Я принес тебе ценный подарок!");
        orcLeader.setMoney(orcLeader.getMoney() + present.getPrice());
    }

    public void visitHuman(HumanLeader humanLeader){
        System.out.println("Приветствую благородный " + humanLeader.getName());
        System.out.println("Я раскажу тебе где находится Фростморн!");
        humanLeader.haveLocationFrostmourn = true;
    }

    public void visitNightElf(NightElfLeader nightElfLeader){
        System.out.println("Приветствую лучезарная " + nightElfLeader.getName());
        System.out.println("Я раскажу тебе где спрятан рог Друида!");
        nightElfLeader.haveDruidHorn = true;
    }
}
