import java.util.ArrayList;
import java.util.List;

public class VectorCode {

    class Elem {
        protected int index;
        protected int value;
        public Elem(int i, int v) {
            this.index = i;
            this.value = v;
        }
    }
    private List<Elem> al = new ArrayList<>();
    private int len = 0;

    public VectorCode(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                Elem e = new Elem(i, arr[i]);
                al.add(e);
            }
        }
        this.len = arr.length;
    }


    public int [] decode() {
        int [] m = new int[this.len * 1.5];
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).index == i) {
                m[i] = al.get(i).value;
            } else {
                m[i] = 0;
            }
        }
        return m;
    }
    public void insert(int k, int pos) {
        boolean flag = false;
        for (int i = 0; i < al.size() && flag == false; i++) {
            if (al.get(i).index == pos) {
                al.remove(pos);
                al.add(new Elem(pos, k));
                flag = true;
            }
        }
        if (flag == false) {
            al.add(new Elem(pos, k));
        }
    }
    public void delete(int pos) {
        for(int i = 0; i < al.size(); i++) {
            if (al.get(i).index == pos) {
                al.remove(pos);
            }
        }
    }
    public int ScalarProduct() {
        int res = 0;
        for (int i = 0; i < al.size(); i++) {
            res += al.get(i).value * al.get(i).value;
        }
        return Math.abs(res);
    }
    public int ScalarProduct(VectorCode v) {
        int res = 0;
        for (int i = 0; i < v.al.size(); i++) {
            res += v.al.get(i).value * v.al.get(i).value;
        }
        return ScalarProduct() + Math.abs(res);
    }

    public VectorCode sum(VectorCode v) {
        List<Elem> al2 = new ArrayList<>();
        int max = 0;
        if (this.len > v.len) {
            max = this.len;
        } else {
            max = v.len;
        }
        for (int i = 0; i < max; i++) {
            if (v.al.get(i).index == al.get(i).index) {
                al2.add(new Elem(i, v.al.get(i).value + al.get(i).value));
            } else if (v.al.get(i).value > al.get(i).value) {
                al2.add(new Elem(i, v.al.get(i).value));
            } else if (v.al.get(i).value < al.get(i).value) {
                al2.add(new Elem(i, al.get(i).value));
            }
        }
        return new VectorCode(al2);
    }









    public static void main(String[] args) {
        int [] arr = {1, 0, 2};
        VectorCode al = new VectorCode(arr);
        System.out.println(al);
    }
}