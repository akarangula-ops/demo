package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SampleService {

    public List<Integer> getListOfEvenNumbers() {
        List<Integer> list = new ArrayList<>();
        for (int i=0; i< 100; i++) {
            if (i%2 == 0) list.add(i);
        }

        return list;
    }
}
