import java.util.Comparator;

public class Task23 {
    public static void main(String[] args) {

    }
}
class HammingComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() != s2.length()) {
            throw new ArithmeticException();
        } else {
            int k = 0;
            int count = 0;
            for (int i = 0; i < s1.length(); i++) {
                char x = s1.charAt(i);
                char y = s2.charAt(i);
                if (x != y) {
                    count++;
                    if (k == 0) {
                        k = x > y ? 1 : -1;

                    }
                }
            }
            return k * count;
        }

    }
}
