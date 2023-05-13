import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scFile1 = new Scanner(new File("/Users/dyakovdaniil/Documents/university/Dyakov_11_202_2/Dyakov_11_202_2/Classwork2/src/BirthsKingCounty2001.txt"));
        String[] names = new String[2500];
        do {
            for (int i = 0; i < 2500; i++) {
                names[i] = scFile1.nextLine();
            }
        } while (scFile1.hasNext()) ;
        DB db = new DB();
        for (int i = 0; i < names.length; i++) { //Task00
            Child c = new Child(names[i]);
            db.children.add(c);
        }
        System.out.println(db.getChildren());
    }
}
