package AbstractFactory;

public class Main {
    public static IAbstractUnitFactory raceCreate(RaceType type){
        IAbstractUnitFactory factory = null;

        switch (type){
            case UNDEAD:
                factory = new UndeadFactory();
                break;
            case HUMAN:
                factory = new HumanFactory();
                break;
            case ORC:
                factory = new OrcFactory();
                break;
        }

        return  factory;
    }

    public static void main(String[] args) {

        raceCreate(RaceType.UNDEAD).createArcher();
        raceCreate(RaceType.UNDEAD).createWarrior();
        raceCreate(RaceType.UNDEAD).createMage();

        raceCreate(RaceType.HUMAN).createArcher();
        raceCreate(RaceType.HUMAN).createWarrior();
        raceCreate(RaceType.HUMAN).createMage();

        raceCreate(RaceType.ORC).createArcher();
        raceCreate(RaceType.ORC).createWarrior();
        raceCreate(RaceType.ORC).createMage();

    }

}
