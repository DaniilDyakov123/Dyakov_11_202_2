import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static String toBin(int a) {
        if (a == 1) {
            return "00";
        }
        if (a == 2) {
            return "01";
        }
        if (a == 3) {
            return "10";
        }
        if (a == 4) {
            return "11";
        }
        return "666";
    }
    public static void main(String[] args) throws FileNotFoundException {
        int time1 = (int) System.currentTimeMillis();
        Scanner scanner = new Scanner(new File("/Users/dyakovdaniil/Documents/university/Dyakov_11_202_2/Dyakov_11_202_2/Classwork2/src/Data.txt"));

        Scanner sc = new Scanner(System.in);
        String ans = "";


        do {
            for (int i = 0; i < 5; i++) {
                String name = scanner.nextLine();

                System.out.println(name);
            }
            int a = sc.nextInt();
            ans += toBin(a);

            System.out.println(ans);
        }
        while (scanner.hasNext());
        int time2 = (int) System.currentTimeMillis();
        System.out.println((time2 - time1) / 1000);

    }
}