package ry.syn.quotes.Services;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
@Component
public class BashParser {
    public Map<Integer, String> getIndex() throws IOException {
        Document doc = Jsoup.connect("http://ibash.org.ru/").get();
        System.out.println(doc.title());
        Elements sourceQoutes = doc.select(".quote");
        Map<Integer, String> quotes = new HashMap<>();
        for (Element quoteElement : sourceQoutes) {
            int id = Integer.parseInt(quoteElement.select("b").first().text().substring(1));
            String text = quoteElement.select(".quotbody").first().text();
            quotes.put(id, text);

        }
        return quotes;
    }
}
