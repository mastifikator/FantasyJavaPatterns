package Iterator;

public class Boots implements EquipmentPart{

    private String name;
    private int armor;
    private int weight;
    private EquipmentMaterial type;

    public Boots(EquipmentMaterial type) {
        this.armor = 5;
        this.weight = 5;
        this.type = type;
        this.name = "Ботинки";
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
