import java.util.Collection;
import java.util.Iterator;

public class IntArrayCollection extends AbstractIntCollection {

    private int capacity = 128;
    private final double LOAD_FACTOR = 0.67;

    private int [] arr = new int[capacity];






    @Override
    public boolean contains(Object o) {
        for (Object x: arr) {
            if (x == o) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }
    private void resize () {
        System.out.println("Resize called");
        if (n > capacity * LOAD_FACTOR) {
            capacity = (int) (capacity / LOAD_FACTOR);
            int [] arrNew = new int[capacity];
            for (int i = 0; i < n; i++) {
                arrNew[i] = arr[i];
            }
            arr = arrNew;
        }
    }
    @Override
    public boolean add(Integer x) {
        resize();
        arr[n] = x;
        n++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        boolean flag = false;
        int ind = -1;
        for (int i = 0; i < n && !flag; i++) {
            if (o.equals(arr[i])) {
                flag = true;
                ind = i;
            }
        }
        if (flag) {
            for (int i = ind; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
        }
        return flag;

    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }



    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
    for (int i: arr) {
        arr[i] = 0;
    }

    }
}
