package com.publictransport.transport.route.mapper;

import com.publictransport.transport.route.domain.Route;
import com.publictransport.transport.route.dto.RouteDTO;

public class RouteMapper {

    // DOMAIN → DTO
    public static RouteDTO toDTO(Route route) {
        RouteDTO dto = new RouteDTO();

        dto.setRouteId(route.getRouteId());
        dto.setAgencyId(route.getAgencyId());
        dto.setRouteShortName(route.getRouteShortName());
        dto.setRouteLongName(route.getRouteLongName());
        dto.setRouteDescription(route.getRouteDescription());
        dto.setRouteType(route.getRouteType());
        dto.setRouteUrl(route.getRouteUrl());
        dto.setRouteColor(route.getRouteColor());
        dto.setRouteTextColor(route.getRouteTextColor());
        dto.setRouteSortOrder(route.getRouteSortOrder());

        return dto;
    }

    // DTO → DOMAIN
    public static Route toEntity(RouteDTO dto) {
        Route route = new Route();

        route.setRouteID(dto.getRouteId());
        route.setAgencyID(dto.getAgencyId());
        route.setRouteShortName(dto.getRouteShortName());
        route.setRouteLongName(dto.getRouteLongName());
        route.setRouteDescription(dto.getRouteDescription());
        route.setRouteType(dto.getRouteType());
        route.setRouteUrl(dto.getRouteUrl());
        route.setRouteColor(dto.getRouteColor());
        route.setRouteTextColor(dto.getRouteTextColor());
        route.setRouteSortOrder(dto.getRouteSortOrder());

        return route;
    }
}