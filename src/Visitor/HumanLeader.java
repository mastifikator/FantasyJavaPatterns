package Visitor;

public class HumanLeader {
    private String name;
    private boolean isNoble = true;
    boolean haveLocationFrostmourn;

    public HumanLeader(String name) {
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

    public void goToTheFrostmourne(){
        if(haveLocationFrostmourn){
            System.out.println("Нужно отправляться за клинком Фростморн чтобы выгнать орков с наших земель!");
        }else {
            System.out.println("Нужно захватить власть в королевстве и объединить людей против орков после смерти отца!");
        }
    }

}
