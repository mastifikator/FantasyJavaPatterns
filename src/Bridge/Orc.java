package Bridge;

public class Orc {
    static String race = "Орк";
    private String name;
    private IUnitType type; //Тут мост между двумя иерархиями

    public Orc(String name, IUnitType type) {
        this.name = name;
        this.type = type; //Тут мост между двумя иерархиями
    }

    public void attack(){
        String attack = "%s %s начал атаковать %s используя %s оружие";
        System.out.printf(attack, race, name, type.getRangeType().getTitle(), type.getWeaponType().getTitle());
        System.out.println();
    }
}
