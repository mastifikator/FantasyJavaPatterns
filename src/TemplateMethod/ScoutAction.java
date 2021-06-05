package TemplateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public abstract class ScoutAction {
    String name;
    boolean isHaveMap;
    boolean isHaveMask;
    boolean isHavePoison;
    double health = 300;
    double money = 300;
    boolean isHaveMedicine;
    BufferedReader reader;

    public ScoutAction(String name) {
        this.name = name;
    }

    public boolean choiceHelper(){
        reader = new BufferedReader(new InputStreamReader(System.in));
        String choice = "";

        while(!(choice.equals("да") || choice.equals("нет"))) {
            System.out.println("Наберите Да или Нет: ");
            try {
                choice = reader.readLine();
                choice = choice.toLowerCase();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if(choice.equals("да")) return true;
        else return false;
    }

    public void goScouting(){
        System.out.println( name + " получил задание на осмотр территорий");
        System.out.println();
        buyEquipment();
    }

    public void buyEquipment(){
        System.out.println("Разведчику выдано 300 монет на операцию");
        System.out.println("В магазине можно купить Карту, Маскировку, Яд или Лечебные мази");
        System.out.println("Все стоит по 150 монет");

            System.out.println(name + " купит Карту за 150 монет?");
            isHaveMap = choiceHelper();
            if (isHaveMap) money -= 150;

            System.out.println(name + " купит Маскировку за 150 монет?");
            isHaveMask = choiceHelper();
            if (isHaveMask) money -= 150;

            if (money > 0) {
                System.out.println(name + " купит Яд за 150 монет?");
                isHavePoison = choiceHelper();
                if (isHavePoison) money -= 150;
            } else {
                System.out.println("Деньги закончились!");
            }

            if (money > 0) {
                System.out.println(name + " купит лечебные мази за 150 монет?");
                isHaveMedicine = choiceHelper();
                if (isHaveMedicine) money -= 150;
            } else {
                System.out.println("Деньги закончились!");
            }

        System.out.println(name + " закончил покупки и вышел из родного города!");
        System.out.println();
        meetGroupOrcs();
    }

    //Тут шаблон путешествия будет разворачиваться в зависимости от выбранной расы
    public abstract void meetGroupOrcs();

    public abstract void meetGroupHuman();

    public abstract void meetGroupNightElf();

    public abstract void enterTown();

    public void goBackHome(){
        System.out.println();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Разведчик по имени " + name + "успешно вернулся к себе домой и доложил командиру о своих приключениях!");
        System.out.println("У разведчика осталось " + health + " очков здоровья");
    }

}
