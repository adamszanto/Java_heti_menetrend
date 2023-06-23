package com.example.demo.controller;

import com.example.demo.repository.CalculationData;
import com.example.demo.service.CalculationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalculationController {

    private CalculationData repository;
    private CalculationService service;

    public CalculationController(CalculationData repository, CalculationService service) {
        this.repository = repository;
        this.service = service;
    }

    @GetMapping("/")
    public String initForm() {
        return "form";
    }

    @PostMapping("/calculate")
    @ResponseBody
    public String calculateAverage(@RequestParam("number1") int number1, @RequestParam("number2") int number2) {
        repository.clearNumbers();
        repository.addNumber(number1);
        repository.addNumber(number2);

        double average = service.calculateAverage();

        return Double.toString(average);
    }
}
