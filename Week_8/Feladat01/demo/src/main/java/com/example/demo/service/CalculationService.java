package com.example.demo.service;

import com.example.demo.repository.CalculationData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculationService {
    private CalculationData repository;

    public CalculationService(CalculationData repository) {
        this.repository = repository;
    }

    public double calculateAverage() {
        List<Integer> numbers = repository.getNumbers();
        int sum = 0;

        for(int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.size();

        return average;
    }
}
