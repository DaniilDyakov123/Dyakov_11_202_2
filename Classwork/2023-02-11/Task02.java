import java.util.LinkedList;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LinkedList<Integer> linky = new LinkedList<Integer>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            linky.add(x);
        }
        System.out.println(linky);

        int i = 0;
        int x = 2;
        boolean flag = false;
        while (i < n && !flag) {
            if (linky.getFirst() == x) {
                flag = true;
            }
            linky.removeFirst();
            i++;
        }
        System.out.println(flag);

    }
}
