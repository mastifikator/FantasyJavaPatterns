package Observer;

import java.util.ArrayList;
import java.util.List;

public class Observer {
    private String name;
    private ObservationTower observationTower;

    public Observer(String name, ObservationTower observationTower) {
        this.name = name;
        this.observationTower = observationTower;
    }

    public void lookAtTower(){
        if(observationTower.isSignalLight()) {
            System.out.println("Смотритель " + name + " увидел сигнальный огонь и начал отправлять гонцов!");
            alarm("Враг атакует");
        }
    }

    private List<Subscriber> subscribers = new ArrayList();

    public void subscribe(Subscriber subscribe){
        subscribers.add(subscribe);
        System.out.println("Подписчик " + subscribe + " подписался на уведомления смотрителя");
    }

    public void unsubscribe(Subscriber subscribe){
        subscribers.remove(subscribe);
        System.out.println("Подписчик " + subscribe + " отписался от уведомлений смотрителя");
    }

    public void alarm(String alarm){
        for(Subscriber subscriber : subscribers){
            System.out.println("Смотритель отправил депешу " + subscriber);
            subscriber.getAlarm(alarm);
            System.out.println("");
        }
    }

}
