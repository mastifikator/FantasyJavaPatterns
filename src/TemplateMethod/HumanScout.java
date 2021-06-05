package TemplateMethod;

public class HumanScout extends ScoutAction {

    public HumanScout(String name) {
        super(name);
        health = 300;
    }

    @Override
    public void meetGroupOrcs() {

        System.out.println();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Миновав лесную поляну " + name + " заметил группу Орков");
        if (isHaveMap) {
            System.out.println("Человек посмотрел на карту, и увидел обходную дорогу.. ффухх повезло");
            isHaveMap = false;
            meetGroupHuman();
        } else {
            if (isHaveMask) {
                System.out.println("Человек вспомнил что у него есть маскировка, одел ее и попытался пройти мимо орков");
                System.out.println("Но орки унюхали его по запаху.. и рассмеявшись надавали тумаков");
                isHaveMask = false;
                health -= 150;
                System.out.println("У человека осталось " + health + " здоровья");
                meetGroupHuman();
            } else {
                System.out.println("Понадеявшись на удачу человек прошел мимо орков... но не повезло, получил по морде");
                health -= 150;
                System.out.println("У человека осталось " + health + " здоровья");
                meetGroupHuman();
            }
        }
    }

    @Override
    public void meetGroupHuman() {

        System.out.println();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Миновав лесную поляну " + name + " заметил группу рыцарей");
        System.out.println("Здаров мужики, поздоровался Человек разведчик и перекурив табаку с рыцарями отправился дальше");
        meetGroupNightElf();
    }

    @Override
    public void meetGroupNightElf() {

        System.out.println();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Выйдя из леса " + name + " заметил группу Эльфов лучников");
        if (isHaveMask) {
            System.out.println("Человек вспомнил что у него есть маскировка, одел ее и попытался пройти мимо эльфов");
            System.out.println("Но эльфы очень зоркие и разглядели подмену!");
            System.out.println("Естественно эльфы попытались убить человека вырубающего их леса!");
            isHaveMask = false;
            health -= 150;
            System.out.println("У человека осталось " + health + " здоровья");
            if(health <= 0){
                System.err.println("Человек разведчик по имени " + name + " погиб от стрел эльфов =(");
            }else{
                enterTown();
            }
        } else {
            System.out.println("Понадеявшись на удачу человек попытался пробежать мимо эльфов... но не повезло, получил стрелу в зад");
            health -= 150;
            System.out.println("У человека осталось " + health + " здоровья");
            if(health <= 0){
                System.err.println("Человек разведчик по имени " + name + " погиб от стрел эльфов =(");
            }else{
                enterTown();
            }
        }
    }

    @Override
    public void enterTown() {

        System.out.println();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Побитый " + name + " увидел город, запомнил расположение города и первым делом пошел в таверну");

        if (isHaveMedicine) {
            System.out.println("Первым делом человек откупорил целебные мази и восстановил здоровье");
            health += 150;
            isHaveMedicine = false;
        }

        System.out.println("В таверне на человека пристально уставились четверо крепких мужиков");

        if (isHavePoison) {
            System.out.println("Человек разведчик понимал что у него есть в кармане яд, но решил поступить по другому");
        }

        System.out.println(name + "Подсел к мужикам, затер с ними за жизнь и все благополучно напились.");

        goBackHome();
    }

}
