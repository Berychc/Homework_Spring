package com.homework.HWspringdemo;

import org.springframework.web.bind.annotation.RequestParam;

public interface CalculatorService {
    String hello();
    String greetings();
    int plus(Integer num1, Integer num2);
    int minus(Integer num1, Integer num2);
    int multiply(Integer num1, Integer num2);
    int divide(Integer num1, Integer num2);

}
