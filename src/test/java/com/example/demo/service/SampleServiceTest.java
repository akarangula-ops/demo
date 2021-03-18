package com.example.demo.service;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.Assert.assertTrue;

@SpringBootTest
public class SampleServiceTest {

    @InjectMocks
    private SampleService sampleService;

    @Test
    public void getListOfEvenNumbersTest() {
        List<Integer> evenNumbers = sampleService.getListOfEvenNumbers();
        assertTrue(!evenNumbers.isEmpty());
    }

}
