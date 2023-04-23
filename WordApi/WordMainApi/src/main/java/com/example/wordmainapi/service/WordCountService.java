package com.example.wordmainapi.service;

import com.example.wordmainapi.client.WordCountFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordCountService {
    private final Logger logger = LoggerFactory.getLogger(WordCountService.class);
    private final WordCountFeignClient wordCountFeignClient;

    @Autowired
    public WordCountService(WordCountFeignClient wordCountFeignClient) {
        this.wordCountFeignClient = wordCountFeignClient;
        logger.info("-- Custom log: Word Count Service has been evoked.");
    }

    public Integer getWordCount(String word) {
        logger.info("-- Custom log: {}", word);
        return wordCountFeignClient.getWordLength(word);
    }
}
