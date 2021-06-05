package Singletone;

public class Main {
    public static void main(String[] args) {
        Unit unit1 = Unit.getInstance("орк","Скаут", "Социальный");
        Unit unit2 = Unit.getInstance("орк","Скаут", "Социальный");

        System.out.println(unit1);
        System.out.println(unit2);

        System.out.println("Изменили имя по ссылке unit1");
        unit2.setName("Одиночка");

        System.out.println(unit1);
        System.out.println(unit2);
        System.out.println("А имя изменилось у объекта по ссылке unit1 и по ссылке unit2");
        System.out.println("Похоже ссылки unit1 и unit2 ссылаются на один объект..");
    }
}
