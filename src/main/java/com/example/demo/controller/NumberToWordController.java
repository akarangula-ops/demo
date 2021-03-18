package com.example.demo.controller;

import com.example.demo.service.NumberToWordConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberToWordController {

    @Autowired
    private NumberToWordConversionService numberToWordConversionService;

    @GetMapping(value = "/getNumbersInWords/{number}")
    public String getEnglishEquivalent(@PathVariable Integer number) {
        return numberToWordConversionService.convertToWord(number);
    }
}
