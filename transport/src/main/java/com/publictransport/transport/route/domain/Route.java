package com.publictransport.transport.route.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Using routes.txt to build domain object

@Entity
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String routeId;
    private String agencyId;    
    private String routeShortName;
    private String routeLongName;
    private String routeDescription;
    private Integer routeType;
    private String routeUrl;
    private String routeColor;
    private String routeTextColor; 
    private Integer routeSortOrder;

    public Route() {}
}
