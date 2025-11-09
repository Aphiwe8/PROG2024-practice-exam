/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.movieticketso1;

/**
 *
 * @author lab_services_student
 */
public class MovieTickets implements IMovieTickets{
    
//    int[] movieTicketSales;
//    String[] movies;
//    int[] totalSales;
//    
//    public MovieTickets(int [] movieTicketSales,String[] movies, int[] totalSales) {
//        this.movieTicketSales = movieTicketSales;
//        this.movies = movies;
//        this.totalSales = totalSales;
//    }
    
    @Override
    public int TotalMovieSales(int[] movieTicketSales) {
        int totalSaleAll = 0;
        for (int i = 0; i < movieTicketSales.length; i++) {
            totalSaleAll = totalSaleAll + movieTicketSales[i]; 
        }
        return totalSaleAll;
    }
    
    @Override
    public String TopMovie(String[] movies, int[] totalSales) {
        int highIdex =0;
        int highTotal =0;
        
        for ( int i = 0; i < totalSales.length ; i ++ ) {
            if ( highTotal < totalSales[i] ) {
                highIdex = i;
                highTotal = totalSales[i];
            }
        }
        
        String topMovie = movies[highIdex];
        
        return topMovie;
    }
    
}
