package TemplateMethod;

public class OrcScout extends ScoutAction{

    public OrcScout(String name) {
        super(name);
        health = 400;
        System.out.println("Орки от рождения здоровые, разведчик получает +100 очков здоровья");
    }

    @Override
    public void meetGroupOrcs() {

        System.out.println();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Выйдя за ворота родного города " + name + "увидел группу орков!");
        System.out.println("Привет братья проррычал " + name + " и двинулся по своим делам");
        meetGroupHuman();
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
        if(isHaveMap){
            System.out.println("Орк посмотрел на карту, и ничего не понял... зачем орк купил карту...");
            isHaveMap = false;
            System.out.println("Понадеявшись на удачу орк пошел мимо рыцарей... но не повезло, получил по морде");
            health -= 150;
            System.out.println("У орка осталось " + health + " здоровья");
            meetGroupNightElf();
        }else {
            if(isHaveMask){
                System.out.println("Орк вспомнил что у него есть маскировка, одел ее и спокойно прошел мимо рыцарей");
                isHaveMask = false;
                meetGroupNightElf();
            }else {
                System.out.println("Понадеявшись на удачу орк пошел мимо рыцарей... но не повезло, получил по морде");
                health -= 150;
                System.out.println("У орка осталось " + health + " здоровья");
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

        System.out.println("Выйдя из леса " + name + " заметил группу Эльфов лучников");
        System.out.println("У орка не осталось не карты ни маскировки, все что осталось, это пробежать мимо эльфов");
        System.out.println("Естественно орк получил стрелу в зад!");
        health -= 150;
        System.out.println("У орка осталось " + health + " здоровья");
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

        System.out.println("Побитый " + name + " увидел город, запомнил расположение города и первым делом пошел в таверну");
        if(isHaveMedicine){
            System.out.println("Первым делом орк откупорил целебные мази и восстановил здоровье");
            health += 150;
            System.out.println("У орка осталось " + health + " здоровья");
            isHaveMedicine = false;
        }
        System.out.println("В таверне на орка пристально уставились четверо крепких мужиков");

        if (isHavePoison){
            System.out.println("Орк не стушевался и подсыпал яд в пиво которое официантка проносила завсегдатаям");
            isHavePoison = false;
            goBackHome();
        }else {
            System.out.println("Драки было не избежать... мужики намяли бока орку");
            health -= 150;
            System.out.println("У орка осталось " + health + " здоровья");

            if(health <= 0){
                System.err.println("Орк разведчик по имени " + name + " бесславно погиб в драке в таверне =(");
            }else{
                goBackHome();
            }
        }

    }

}
