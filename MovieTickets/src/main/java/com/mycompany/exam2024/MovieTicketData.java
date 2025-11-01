/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exam2024;

/**
 *
 * @author aphiw
 */
public class MovieTicketData {
    
    private String movieName;
    private int numberOfTickets;
    private double ticketPrice;
    
    //constructor 
    public MovieTicketData (String movieName, int numberOfTickets, double ticketPrice) {
        this.movieName = movieName;
        this.numberOfTickets = numberOfTickets;
        this.ticketPrice = ticketPrice;
    }
    
    public String getMovieName() {
        return movieName;
    }
    
    public int getNumOfTickets () {
        return numberOfTickets;
    }
    
    public double getTicketPrice() {
        return ticketPrice;
    }
}
