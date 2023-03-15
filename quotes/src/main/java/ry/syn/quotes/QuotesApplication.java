package ry.syn.quotes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ry.syn.quotes.Services.BashParser;
import ry.syn.quotes.Services.QuoteService;

@SpringBootApplication
public class QuotesApplication implements CommandLineRunner {
    @Autowired
    QuoteService service;

    public static void main(String[] args) {

        SpringApplication.run(QuotesApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        var index = service.getIndex();
        System.out.println(index);

    }
}
