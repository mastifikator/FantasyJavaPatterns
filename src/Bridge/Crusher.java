package Bridge;

public class Crusher implements IUnitType{

    @Override
    public ERangeType getRangeType() {
        return ERangeType.CLOSE;
    }

    @Override
    public EWeaponType getWeaponType() {
        return EWeaponType.CRUSH;
    }
}
