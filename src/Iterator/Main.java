package Iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Helm helm = new Helm(EquipmentMaterial.METALL);
        Body body = new Body(EquipmentMaterial.BRIGANDINE);
        Pants pants = new Pants(EquipmentMaterial.PLATE);
        Gauntlets gauntlets = new Gauntlets(EquipmentMaterial.GLASS);
        Boots boots = new Boots(EquipmentMaterial.METALL);

        Equipment equipment = new Equipment(helm, body, gauntlets, boots, pants);
        int equipmentArmor = 0;

        Equipment halfEquipment = new Equipment(body, boots, pants);
        int halfEquipmentArmor = 0;

        Iterator armorIterator = equipment.iterator();
        while(armorIterator.hasNext()){
            EquipmentPart part = (EquipmentPart)armorIterator.next();
            System.out.println("Броня элемента " + part.getName() + " составляет " + part.getArmor());
            equipmentArmor += pants.getArmor();
        }
        System.out.println("Броня полного набора составляет " + equipmentArmor);

        System.out.println();

        armorIterator = halfEquipment.iterator();
        while(armorIterator.hasNext()){
            EquipmentPart part = (EquipmentPart)armorIterator.next();
            System.out.println("Броня элемента " + part.getName() + " составляет " + part.getArmor());
            halfEquipmentArmor += pants.getArmor();
        }
        System.out.println("Броня половинного набора составляет " + halfEquipmentArmor);

    }
}
