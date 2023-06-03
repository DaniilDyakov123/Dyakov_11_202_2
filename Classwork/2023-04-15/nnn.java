public class nnn {
    public static void main(String[] args) {
        byte x1 = 0;
        byte x2 = 1;
        byte x3 = 3;
        byte x4 = 1;
        byte ans = 0;
        ans = (byte) (ans | x1);
        System.out.println(ans);
        ans = (byte) (ans << 2);
        System.out.println(ans);
        ans = (byte) (ans | x2);
        System.out.println(ans);
        ans = (byte) (ans << 2);
        System.out.println(ans);
        ans = (byte) (ans | x3);
        System.out.println(ans);
        ans = (byte) (ans << 2);
        System.out.println(ans);
        ans = (byte) (ans | x4);
        System.out.println(ans);
    }
}
//00011101 = 16 + 8 + 4 + 1 = 29