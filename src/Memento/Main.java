package Memento;

public class Main {

    public static void main(String[] args) {
        //Паттерн предусматривает сохранение во внешний источник, с чем успешно справляется Serializable в Java так что пример бестолковый
        Unit unit = new Unit("Петр", 150, 23,10);
        System.out.println(unit);
        System.out.println("Изменили");
        unit.setHealth(100);
        unit.setArmor(5);
        System.out.println(unit);
        System.out.println("Сохранили");
        Unit save = unit.saveUnit();
        System.out.println("Еще раз изменили");
        unit.setHealth(120);
        unit.setArmor(3);
        System.out.println(unit);
        System.out.println("Загрузили сохраненное");
        unit = unit.loadUnit(save);
        System.out.println(unit);


    }
}
