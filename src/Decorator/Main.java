package Decorator;

public class Main {

    public static void main(String[] args) {

        Orc orc = new Orc("Боря");
        OrcPowerArmor orcWrap = new OrcPowerArmor(orc);

        System.out.println("Выводим характеристики простого орка");
        printOrcProperties(orc);

        System.out.println();

        System.out.println("Выводим характеристики орка в силовой броне!");
        printOrcProperties(orcWrap);
    }

    public static void printOrcProperties(Orc orc) {
        System.out.println(orc.getName());
        System.out.println("сила " + orc.getPower());
        System.out.println("скорость " + orc.getSpeed());
    }
}
