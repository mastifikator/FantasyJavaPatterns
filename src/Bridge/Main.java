package Bridge;

public class Main {
    public static void main(String[] args) {
        Orc orc = new Orc("Борис", new Crusher());
        Human human = new Human("Святослав", new Warrior());
        Undead undead = new Undead("Гога", new Mage());
        NightElf nightElf = new NightElf("Леголас", new Archer());

        orc.attack();
        human.attack();
        undead.attack();
        nightElf.attack();
    }
}
