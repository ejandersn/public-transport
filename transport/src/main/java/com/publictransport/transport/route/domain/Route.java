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

    //no get or set for obj id

    public String getRouteId(){
        return routeId;
    }

    public String getAgencyId(){
        return agencyId;
    }

    public String getRouteShortName(){
        return routeShortName;
    }

    public String getRouteLongName(){
        return routeLongName;
    }

    public String getRouteDescription(){
        return routeDescription;
    }

    public Integer getRouteType(){
        return routeType;
    }

    public String getRouteUrl(){
        return routeUrl;
    }

    public String getRouteTextColor(){
        return routeTextColor;
    }

    public String getRouteColor(){
        return routeColor;
    }

    public Integer getRouteSortOrder(){
        return routeSortOrder;
    }

    public void setRouteID(String routeID){
        this.routeId = routeID;
    }

    public void setAgencyID(String agencyID){
        this.agencyId = agencyID;
    }

    public void setRouteShortName(String routeShortName){
        this.routeShortName = routeShortName;
    }

    public void setRouteLongName(String routeLongName){
        this.routeLongName = routeLongName;
    }

    public void setRouteDescription(String routeDescription){
        this.routeDescription = routeDescription;
    }

    public void setRouteType(Integer routeType){
        this.routeType = routeType;
    }

    public void setRouteUrl(String routeUrl){
        this.routeUrl = routeUrl;
    }

    public void setRouteColor(String routeColor){
        this.routeColor = routeColor;
    }

    public void setRouteTextColor(String routeTextColor){
        this.routeTextColor = routeTextColor;
    }

    public void setRouteSortOrder(Integer routeSortOrder){
        this.routeSortOrder = routeSortOrder;
    }
}
