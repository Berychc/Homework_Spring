package com.homework.HWspringdemo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String hello() {
        return "<b> Главная страница! </b>";
    }

    public String greetings() {
        return "Добро пожаловать в калькулятор";
    }

    public int plus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return num1 + num2;
    }

    public int minus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return num1 - num2;
    }

    public int multiply(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return num1 * num2;
    }

    public int divide(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Деление на ноль не допускается");
        }
        return num1 / num2;
    }
}
