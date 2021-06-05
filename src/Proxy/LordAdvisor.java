package Proxy;

public class LordAdvisor implements IReply {
    private String name;
    private boolean noble = false;
    private Lord lord;

    public LordAdvisor(String name) {
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
    public void replyToRequest(String request) {
        System.out.println("Я передам ваш запрос Лорду... если, конечно ты приложил деньги к запросу");

        if(request.matches(".+\\d.+")){
            System.out.println("Маловато конечно, ну да ладно я передам Лорду");
            lord = new Lord("Лорд");
            lord.replyToRequest(request);
        }else {
            System.out.println("Вали отсюда, нищеброд!");
        }
    }
}
