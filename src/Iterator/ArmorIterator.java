package Iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArmorIterator implements Iterator<EquipmentPart> {

    private Equipment equipment;
    private int equipmentCount;

    public ArmorIterator(Equipment equipment) {
        this.equipment = equipment;
        this.equipmentCount = equipment.getPartCount();
    }

    @Override
    public boolean hasNext() {
        if(equipmentCount > 0) return true;
        else return false;
    }

    @Override
    public EquipmentPart next() throws NoSuchElementException {
        if(equipmentCount <= 0){
            throw new NoSuchElementException("No more elements in this equipment");
        }

        try {
            if (equipmentCount == 5) return equipment.getHelm();
            if (equipmentCount == 4) return equipment.getGauntlets();
            if (equipmentCount == 3) return equipment.getBoots();
            if (equipmentCount == 2) return equipment.getPants();
            if (equipmentCount == 1) return equipment.getBody();
        }finally {
            equipmentCount--;
        }

        return null;
    }
}
