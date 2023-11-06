package it.saimao.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/sample")
public class SampleController {

    @GetMapping
    public String helloWorld(Model model) {
        model.addAttribute("theDate", new Date());
        return "hello-world";
    }

}
