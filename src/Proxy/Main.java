package Proxy;

public class Main {
    public static void main(String[] args) {
        Lord lord = new Lord("Пудинг");
        LordAdvisor lordAdvisor = new LordAdvisor("Писков");

        System.out.println("Обращаемся к Лорду напрямую: ");
        lord.replyToRequest("Ваше благородие, мне нужен надел");
        System.out.println();
        lord.replyToRequest("Дай бабла!");

        System.out.println();

        //А теперь через прокси
        System.out.println("А теперь обращаемся к советнику Лорда: ");
        lordAdvisor.replyToRequest("Победите, пожалуйста, коррупцию");
        System.out.println();
        lordAdvisor.replyToRequest("Победите, пожалуйста, коррупцию... 500");
    }
}
