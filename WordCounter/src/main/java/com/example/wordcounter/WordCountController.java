package com.example.wordcounter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordCountController {
    @GetMapping("/length/{word}")
    public int getWordLength(@PathVariable String word) {
        return word.length();
    }
}
