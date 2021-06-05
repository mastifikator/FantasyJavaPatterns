package Bridge;

public class Mage implements IUnitType{

    @Override
    public ERangeType getRangeType() {
        return ERangeType.RANGE;
    }

    @Override
    public EWeaponType getWeaponType() {
        return EWeaponType.MAGE;
    }
}
