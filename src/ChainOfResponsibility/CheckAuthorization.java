package ChainOfResponsibility;

import java.util.HashMap;
import java.util.Map;

public class CheckAuthorization implements ICheck {
    Map<String, String> authorizations = new HashMap<String, String>();
    private User user;

    public CheckAuthorization(User user) {
        this.user = user;
        authorizations.put("admin", "admin");
        authorizations.put("user", "123456");
        authorizations.put("hacker", "654321");
    }

    @Override
    public User check(){
        if(user == null) return null;

        if(authorizations.containsKey(user.getName()) && authorizations.get(user.getName()).equals(user.getPass())){
            System.out.println("Пользователь " + user.getName() + " авторизован.");
            return user;
        }else {
            System.out.println("Пользователь " + user.getName() + " не прошел авторизацию.");
            return null;
        }
    }
}
