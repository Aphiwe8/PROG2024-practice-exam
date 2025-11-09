/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.movietickets;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class MovieTicketsTest {
    //1 Define a object of the class you are testing as a class variable
    MovieTickets tickets;
    
    public MovieTicketsTest() {
        //2 In the constructor initialise the class variable
        tickets = new MovieTickets();
    }
    
    
    
    @org.junit.jupiter.api.Test
    //3 write required tests
    public void CalculateTotalTicketPrice_CalculatedSuccessfully() {
        //4 create the data you need to send to the
        //method you are testing
        int numOfTickets = 2;
        double ticketPrice = 50;
        
        //5 Calculate/Set the value you are expecting
        double expectedValue = 114;
        
        //6 Call the method you are testing
        double actualValue = tickets.CalculateTotalTicketPrice(numOfTickets, ticketPrice);
        
        //7 Check if your expected value is = actual value
        assertEquals(expectedValue, actualValue);
        
    }
    
    @org.junit.jupiter.api.Test
    public void ValidationTests_Pass () {
        MovieTicketData ticketData = new MovieTicketData("Test", 2, 50.0);
        
        boolean actualValue = tickets.ValidateData(ticketData);
        
        assertTrue(actualValue);
        
    }
    
    @org.junit.jupiter.api.Test
    public void ValidationTests_Fail () {
        MovieTicketData ticketData = new MovieTicketData("Test", -1, 50.0);
        
        boolean actualValue = tickets.ValidateData(ticketData);
        
        assertFalse(actualValue);
        
    }
    
}
