package AbstractFactory;

public class OrcFactory implements IAbstractUnitFactory {
    @Override
    public IWarrior createWarrior() {
        return new OrcWarrior();
    }

    @Override
    public IArcher createArcher() {
        return new OrcArcher();
    }

    @Override
    public IMage createMage() {
        return new OrcMage();
    }
}
