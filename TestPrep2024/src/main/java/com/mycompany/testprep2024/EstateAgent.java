/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testprep2024;

/**
 *
 * @author lab_services_student
 */

//To make a class abstract add the abstract keyword to you class definition
//as below
//To implement an interface in a class use the keyword implements
public abstract class EstateAgent implements iEstateAgent{
    
    //To apply information hiding make class variables private
    //as below
    private String name;
    private double propertyPrice;
    
    //To create a constructor use public followed by the class name
    //see below
    //this construictor accepts parameter string name and double price
    public EstateAgent(String name, double propertyPrice){
        // when setting the class variables use the this keyword
        this.name = name;
        this.propertyPrice = propertyPrice;
    }
    
    //getters allow you to access private class variable outside of the class
    //if the variable you was to access is a string then the return type
    //of your getter method should be string too.
    //if the variable is a double the return type of your getter should be double
    //see below
    @Override
    public String getAgentName(){
        return this.name;
    }
    
    @Override
    public double getPropertyPrice(){
        return this.propertyPrice;
    }
    
    @Override
    public double getAgentCommission(){
        double commission = propertyPrice * 0.2;
        return commission;
    }
  
   
}
