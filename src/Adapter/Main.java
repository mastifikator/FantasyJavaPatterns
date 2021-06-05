package Adapter;

public class Main {
    public static void main(String[] args) {
        OrcBarracks orcBarracks = new OrcBarracks();

        System.out.println("В бараки Орков заходит орк: ");
        Orc orc = new Orc("Боря","кузнец",12);
        orcBarracks.enterToTheOrcBarracks(orc.tellMeTheOrcPassword());

        System.out.println();

        System.out.println("В бараки Орков пытается зайти человек: ");
        Human human = new Human("Владислав", "шпион", 23);
        orcBarracks.enterToTheOrcBarracks(human.tellMeTheHumanPassword());

        System.out.println();

        //Как войти человеку, используем адаптер
        System.out.println("Человек применил маскировку: ");
        HumanToOrcBarracksAdapter maskirovka = new HumanToOrcBarracksAdapter(human);
        orcBarracks.enterToTheOrcBarracks(maskirovka.tellMeTheOrcPassword());
        //Обман реализован
    }
}
