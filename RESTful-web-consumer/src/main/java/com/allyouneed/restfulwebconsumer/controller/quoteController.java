package com.allyouneed.restfulwebconsumer.controller;

import com.allyouneed.restfulwebconsumer.domain.Quote;
import com.allyouneed.restfulwebconsumer.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class quoteController {
    private final QuoteService quoteService;

    @Autowired
    public quoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @GetMapping("/quote")
    public Quote getQuote() {
        return quoteService.getQuote();
    }
}
