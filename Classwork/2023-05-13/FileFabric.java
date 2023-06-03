import java.io.*;
import java.net.URL;

public class FileFabric {
    public static void copyFileFromURL(String urlPath, String fileName) throws IOException {
        URL url = new URL(urlPath);

        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(fileName));
        DataInputStream dataInputStream = new DataInputStream(url.openStream());

        int i = dataInputStream.read();
        while (i != -1) {
            dataOutputStream.write(i);
            i = dataInputStream.read();
        }

        dataInputStream.close();
        dataOutputStream.close();
    }

    public static File getFile(String url) {
        String[] splittedS = url.split("/");
        String name = "files\\" + splittedS[splittedS.length - 1];
        try {
            copyFileFromURL(url, name);
        } catch (IOException e) {
            return null;
        }

        return new File(name);
    }
}
