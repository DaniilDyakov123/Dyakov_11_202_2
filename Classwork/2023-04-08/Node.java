public class Node<T extends Comparable<T>> {
    T value;
    Node left, right;

    public boolean isLeaf() {
        if (left == null && right == null) {
            return true;
        }
        return false;
    }
}

