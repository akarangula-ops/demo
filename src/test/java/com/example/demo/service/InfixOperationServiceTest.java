package com.example.demo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class InfixOperationServiceTest {

    @InjectMocks
    private InfixOperationService infixOperationService;

    @Test
    public void evaluatePostFixNotationTest() {
        Integer actualValue = infixOperationService.evaluatePostFixNotation("100 200 300 + -");
        assertEquals(new BigDecimal(400), new BigDecimal(actualValue));
    }
}
