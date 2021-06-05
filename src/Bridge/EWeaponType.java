package Bridge;

public enum EWeaponType {
    PIERCING("Колющее"),
    CUTTING("Режущее"),
    CRUSH("Дробящее"),
    MAGE("Магическое");

    private String title;

    EWeaponType(String title) {
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
}
