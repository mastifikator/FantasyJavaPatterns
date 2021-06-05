package Builder;


public class Main {
    public static void main(String[] args) {
        //настраиваем билдер
        UnitBuilder unitBuilder = new UnitBuilder();
        unitBuilder.setName("Петр");
        unitBuilder.setWeapon("Палка");
        unitBuilder.getResult();

        unitBuilder.setDamage(6.0);
        unitBuilder.getResult();

        unitBuilder.setProffesion("Бездельник");
        unitBuilder.getResult();
    }


}
