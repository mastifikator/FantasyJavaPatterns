package Observer;

public class Admiral implements Subscriber {
    String name;

    public Admiral(String name) {
        this.name = name;
    }

    @Override
    public void getAlarm(String alarm) {
        System.out.println(name + " Получил сообщение от смотрителя: " + alarm);
        System.out.println("Нахрена вы мне это прислали... около смотровой башни нет моря...");
    }

    @Override
    public String toString() {
        return "Admiral{" +
                "name='" + name + '\'' +
                '}';
    }
}
