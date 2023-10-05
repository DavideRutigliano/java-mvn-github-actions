package com.challenge.random_numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RandomNumbersController {
    @GetMapping("/generateRandomNumbers")
    public List<Integer> generateRandomNumbers(
            @RequestParam int count,
            @RequestParam int min,
            @RequestParam int max
    ) {
        List<Integer> randomNumbers = new ArrayList<>();

        if (count <= 0 || min > max) {
            return randomNumbers;
        }

        Random random = new Random();

        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt((max - min) + 1) + min;
            randomNumbers.add(randomNumber);
        }
        return randomNumbers;
    }
}