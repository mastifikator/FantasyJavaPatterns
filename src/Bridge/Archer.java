package Bridge;

public class Archer implements IUnitType{

    @Override
    public ERangeType getRangeType() {
        return ERangeType.RANGE;
    }

    @Override
    public EWeaponType getWeaponType() {
        return EWeaponType.PIERCING;
    }
}
