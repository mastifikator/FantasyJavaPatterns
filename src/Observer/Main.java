package Observer;

public class Main {
    public static void main(String[] args) {
        ObservationTower observationTower = new ObservationTower();
        Observer observer = new Observer("Морфеус", observationTower);
        King king = new King("Ричард");
        General general = new General("Максисилиан");
        Admiral admiral = new Admiral("Баркасов");

        observer.subscribe(king);
        observer.subscribe(general);
        observer.subscribe(admiral);

        System.out.println("");

        observationTower.enemyAttack();
        System.out.println();

        observer.lookAtTower();
        System.out.println();

        observationTower.enemyGone();
        observer.unsubscribe(admiral);

    }
}
