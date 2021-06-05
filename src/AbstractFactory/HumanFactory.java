package AbstractFactory;

public class HumanFactory implements IAbstractUnitFactory {
    @Override
    public IWarrior createWarrior() {
        return new HumanWarrior();
    }

    @Override
    public IArcher createArcher() {
        return new HumanArcher();
    }

    @Override
    public IMage createMage() {
        return new HumanMage();
    }
}
