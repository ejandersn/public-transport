package com.publictransport.transport.stop.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Stop {

    @Id
    @GeneratedValue
    private Long id;
    private String stopId;
    private String stopCode;
    private String stopName;
    private Double stopLat;
    private Double stopLon;
    private Integer zoneId;
    private String stopUrl;
    private String locationType;
    private String parentStation; 
    private String stopTimezone;

    public Stop(){}

    public String getStopId(){
        return stopId;
    }

    public String getStopCode(){
        return stopCode;
    }

    public String getStopName(){
        return stopName;
    }

    public Double getStopLat(){
        return stopLat;
    }

    public Double getStopLon(){
        return stopLon;
    }

    public Integer getZoneId(){
        return zoneId;
    }

    public String getStopUrl(){
        return stopUrl;
    }

    public String getLocationType(){
        return locationType;
    }

    public String getParentStation(){
        return parentStation;
    }

    public String getStopTimezone(){
        return stopTimezone;
    }

    public void setStopId(String stopId){
        this.stopId = stopId;
    }    

    public void setStopCode(String stopCode){
        this.stopCode = stopCode;
    }

    public void setStopName(String stopName){
        this.stopName = stopName;
    }

    public void setStopLat(Double stopLat){
        this.stopLat = stopLat;
    }

    public void setStopLon(Double stopLon){
        this.stopLon = stopLon;
    }

    public void setZoneId(Integer zoneId){
        this.zoneId = zoneId;
    }

    public void setStopUrl(String stopUrl){
        this.stopUrl = stopUrl;
    }

    public void setLocationType(String locationType){
        this.locationType = locationType;
    }

    public void setParentStation(String parentStation){
        this.parentStation = parentStation;
    }

    public void setStopTimezone(String stopTimezone){
        this.stopTimezone = stopTimezone;
    }

}
