package com.challenge.random_numbers;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(RandomNumbersController.class)
public class RandomNumbersControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGenerateRandomNumbers() throws Exception {
        mockMvc.perform(
			MockMvcRequestBuilders
			.get("/generateRandomNumbers")
			.param("count", "5")
			.param("min", "1")
			.param("max", "10"))
			.andExpect(MockMvcResultMatchers.status().isOk());
    }
}
