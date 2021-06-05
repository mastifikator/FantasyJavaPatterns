package TemplateMethod;

public class NightElfScout extends ScoutAction {

    public NightElfScout(String name) {
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
            System.out.println("Ночной эльф посмотрел на карту, и увидел обходную дорогу.. ффухх повезло");
            isHaveMap = false;
            meetGroupHuman();
        } else {
            if (isHaveMask) {
                System.out.println("Ночной эльф вспомнил что у него есть маскировка, одел ее и благополучно пробрался мимо орков");
                isHaveMask = false;
                meetGroupHuman();
            } else {
                System.out.println("Понадеявшись на удачу Ночной эльф прошел мимо орков... но не повезло, получил по морде");
                health -= 150;
                System.out.println("У Ночной эльф осталось " + health + " здоровья");
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
        if (isHaveMask) {
            System.out.println("Ночной эльф вспомнил что у него есть маскировка, одел ее и спокойно прошел мимо рыцарей");
            isHaveMask = false;
            meetGroupNightElf();
        } else {
            System.out.println("Понадеявшись на удачу Ночной эльф пошел мимо рыцарей... но не повезло, получил по морде");
            health -= 150;
            System.out.println("У Ночного эльфа осталось " + health + " здоровья");

            if (health <= 0) {
                System.err.println("Ночной эльф разведчик по имени " + name + " был зарублен рыцарями =(");
            } else {
                meetGroupNightElf();
            }
        }

    }

    @Override
    public void meetGroupNightElf() {

        System.out.println();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Миновав лесную поляну " + name + " заметил группу эльфов лучников");
        System.out.println("Elen sila lumenn omentilmo, поздоровался эльф, Aaye ответили эльфы, разведчик отправился дальше");
        enterTown();
    }

    @Override
    public void enterTown() {

        System.out.println();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + " увидел город, запомнил расположение города и первым делом пошел в таверну");

        if (isHaveMedicine) {
            System.out.println("Первым делом Ночной эльф откупорил целебные мази и восстановил здоровье");
            health += 150;
            System.out.println("У Ночного стало " + health + " здоровья");
            isHaveMedicine = false;
        }
        System.out.println("В таверне на Ночного эльфа пристально уставились четверо крепких мужиков");

        if (isHavePoison) {
            System.out.println("Ночной эльф не стушевался и подсыпал яд в пиво которое официантка проносила завсегдатаям");
            isHavePoison = false;
            goBackHome();
        } else {
            System.out.println("Драки было не избежать... мужики намяли бока Ночному эльфу");
            health -= 150;
            System.out.println("У ночного эльфа осталось " + health + " здоровья");

            if (health <= 0) {
                System.err.println("Ночной эльф разведчик по имени " + name + " бесславно погиб в драке в таверне =(");
            } else {
                goBackHome();
            }
        }
    }

}
