package Command;

public class ConstructionOrder extends Order {

    public ConstructionOrder(String objectOrder, String actionWithObject) {
        this.objectOrder = objectOrder;
        this.actionWithObject = actionWithObject;
    }

    @Override
    public void executeOrder() {
        System.out.println("Король постановил " + actionWithObject + " в королевстве " + objectOrder);
    }

    @Override
    public void undoOrder() {
        System.out.println("Король отменил постановление " + actionWithObject + " в королевстве " + objectOrder);
    }
}
