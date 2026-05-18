package com.publictransport.transport.route.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.stereotype.Service;

import com.publictransport.transport.route.domain.Route;
import com.publictransport.transport.route.repository.RouteRepository;

@Service
public class RouteImportService {
    
    private final RouteRepository repository;

    public RouteImportService(RouteRepository repository){
        this.repository = repository;
    }

    public void importRoutes(InputStream inputStream) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))){
            String line = reader.readLine();
        
            while ((line = reader.readLine()) != null){
                String[] parts = line.split(",", -1);

                Route route = new Route();
                
                //Setters

                repository.save(route); //unimplemented method
            }

        } catch (Exception e) {
            throw new RuntimeException("Failed to import routes file", e);
    }
    }
}
