import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //네이버 뉴스 it 일반
        final String crawlingEnterUrl = "https://news.naver.com/main/list.naver?mode=LS2D&mid=shm&sid1=105&sid2=230";
        Connection conn = Jsoup.connect(crawlingEnterUrl);
        try {
            Document document = conn.get();
            Elements itUrlElements = document.getElementsByClass("nclicks(itn.2ndcont)");

            for (Element e: itUrlElements.select("a")) {
                System.out.println(e.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}