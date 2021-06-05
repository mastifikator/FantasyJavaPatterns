package Mediator;

public class DamageMediator implements Runnable {

    Unit unitAttacker;
    Unit unitAttacked;

    public DamageMediator(Unit unitAttacker, Unit unitAttacked){
        this.unitAttacker = unitAttacker;
        this.unitAttacked = unitAttacked;
    }

    @Override
    public void run() {
        while(unitAttacked.getHealth() > 0 && unitAttacker.getHealth() > 0) {
            //тут можно реализовать сложную логику нанесения повреждений
            synchronized (this) {
                unitAttacked.health -= unitAttacker.getDamage();
                System.out.println(unitAttacker.getName() + " нанес " + unitAttacked.getName() + " " + unitAttacker.getDamage() + " повреждений");

                if (unitAttacked.health <= 0) {
                    System.out.println(unitAttacked.getName() + " погиб");
                    unitAttacked.dead();
                    System.out.println(unitAttacker.getName() + " победил!");
                }

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                unitAttacker.health -= unitAttacked.getDamage();
                System.out.println(unitAttacked.getName() + " нанес " + unitAttacker.getName() + " " + unitAttacked.getDamage() + " повреждений");

                if (unitAttacker.health <= 0) {
                    System.out.println(unitAttacker.getName() + " погиб");
                    unitAttacker.dead();
                    System.out.println(unitAttacked.getName() + " победил!");
                }

            }





        }
    }
}
