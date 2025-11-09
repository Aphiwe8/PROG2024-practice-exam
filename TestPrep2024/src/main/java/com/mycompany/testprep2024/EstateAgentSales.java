/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testprep2024;

/**
 *
 * @author lab_services_student
 */

//To create a subclass of another use the extends keyword
//see below
public class EstateAgentSales extends EstateAgent{
    
    //When creating a child class constructor
    //the first line inside the constructor
    //must be super (this calls the parent class constructor)
    //if the parent class constructor take parameters you must send 
    //those parameters inside your super call.
    //If the parent constructor take no parameters you send nothing
    //see below
    public EstateAgentSales(String name , double propertyPrice){
        super(name, propertyPrice);
    }
    
    public void PrintPropertyReport(){
        System.out.println("ESTATE AGENT REPORT");
        System.out.println("*********************");
        System.out.println("Estate Agent Name: " + getAgentName());
        System.out.println("Property Price: " + getPropertyPrice());
        System.out.println("Agent Commission" + getAgentCommission());
    }
    
}
