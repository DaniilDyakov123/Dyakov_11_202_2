import java.util.Collection;

public class Task01 {
    public static void main(String[] args) {

    }
}

class IntComparator<Integer> implements java.util.Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return (int) o1 - (int) o2;
    }
}