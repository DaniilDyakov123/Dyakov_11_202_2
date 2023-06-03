class MyThread1_1 extends Thread {
    public void run() {
    for (int j = 1; j < 11; j++) {
        System.out.println(getName() + ": " + j);
        }
    }
    public static void main(String[] args) {
        (new MyThread1_1()).start();
        (new MyThread1_1()).start();
    }
}