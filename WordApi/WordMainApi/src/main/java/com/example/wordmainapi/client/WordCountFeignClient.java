package com.example.wordmainapi.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "wordapi", url = "http://localhost:8081")
public interface WordCountFeignClient {
    @GetMapping("/length/{word}")
    Integer getWordLength(@PathVariable("word") String word);
}
