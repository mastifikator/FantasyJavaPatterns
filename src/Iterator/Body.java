package Iterator;

public class Body implements EquipmentPart{

    private String name;
    private int armor;
    private int weight;
    private EquipmentMaterial type;

    public Body(EquipmentMaterial type) {
        this.armor = 20;
        this.weight = 35;
        this.type = type;
        this.name = "Нагрудник";
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
