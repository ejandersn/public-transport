package com.publictransport.transport.route.service;

import java.io.InputStream;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class RouteDataLoader {

    private final RouteImportService importService;

    public RouteDataLoader(RouteImportService importService) {
        this.importService = importService;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void load() throws Exception {

        InputStream inputStream = getClass()
        .getResourceAsStream("/metlink/routes.txt");

        importService.importRoutes(inputStream);
    }
}