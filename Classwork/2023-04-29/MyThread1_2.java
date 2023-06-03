import java.util.Scanner;

class MyThread1_2 extends Thread {
    protected int n;
    public void run() {
    for (int j = 1; j <= n; j++) {
        System.out.println(getName() + ": " + j);
        }
    }
    public static void main(String[] args) {
        MyThread1_2 t1 = new MyThread1_2();
        MyThread1_2 t2 = new MyThread1_2();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        t1.n = n;
        t2.n = n;

        t1.start();
        t2.start();
    }
}