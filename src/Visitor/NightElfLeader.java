package Visitor;

public class NightElfLeader {
    private String name;
    private boolean isNoble;
    boolean haveDruidHorn;

    public NightElfLeader(String name) {
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

    public void goToWakeUpDemigod(){
        if(haveDruidHorn){
            System.out.println("Нужно отправляться разбудить древнего полубога, он выгонит нежить и орков из лесов!");
        }else {
            System.out.println("Нужно бить захватчиков!");
        }
    }
}
