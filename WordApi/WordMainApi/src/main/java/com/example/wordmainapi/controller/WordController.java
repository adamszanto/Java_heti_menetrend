package com.example.wordmainapi.controller;

import com.example.wordmainapi.service.WordCountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.observation.ObservationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class WordController {
    private final Logger logger = LoggerFactory.getLogger(WordController.class);
    private final WordCountService wordCountService;

    @Autowired
    public WordController(WordCountService wordCountService) {
        this.wordCountService = wordCountService;
    }

//    @PostMapping("/word")
//    public ResponseEntity<Map<String, Integer>> getWordCount(@RequestBody Map<String, String> requestBody) {
//        if(!requestBody.containsKey("word") || requestBody.get("word") == null) {
//            return ResponseEntity.badRequest().build();
//        }
//        String word = requestBody.get("word");
//        Integer count = wordCountService.getWordCount(word);
//
//        Map<String, Integer> response = new HashMap<>();
//        response.put("word", count);
//        response.put("word", word);
//        logger.info("-- Custom log: {}", HttpStatus.ACCEPTED);
//        return ResponseEntity.ok(response);
//    }

    @PostMapping("/word")
    public ResponseEntity<Map<String, Integer>> getWordCount(@RequestBody Map<String, String> requestBody) {
        String word = requestBody.get("word");
        Integer count = wordCountService.getWordCount(word);

        Map<String, Integer> response = new HashMap<>();
        response.put(word, count);
        logger.info("Received request for word count. Word: {}. Count: {}. Status: {}", word, count, HttpStatus.ACCEPTED);
        return ResponseEntity.ok(response);
    }
}
