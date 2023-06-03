import java.util.ArrayList;
import java.util.List;

public class DB {
    public List<Subscription> subs = new ArrayList<>();
    public List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }
    public String getName(User u){
        return u.getName();
    }
    public int getUserYear(User u){
        return u.getYear();
    }
    public void getSubscriptions(){
        for (int i = 0; i < subs.size(); i++) {
            System.out.println(subs.get(i));
        }
    }



}
