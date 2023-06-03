import java.util.List;

public class User {
    private String name;
    private String city;
    private int year;
    private String mainInterest;
    private String bio;
    private String favColor;
    private String pet;
    private String futureProf;

    public User(List<String> l) {
        name = l.get(0);
        city = l.get(1);
        year = Integer.parseInt(l.get(2));
        mainInterest = l.get(3);
        bio = l.get(4);
        favColor = l.get(5);
        pet = l.get(6);
        futureProf = l.get(7);
    }
    public String toString() {
        return name + " " + city + " " + year + " " + mainInterest + " " + bio + " " + favColor + " " + pet + " " + futureProf;
    }
}
