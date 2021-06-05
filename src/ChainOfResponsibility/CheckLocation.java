package ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class CheckLocation implements ICheck  {
    List<String> blockLocations = new ArrayList<>();
    private User user;

    public CheckLocation(User user) {
        this.user = user;
        blockLocations.add("USA");
        blockLocations.add("Canada");
    }

    @Override
    public User check(){
        if(user == null) return null;

        if(blockLocations.contains(user.getLocation())){
            System.out.println("Пользователи из " + user.getLocation() + " заблокированы!");
            return null;
        }else{
            System.out.println("Приветствуем гражданин " + user.getLocation());
            return user;
        }
    }
}
