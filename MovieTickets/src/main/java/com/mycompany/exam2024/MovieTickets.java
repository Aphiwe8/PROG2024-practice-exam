/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exam2024;

/**
 *
 * @author aphiw
 */
public class MovieTickets implements IMovieTickets{

    @Override
    public double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice) {
        double totalBeforeVat = numberOfTickets * ticketPrice;
        double totalVat = totalBeforeVat * 0.14;
        double totalTicketPrice = totalBeforeVat + totalVat;
        
        return totalTicketPrice;
    }
    
    @Override
    public boolean ValidateData(MovieTicketData movieTicketData) {
        
        String movieName = movieTicketData.getMovieName();
        int numOfTicket = movieTicketData.getNumOfTickets();
        double ticketPrice = movieTicketData.getTicketPrice();
        
        if ( movieName.isEmpty() ) {
            return false;
        }
        
        if ( numOfTicket <= 0 ) {
            return false;
        }
        
        if ( ticketPrice <= 0 ) {
            return false;
        }
        
        return true;
        
    }
    
    public String getReport(MovieTicketData movieTicketData) {
        String report = "MOVIE TICKET REPORT \n" +
                "*************************** \n" +
                "MOVIE NAME : " + movieTicketData.getMovieName() + "\n" +
                "MOVIE TICKET PRICE : " + movieTicketData.getTicketPrice() + "\n" +
                "NUMBER OF TICKETS : " + movieTicketData.getNumOfTickets() + "\n" +
                "TOTAL TICKET PRICE : " + CalculateTotalTicketPrice(movieTicketData.getNumOfTickets(), movieTicketData.getTicketPrice()) + "\n" +
                "***************************";
        
        return report;
    }

}
