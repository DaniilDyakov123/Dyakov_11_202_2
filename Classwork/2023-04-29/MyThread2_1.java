public class MyThread2_1 extends Thread {
    private int [] arr;
    public void setArr(int [] arr){
        this.arr = arr;
    }
    private int start;
    public void setStart(int start) {
        this.start = start;
    }

    private int finish;

    public void setFinish(int finish) {
        this.finish = finish;
    }

    private int count;

    public int getCount() {
        return count;
    }

    public void run() {
        for (int i = start; i < finish; i++) {
            count += arr[i];
        }

    }

    public static void main(String[] args) {
        int [] arr = {2, 4, 1, 1, 1, 1, 1, 1, 1, 3};
        int start = 0;
        int finish = arr.length / 2;
        MyThread2_1 t1 = new MyThread2_1();
        t1.setStart(start);
        t1.setFinish(finish);
        t1.setArr(arr);
        MyThread2_1 t2 = new MyThread2_1();
        t2.setStart(finish);
        t2.setFinish(arr.length);
        t2.setArr(arr);

        try{
            t1.join();
            t2.join();
            t1.start();
            t2.start();

        }catch (InterruptedException e){
            System.out.println("error");
        }
        System.out.println(t1.isAlive());
        System.out.println(t1.getCount());
        System.out.println(t2.isAlive());
        System.out.println(t2.getCount());
    }
}
