import java.io.*;

public class Task38 {
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) throws IOException {
        File source = new File("/Users/dyakovdaniil/Documents/university/Dyakov_11_202_2/Dyakov_11_202_2/Classwork2/src/src.png");
        File dest = new File("/Users/dyakovdaniil/Documents/university/Dyakov_11_202_2/Dyakov_11_202_2/Classwork2/src/dest.png");
        copyFileUsingStream(source, dest);
    }
}
