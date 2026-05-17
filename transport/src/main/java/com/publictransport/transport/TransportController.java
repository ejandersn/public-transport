package com.publictransport.transport;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransportController {

    @GetMapping("/routes")
    public List<String> getRoutes() {
        return List.of(
                "Route 24",
                "Route 52",
                "Route 101"
        );
    }
}