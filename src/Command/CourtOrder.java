package Command;

public class CourtOrder extends Order {

    public CourtOrder(String objectOrder, String actionWithObject) {
        this.objectOrder = objectOrder;
        this.actionWithObject = actionWithObject;
    }

    @Override
    public void executeOrder() {
        System.out.println("Король постановил " + actionWithObject + " обвиняемого " + objectOrder);
    }

    @Override
    public void undoOrder() {
        System.out.println("Король отменил постановление " + actionWithObject + " обвиняемого " + objectOrder);
    }
}
