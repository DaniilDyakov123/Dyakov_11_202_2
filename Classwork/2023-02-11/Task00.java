import java.util.LinkedList;
import java.util.Scanner;

public class Task00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LinkedList<Integer> linky = new LinkedList<Integer>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            linky.add(x);
        }
        System.out.println(linky);


    }
}
