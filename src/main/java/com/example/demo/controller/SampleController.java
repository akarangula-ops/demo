package com.example.demo.controller;

import com.example.demo.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/sample")
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @GetMapping(value = "/getEvenNumbers")
    public List<Integer> getAllTheEvenNumbers() {
        return sampleService.getListOfEvenNumbers();
    }
}
