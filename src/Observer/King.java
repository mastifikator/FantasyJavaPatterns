package Observer;

public class King implements Subscriber {
    String name;

    public King(String name) {
        this.name = name;
    }

    @Override
    public void getAlarm(String alarm) {
        System.out.println(name + " Получил сообщение от смотрителя: " + alarm);
        System.out.println("Мой бравый генерал справится!");
    }

    @Override
    public String toString() {
        return "King{" +
                "name='" + name + '\'' +
                '}';
    }
}
