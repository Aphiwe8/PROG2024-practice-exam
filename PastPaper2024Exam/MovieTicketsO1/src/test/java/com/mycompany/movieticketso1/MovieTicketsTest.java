/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.movieticketso1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class MovieTicketsTest {
    
    MovieTickets tickets;
    
    //If when creating your class object if you get a cannot find symbol error
    //COPY (don't cut/drag and drop) and paste your class into the same 
    //folder as your test class
    
    public MovieTicketsTest() {
        tickets = new MovieTickets();
    }

    @Test
    public void CalculateTotalSales_ReturnsExpectedTotalSales() {
        
//        MovieTickets tickets = new MovieTickets();
        int[] testMovieSales = {3000,1500,1700}; 
        int actualValue = tickets.TotalMovieSales(testMovieSales);
        int expectedValue = 6200;
        
        assertEquals(expectedValue, actualValue);
        
    }
    
    @Test
    public void TopMovieSales_ReturnsTopMovie () {
        String [] movies = {"Napolean", "Oppenhiemer"};
        int [] totals = {6200,6300};
        String actualValue = tickets.TopMovie(movies, totals);
        String expectedValue = "Oppenhiemer";
        
        assertEquals(expectedValue, actualValue);
    }
    
}
