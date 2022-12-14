package com.allyouneed.restfulwebconsumer.service;

import com.allyouneed.restfulwebconsumer.domain.Quote;
import com.allyouneed.restfulwebconsumer.utils.Logger;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class QuoteService {
    private static final String url = "https://api.quotable.io/random";

    public Quote getQuote() {
        RestTemplateBuilder templateBuilder = new RestTemplateBuilder();
        RestTemplate restTemplate = templateBuilder.build();
        Quote quote = restTemplate.getForObject(
                "https://api.quotable.io/random",
                Quote.class
        );
        Logger.log.info(quote.toString());
        return quote;
    }
}