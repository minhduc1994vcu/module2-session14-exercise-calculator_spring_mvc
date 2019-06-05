package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class CalculatorController {
    final String add = "add(+)";
    final String sub = "sub(-)";
    final String mul = "mul(x)";
    final String div = "div(/)";

    @GetMapping
   public String index() {
        return "index";
    }
    @PostMapping
    public String calculate(Model model, @RequestParam("operator") String operator, @RequestParam("first_operand") int first_operand,
                            @RequestParam("second_operand") int second_operand) {
        if (operator.equals(add)) {
            model.addAttribute("expression", "addition");
            model.addAttribute("result", first_operand + second_operand);
            model.addAttribute("operand1", first_operand);
            model.addAttribute("operand2", second_operand);
        }
        if (operator.equals(sub)) {
            model.addAttribute("expression", "subtraction");
            model.addAttribute("result", first_operand - second_operand);
            model.addAttribute("operand1", first_operand);
            model.addAttribute("operand2", second_operand);
        }
        if (operator.equals(mul)) {
            model.addAttribute("expression", "multiplication");
            model.addAttribute("result", first_operand * second_operand);
            model.addAttribute("operand1", first_operand);
            model.addAttribute("operand2", second_operand);
        }
        if (operator.equals(div)) {
            model.addAttribute("expression", "division");
            model.addAttribute("result", first_operand * second_operand);
            model.addAttribute("operand1", first_operand);
            model.addAttribute("operand2", second_operand);
        }

        return "index";
    }



}
