package Bridge;

public class Warrior implements IUnitType{

    @Override
    public ERangeType getRangeType() {
        return ERangeType.CLOSE;
    }

    @Override
    public EWeaponType getWeaponType() {
        return EWeaponType.CUTTING;
    }
}
