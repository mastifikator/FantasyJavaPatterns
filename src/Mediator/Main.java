package Mediator;

public class Main {
    public static void main(String[] args) {
        Orc orc1 = new Orc("Тралл", 30, 250);
        Orc orc2 = new Orc("Барака", 15, 250);

        Human human1 = new Human("Торгрим", 23, 350);
        Human human2 = new Human("Джайна", 20, 200);

        Undead undead1 = new Undead("Артас", 25, 400);
        Undead undead2 = new Undead("Гуль", 10, 200);

        Thread battle11 = new Thread(new DamageMediator(orc1, human1));
        battle11.start();

        Thread battle21 = new Thread(new DamageMediator(undead1, human2));
        battle21.start();

        Thread battle31 = new Thread(new DamageMediator(undead2, orc2));
        battle31.start();

    }
}
