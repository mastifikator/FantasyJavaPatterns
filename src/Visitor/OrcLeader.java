package Visitor;

public class OrcLeader {
    private String name;
    private boolean isNoble;
    private double money = 2000;

    public OrcLeader(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNoble() {
        return isNoble;
    }

    public void setNoble(boolean noble) {
        isNoble = noble;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void warWithHuman(){
        if(money < 3000){
            System.out.println("Надо пойти добыть денег с мягкотелых людишек!");
        }else {
            System.out.println("Надо построить корабли и отправляться в Дуротар!");
        }
    }
}
