package Proxy;

public class Lord implements IReply{
    private String name;
    private boolean noble = true;

    public Lord(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNoble() {
        return noble;
    }

    public void setNoble(boolean noble) {
        this.noble = noble;
    }

    @Override
    public void replyToRequest(String request){
        if(request.matches(".*Ваше благородие.*")){
            System.out.println("Твой запрос будет удовлетворен");
        }else{
            System.out.println("Пошел вон, смерд!");
        }
    }

}
