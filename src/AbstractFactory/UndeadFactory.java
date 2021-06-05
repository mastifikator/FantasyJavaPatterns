package AbstractFactory;

public class UndeadFactory implements IAbstractUnitFactory {
    @Override
    public IWarrior createWarrior() {
        return new UndeadWarrior();
    }

    @Override
    public IArcher createArcher() {
        return new UndeadArcher();
    }

    @Override
    public IMage createMage() {
        return new UndeadMage();
    }
}


