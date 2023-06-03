import java.io.*;
import java.net.URL;

public class Task40 {
    public static void downloadFile(URL url, String fileName) throws IOException {
        try (InputStream in = url.openStream();
             BufferedInputStream bis = new BufferedInputStream(in);
             FileOutputStream fos = new FileOutputStream(fileName)) {

            byte[] data = new byte[1024];
            int count;
            while ((count = bis.read(data, 0, 1024)) != -1) {
                fos.write(data, 0, count);
            }
        }
    }


    public static void main(String[] args) throws Exception {
        URL source = new URL("https://freesoft.ru/storage/images/news/1/4/312/312_text.png");
        File dest = new File("/Users/dyakovdaniil/Documents/university/Dyakov_11_202_2/Dyakov_11_202_2/Classwork2/src/dest.png");
        downloadFile(source, String.valueOf(dest));
    }
}
