package Observer;

public class General implements Subscriber {
    String name;

    public General(String name) {
        this.name = name;
    }

    @Override
    public void getAlarm(String alarm) {
        System.out.println(name + " Получил сообщение от смотрителя: " + alarm);
        System.out.println("Сейчас вышлю подкрепление!");
    }

    @Override
    public String toString() {
        return "General{" +
                "name='" + name + '\'' +
                '}';
    }
}
