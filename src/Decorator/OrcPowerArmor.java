package Decorator;

public class OrcPowerArmor extends Orc{

    private Orc orcOriginal;

    public OrcPowerArmor(Orc orc) {

        super(orc.getName());
        this.orcOriginal = orc;
    }

    @Override
    public String getName() {
        return orcOriginal.getName() + " Ad victoriam! ";
    }

    @Override
    public void setName(String name) {
        orcOriginal.setName(name);
    }

    @Override
    public int getPower() {
        return orcOriginal.getPower() + 150;
    }

    @Override
    public void setPower(int power) {
        orcOriginal.setPower(power);
    }

    @Override
    public int getSpeed() {
        return orcOriginal.getSpeed() + 100;
    }

    @Override
    public void setSpeed(int speed) {
        orcOriginal.setSpeed(speed);
    }
}
