package Iterator;

public class Helm implements EquipmentPart{

    private String name;
    private int armor;
    private int weight;
    private EquipmentMaterial type;

    public Helm(EquipmentMaterial type) {
        this.armor = 10;
        this.weight = 8;
        this.type = type;
        this.name = "Шлем";
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
