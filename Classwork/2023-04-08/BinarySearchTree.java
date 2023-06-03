public class BinarySearchTree<T> extends Comparable<T>> {
    Node<T> root;

    public boolean contains(T x) {
        Node<T> currentNode = root;
        while (currentNode != null) {
            int cmp = currentNode.value.compareTo(x);
            if (cmp == 0) {
                return true;
            } else if (cmp > 0) {
                currentNode = currentNode.left;
            } else if (cmp < 0) {
                currentNode = currentNode.right;
            }
        }
        return false;
    }

    public void add(T x) {
        if (root == null) {
            root = new Node<T>();
            root.value = x;
        } else {
            Node<T> currentNode = root;
            boolean f = false;
            while (!f) {
                int cmp = currentNode.value.compareTo(x);
                if (cmp <= 0) {
                    if (currentNode.right == null) {
                        currentNode.right = new Node<T>();
                        currentNode.right.value = x;
                        f = true;
                    } else {
                        currentNode = currentNode.right;
                    }
                } else {
                    if (currentNode.left == null) {
                        currentNode.left = new Node<T>();
                        currentNode.left.value = x;
                        f = true;
                    } else {
                        currentNode = currentNode.left;
                    }
                }
            }
        }
    }
    public boolean remove(T x) {

    }
    public static void printTree(Node<?> r, int d) {
        if (r != null) {
            printTree(r.right, d + 1);
            for (int i = 1; i <= d; i++) {
                System.out.print("  ");
            }
            System.out.println(r.value);
            printTree(r.left, d + 1);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.add(5);
        bst.add(4);
        bst.add(3);
        bst.add(2);
        bst.add(1);
        printTree(bst.root, 5);

    }
}