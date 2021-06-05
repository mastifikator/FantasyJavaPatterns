package Observer;

public class ObservationTower {
    private boolean signalLight;

    public boolean isSignalLight() {
        return signalLight;
    }

    void enemyAttack(){
        signalLight = true;
        System.out.println("На башне зажжен сигнальный огонь");
    }

    void enemyGone(){
        signalLight = false;
        System.out.println("На башне потушен сигнальный огонь");
    }
}
