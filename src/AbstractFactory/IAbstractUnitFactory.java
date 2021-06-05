package AbstractFactory;

public interface IAbstractUnitFactory {
    IWarrior createWarrior();
    IArcher createArcher();
    IMage createMage();
}
