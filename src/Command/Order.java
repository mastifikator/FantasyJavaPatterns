package Command;

public abstract class Order {

    String objectOrder = null;
    String actionWithObject = null;

    public abstract void executeOrder();
    public abstract void undoOrder();

}
