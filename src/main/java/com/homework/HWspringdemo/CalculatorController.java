package com.homework.HWspringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping(path = "/calculator")
    public String greetings() {
        return calculatorService.greetings();
    }
    @GetMapping(path = "/plus")
    public int plus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calculatorService.plus(num1, num2);
    }

    @GetMapping(path = "/minus" )
    public int minus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public int multiply(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public int divide(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calculatorService.divide(num1, num2);
    }
}
