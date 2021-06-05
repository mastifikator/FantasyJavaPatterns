package Prototype;

public class Main {
    public static void main(String[] args) throws Exception{
        Unit unitOriginal = new Unit("Кентавр", "рыбак", "Петя");
        Unit unitClone = (Unit)unitOriginal.clone();
        unitClone.setName("КлонПети");

        System.out.println(unitOriginal.toString());
        System.out.println("Кентавра клонировали и изменили имя!");
        System.out.println(unitClone.toString());
    }
}
