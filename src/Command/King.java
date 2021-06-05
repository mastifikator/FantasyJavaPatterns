package Command;

import java.util.ArrayList;
import java.util.List;

public class King {
    String name;
    List<Order> orderList;

    public King(String name) {
        this.name = name;
    }

    String[] objectsConstruction = new String[]{"Кузницу", "Замок", "Школу", "Таверну", "Фонтаны"};
    String[] actionsConstruction = new String[]{"Построить", "Снести", "Отремонтировать", "Перенести", "Расширить"};

    String[] objectsCourt = new String[]{"Преступника", "Заговорщика", "Козла", "Трактирщика", "Должника", "Желтую Уточку"};
    String[] actionsCourt = new String[]{"Казнить", "Помиловать", "Выгнать", "Оштрафовать", "Наградить", "Посадить"};

    String[] objectsPrivate = new String[]{"Дочку", "Торт", "Музыкантов", "Аквадискотеку", "Вензеля"};
    String[] actionsPrivate = new String[]{"Достать", "Принести", "Купить", "Накормить", "Почесать"};


    public Order giveTheOrder(){
        orderList = new ArrayList<>();
        orderList.add(new ConstructionOrder(objectsConstruction[random(5)], actionsConstruction[random(5)]));
        orderList.add(new CourtOrder(objectsCourt[random(6)], actionsCourt[random(6)]));
        orderList.add(new PrivateOrder(objectsPrivate[random(5)], actionsPrivate[random(5)]));

        return orderList.get(random(3));
    }

    private int random(int x){
        return (int)Math.floor(Math.random()*x);
    }
}
