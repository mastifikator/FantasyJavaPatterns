package Command;

import java.util.List;
import java.util.Stack;

public class Clerk {
    String name;
    private Stack<Order> historyOrders = new Stack<>();

    public Clerk(String name) {
        this.name = name;
    }

    public void writeOrder(Order order){
        historyOrders.push(order);
        order.executeOrder();
        System.out.println("Приказ записан Ваша светлость!");
    }

    public void deleteLastOrder(){
        historyOrders.pop().undoOrder();
        System.out.println("Приказ отменен Ваша светлость!");
    }

    public void announceOrders(){
        System.out.println("Оглашаю приказы Ваша светлость");
        for(Order order : historyOrders){
            order.executeOrder();
        }
    }

}
