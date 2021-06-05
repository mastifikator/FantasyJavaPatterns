package Iterator;

public class Pants implements EquipmentPart{

    private String name;
    private int armor;
    private int weight;
    private EquipmentMaterial type;

    public Pants(EquipmentMaterial type) {
        this.armor = 15;
        this.weight = 30;
        this.type = type;
        this.name = "Штаны";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getArmor() {
        return armor + type.getIncreaseArmor();
    }
}
