package com.example.demo.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@SpringBootTest
public class NumberToWordConversionServiceTest {

    @Autowired
    private NumberToWordConversionService numberToWordConversionService;

    @Test
    public void convertToWordTest() {
        String toWord = numberToWordConversionService.convertToWord(536);
        String expectedWord = "Five Hundred And Thirty Six";
        assertTrue(!toWord.isEmpty());
        assertEquals(expectedWord, toWord);
    }
}
