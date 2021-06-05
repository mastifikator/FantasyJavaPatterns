package Command;

public class Main {

    public static void main(String[] args) {
        King king = new King("Путин");
        Clerk clerk = new Clerk("Песков");

        //Клерк является хранителем объектов команд, организуя очередь
        clerk.writeOrder(king.giveTheOrder());
        System.out.println();
        clerk.writeOrder(king.giveTheOrder());
        System.out.println();
        clerk.writeOrder(king.giveTheOrder());
        System.out.println();
        clerk.writeOrder(king.giveTheOrder());
        System.out.println();
        clerk.writeOrder(king.giveTheOrder());
        System.out.println();
        clerk.deleteLastOrder();
        System.out.println();
        clerk.deleteLastOrder();

        //Тут стэк опустошается
        System.out.println();
        clerk.announceOrders();

    }
}
