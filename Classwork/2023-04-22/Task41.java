import sun.net.ftp.FtpClient;

import javax.lang.model.util.Elements;
import javax.swing.text.Document;
import javax.swing.text.Element;

public class Task41 {
    private FtpClient Jsoup;
    Document doc = Jsoup.connect("http://rabotalux.com.ua/vacancy/4f4f800c8bc1597dc6fc7aff").get();
    Elements links = doc.select("link");
    Elements scripts = doc.select("script");
        for (
    Element element : links) {
        System.out.println(element.absUrl("href"));
    }
        for (Element element : scripts) {
        System.out.println(element.absUrl("src"));
    }
}
