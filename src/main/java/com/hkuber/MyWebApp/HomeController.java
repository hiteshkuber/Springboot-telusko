package com.hkuber.MyWebApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        return "Hello from Hitesh!!";
    }

    @RequestMapping("/about")
    public String about() {
        return "Im a software engineer with around 4 years of experience";
    }
}
