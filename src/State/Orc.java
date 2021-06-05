package State;

import java.awt.*;

public class Orc {
    private String name;
    private OrcStatement orcStatement;
    private double strength;
    private double speed;
    private Color skinColor = Color.GREEN;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Orc(String name, double strength, double speed) {
        this.name = name;
        this.strength = strength;
        this.speed = speed;
    }

    public void saidLokTar(){
        System.out.println("Лок Тар Огар!");
    }

    public OrcStatement getOrcStatement(){
        return this.orcStatement;
    }

    public void changeState(OrcStatement orcStatement){
        this.orcStatement = orcStatement;
    }

    public static class OrcChaosStatement extends OrcStatement{

        public OrcChaosStatement(Orc orc) {
            super(orc);
            orc.strength *= 2;
            orc.skinColor = Color.RED;
            System.out.println("Орк в ярости, получил силу хаоса, теперь его сила равна: " + orc.strength);
        }

        @Override
        public void orcBeat() {
            System.out.println("Орк бьёт высекая огонь хаоса!");
        }

        @Override
        public void orcCry() {
            System.out.println("Во славу легиона!");
        }
    }

    public static class OrcEatStrangeMushroomStatement extends OrcStatement{

        public OrcEatStrangeMushroomStatement(Orc orc) {
            super(orc);
            orc.speed *= 2;
            orc.skinColor = Color.GRAY;
            System.out.println("Орк съел непонятных грибов, ему срочно надо... бежать с удвоенной скоростью: " + orc.speed);
        }

        @Override
        public void orcRun() {
            System.out.println("Орк бежит роняя кал!");
        }

        @Override
        public void orcCry() {
            System.out.println("Лишь бы успеть, орк должен успеть!");
        }
    }

    public static class OrcDrinkVodkaStatement extends OrcStatement{

        public OrcDrinkVodkaStatement(Orc orc) {
            super(orc);
            orc.speed %= 2;
            orc.strength %= 2;
            orc.skinColor = Color.BLUE;
            System.out.println("Орк пьян, его характеристики снизились вдвое, но он очень смел!");
        }

        @Override
        public void orcBeat() {
            System.out.println("Я сссамый сиильный ОРК, ОРК-БОСС, щща как дам...ик!");
        }

        @Override
        public void orcRun() {
            System.out.println("Ухх ну погодии... дай.. тока.. ща догоню!");
        }

        @Override
        public void orcCry() {
            System.out.println("Эхх мнеб Сильвану.. ик.. Мнеб Ветрокрылую!");
        }
    }


}
