package Bridge;

public class Undead {
    static String race = "Нежить";
    private String name;
    private IUnitType type; //Тут мост между двумя иерархиями

    public Undead(String name, IUnitType type) {
        this.name = name;
        this.type = type; //Тут мост между двумя иерархиями
    }

    public void attack(){
        String attack = "%s %s начал атаковать %s используя %s оружие";
        System.out.printf(attack, race, name, type.getRangeType().getTitle(), type.getWeaponType().getTitle());
        System.out.println();
    }
}
