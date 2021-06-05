package ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("user","123456","", "Russia");
        User user2 = new User("nagibator3000","rfgjfgjfjg","", "Alaska");
        User user3 = new User("user","123456","", "USA");
        User user4 = new User("user","12345","", "Russia");
        User user5 = new User("user","123456","", "Russia");
        user5.setBlocked(true);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);

        for(User u : userList){
            //Вот тут реализована цепочка обязанностей
            User userAuthorized = new CheckAuthorization(new CheckBlock(new CheckLocation(u).check()).check()).check();
            System.out.println();
        }
    }
}
