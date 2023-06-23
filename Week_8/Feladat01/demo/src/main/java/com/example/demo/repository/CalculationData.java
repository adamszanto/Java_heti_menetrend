package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CalculationData {
    private List<Integer> numbers = new ArrayList<>();

    public void clearNumbers() {
        numbers.clear();
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public Integer getSum() {
        Integer sum = 0;

        for(int number : numbers) {
            sum += number;
        }

        return sum;
    }
}
