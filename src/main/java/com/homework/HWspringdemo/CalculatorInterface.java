package com.homework.HWspringdemo;

import org.springframework.web.bind.annotation.RequestParam;

public interface CalculatorInterface {
    String hello();
    String greetings();
    int plus(int num1, int num2);
    int minus(int num1, int num2);
    int multiply(int num1, int num2);
    int divide(int num1, int num2);
}
