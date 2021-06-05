package Strategy;

public class NightElfBase {
    private String name;
    private double health;
    IDefenceStrategy iDefenceStrategy;

    public NightElfBase(String name, double health) {
        this.name = name;
        this.health = health;
        System.out.println("Создана лесная база ночных эльфов " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void enemyDetected(int race){
        if(race == 1){
            iDefenceStrategy = new OppositeOrcs();
            iDefenceStrategy.executeStrategy();
        }else if(race == 2){
            iDefenceStrategy = new OppositeHuman();
            iDefenceStrategy.executeStrategy();
        }else if(race == 3){
            iDefenceStrategy = new OppositeUndead();
            iDefenceStrategy.executeStrategy();
        }else{
            System.out.println("Такой расы не существует!");
        }
    }

}
