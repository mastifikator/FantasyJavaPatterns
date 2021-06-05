package Iterator;

public enum EquipmentMaterial {
    METALL(5),
    BRIGANDINE(10),
    STEEL(15),
    PLATE(20),
    GLASS(25);

    private int increaseArmor;

    EquipmentMaterial(int i) {
        this.increaseArmor = i;
    }

    public int getIncreaseArmor(){
        return increaseArmor;
    }
}
