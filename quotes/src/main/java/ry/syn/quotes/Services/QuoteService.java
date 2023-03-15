package ry.syn.quotes.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ry.syn.quotes.models.Quoet;
import ry.syn.quotes.repositories.QuoteRepository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class QuoteService {
    @Autowired
    BashParser parser;
    @Autowired
    QuoteRepository repository;

    public List<Quoet> getIndex() {
        List<Quoet> ret = new ArrayList<>();

        try {
            Map<Integer, String> map = map = parser.getIndex();

            for (var entry : map.entrySet()) {
                var rowQuote = new Quoet();
                rowQuote.setId(entry.getKey());
                rowQuote.setId(Integer.valueOf(entry.getValue()));
                var existed = repository.findById(rowQuote.getId());
                if (existed.isEmpty())
                    ret.add(repository.save(rowQuote));
                else
                    ret.add(existed.get());

            }
            }catch(IOException e){
                throw new RuntimeException(e);
            }
            return ret;
        }
    }


