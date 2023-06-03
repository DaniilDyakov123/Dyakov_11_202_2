import java.util.Comparator;

public class Task02 {
    public static void main(String[] args) {
    StringComparator sc = new StringComparator();
        System.out.println(sc.compare("asd", "ccc"));
    }
}

class StringComparator implements Comparator<String> {

    @Override
    public int compare(String a, String b) {

        if (a.length() < b.length()) {
            return -1;
        }
        else if (a.length() == b.length()) {
            return 0;
        }
        return 1;
    }

}

