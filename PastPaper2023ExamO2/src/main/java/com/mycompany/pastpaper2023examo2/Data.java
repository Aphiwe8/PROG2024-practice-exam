/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pastpaper2023examo2;

/**
 *
 * @author lab_services_student
 */
public class Data {
    private String location;
    private String agentName;
    private String propertyPrice;
    private String comissionPercentage;
    
    public Data (String location, String agentName, String propertyPrice, String comissionPercentage){
        this.location = location;
        this.agentName = agentName;
        this.propertyPrice = propertyPrice;
        this.comissionPercentage = comissionPercentage;
    }
    
    public String getLocation () {
        return location;
    }
    
    public String getAgentName () {
        return agentName;
    }
    
    public String getPropertyPrice () {
        return propertyPrice;
    }
    
    public String getComissionPercentage () {
        return comissionPercentage;
    }
    
}
