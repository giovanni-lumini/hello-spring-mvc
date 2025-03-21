package org.lessons.java.hello_spring_mvc.hello_spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/about-us")
    public String aboutUs() {
        return "aboutUs";
    }

    @GetMapping("/my-profile")
    public String myProfile(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("email", "giovanni@gmail.com");
        return "myProfile";
    }
}
