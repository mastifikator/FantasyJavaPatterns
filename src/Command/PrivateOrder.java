package Command;

public class PrivateOrder extends Order {

    public PrivateOrder(String objectOrder, String actionWithObject) {
        this.objectOrder = objectOrder;
        this.actionWithObject = actionWithObject;
    }

    @Override
    public void executeOrder() {
        System.out.println("Король приказал " + actionWithObject + " ему " + objectOrder);
    }

    @Override
    public void undoOrder() {
        System.out.println("Король сказал что ему уже не надо " + actionWithObject + " " + objectOrder);
    }
}
