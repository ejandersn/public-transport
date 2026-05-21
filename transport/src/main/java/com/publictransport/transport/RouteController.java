package com.publictransport.transport;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.publictransport.transport.route.dto.RouteDTO;
import com.publictransport.transport.route.mapper.RouteMapper;
import com.publictransport.transport.route.repository.RouteRepository;

import java.util.List;

@RestController
@RequestMapping("/routes")
public class RouteController {

    private final RouteRepository repo;

    public RouteController(RouteRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<RouteDTO> getRoutes() {
        return repo.findAll()
                .stream()
                .map(RouteMapper::toDTO)
                .toList();
    }
}