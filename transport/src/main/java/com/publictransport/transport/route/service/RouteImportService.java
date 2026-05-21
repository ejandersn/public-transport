package com.publictransport.transport.route.service;

import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.stereotype.Service;

import com.opencsv.CSVReader;
import com.publictransport.transport.route.domain.Route;
import com.publictransport.transport.route.repository.RouteRepository;

@Service
public class RouteImportService {

    private final RouteRepository repository;

    public RouteImportService(RouteRepository repository) {
        this.repository = repository;
    }

    public void importRoutes(InputStream inputStream) {

        try (CSVReader reader = new CSVReader(new InputStreamReader(inputStream))) {

            String[] line;

            reader.readNext(); // skip header

            while ((line = reader.readNext()) != null) {

                Route route = new Route();

                route.setRouteID(line[0]);
                route.setAgencyID(line[1]);
                route.setRouteShortName(line[2]);
                route.setRouteLongName(line[3]);
                route.setRouteDescription(line[4]);

                if (!line[5].isEmpty()) {
                    route.setRouteType(Integer.parseInt(line[5]));
                }

                route.setRouteUrl(line[6]);
                route.setRouteColor(line[7]);
                route.setRouteTextColor(line[8]);

                if (!line[9].isEmpty()) {
                    route.setRouteSortOrder(Integer.parseInt(line[9]));
                }

                repository.save(route);
            }

        } catch (Exception e) {
            throw new RuntimeException("Failed to import routes file", e);
        }
    }
}