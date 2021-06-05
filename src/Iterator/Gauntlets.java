package Iterator;

public class Gauntlets implements EquipmentPart{

    private String name;
    private int armor;
    private int weight;
    private EquipmentMaterial type;

    public Gauntlets(EquipmentMaterial type) {
        this.armor = 5;
        this.weight = 5;
        this.type = type;
        this.name = "Перчатки";
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
