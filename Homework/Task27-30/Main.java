import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException  {
        int n = 3; // users
        int s = 2; // subs


        //users
        Scanner scFile1 = new Scanner (new File("/Users/dyakovdaniil/Documents/university/Dyakov_11_202/Classwork/untitled/src/names.txt"));
        String [] names = new String[n];
        do {
            for (int i = 0; i < n; i++) {
                names[i] = scFile1.nextLine();
            }
        } while(scFile1.hasNext());
        User u1 = new User(names[0]);
        User u2 = new User(names[1]);
        User u3 = new User(names[2]);


        //db
        DB db = new DB();
        db.users.add(u1);
        db.users.add(u2);
        db.users.add(u3);

        //subs
        Scanner scFile2 = new Scanner(new File("/Users/dyakovdaniil/Documents/university/Dyakov_11_202/Classwork/untitled/src/subscriptions.txt"));
        String [] subs = new String[s];
        do {
            for(int i = 0; i < s; i++) {
                subs[i] = scFile2.nextLine();
            }
        } while(scFile2.hasNext());
        Subscription s1 = new Subscription(subs[0], db);
        Subscription s2 = new Subscription(subs[1], db);








        System.out.println(db.getUsers());
        System.out.println(db.getName(db.users.get(0)));
        System.out.println(db.getUserYear(db.users.get(1)));
        AnalyticsService as = new AnalyticsService();
        as.getLastNamesBeforeYear(2006, db);
        System.out.println(as.getNumberByYear(2004, db));
        System.out.println(db.users.size());
        System.out.println(s1);
    }
}