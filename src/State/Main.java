package State;

public class Main {

    public static void main(String[] args) {
        Orc orc = new Orc("Гаррош", 10, 10);
        orc.saidLokTar();
        System.out.println();

        orc.changeState(new Orc.OrcChaosStatement(orc));
        orc.getOrcStatement().orcBeat();
        orc.getOrcStatement().orcRun();
        orc.getOrcStatement().orcCry();
        System.out.println();

        orc.changeState(new Orc.OrcEatStrangeMushroomStatement(orc));
        orc.getOrcStatement().orcBeat();
        orc.getOrcStatement().orcRun();
        orc.getOrcStatement().orcCry();
        System.out.println();

        orc.changeState(new Orc.OrcDrinkVodkaStatement(orc));
        orc.getOrcStatement().orcBeat();
        orc.getOrcStatement().orcRun();
        orc.getOrcStatement().orcCry();

    }
}
