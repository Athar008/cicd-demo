package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class HealthController {

    // Change this value when deploying green (v2)
    private static final String VERSION = "v1-blue";

    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of(
            "status", "running",
            "version", VERSION,
            "message", "CI/CD Demo App"
        );
    }

    @GetMapping("/api/hello")
    public Map<String, String> hello() {
        return Map.of("message", "Hello from " + VERSION);
    }
}