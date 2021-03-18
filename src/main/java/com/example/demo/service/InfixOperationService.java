package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.Stack;

@Service
public class InfixOperationService {

    public Integer evaluatePostFixNotation(String exp) {
        Stack<Integer> postFixStack = new Stack<>();
        String[] expArray = exp.split(" ");
        for (int i=0;i<expArray.length;i++) {
            if (checkIfNumeric(expArray[i])) {
                postFixStack.push(Integer.parseInt(expArray[i]));
            } else {
                 int value1 = postFixStack.pop();
                 int value2 = postFixStack.pop();

                 switch (expArray[i])
                {
                    case "+" : postFixStack.push(value1+value2); break;
                    case "-" : postFixStack.push(value1-value2); break;
                    case "*" : postFixStack.push(value1*value2); break;
                    case "/" : postFixStack.push(value1/value2); break;
                }

            }
        }
        return postFixStack.pop();
    }

    public boolean checkIfNumeric(String s) {
        try {
            int a=Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
