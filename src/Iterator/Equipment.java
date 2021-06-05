package Iterator;

import java.util.Iterator;

public class Equipment implements Iterable<EquipmentPart>{
    private Helm helm;
    private Body body;
    private Gauntlets gauntlets;
    private Boots boots;
    private Pants pants;
    private int partCount;


    public Equipment(Helm helm, Body body, Gauntlets gauntlets, Boots boots, Pants pants) {
        this.helm = helm;
        this.body = body;
        this.gauntlets = gauntlets;
        this.boots = boots;
        this.pants = pants;
        partCount = 5;
    }

    public Equipment(Body body, Gauntlets gauntlets, Boots boots, Pants pants) {
        this.body = body;
        this.gauntlets = gauntlets;
        this.boots = boots;
        this.pants = pants;
        partCount = 4;
    }

    public Equipment(Body body, Boots boots, Pants pants) {
        this.body = body;
        this.boots = boots;
        this.pants = pants;
        partCount = 3;
    }

    public Equipment(Body body, Pants pants) {
        this.body = body;
        this.pants = pants;
        partCount = 2;
    }

    public Equipment(Body body) {
        this.body = body;
        partCount = 1;
    }

    public Helm getHelm() {
        return helm;
    }

    public Body getBody() {
        return body;
    }

    public Gauntlets getGauntlets() {
        return gauntlets;
    }

    public Boots getBoots() {
        return boots;
    }

    public Pants getPants() {
        return pants;
    }

    public int getPartCount() {
        return partCount;
    }

    @Override
    public Iterator<EquipmentPart> iterator() {
        return new ArmorIterator(this);
    }
}
