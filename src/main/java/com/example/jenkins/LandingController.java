package com.example.jenkins;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LandingController {

    @Value("${app.message:default-if-not-set}")
    private String appMessage;

    @GetMapping("/")
    public String landing() {
        return "<h1>Welcome</h1><p>Property value: " + appMessage + "</p>";
    }
}
