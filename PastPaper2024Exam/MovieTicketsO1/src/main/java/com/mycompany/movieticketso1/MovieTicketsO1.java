/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.movieticketso1;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class MovieTicketsO1 {
    
    

    public static void main(String[] args) {
        
        //Q1.1
        
        String [] months = {"JAN", "FEB", "MAR"};
        String [] movies = {"Napolean", "Oppenhiemer"};
        
        int [][] ticketSales = {{3000,1500,1700},//napolean ticket sales
                                {3500,1200,1600}};//Oppenhiemer ticket sales
        
        System.out.println("MOVIE TICKET SALES - 2024");
        //Print months heading
        System.out.print("\t\t");
        for(int i = 0; i < months.length; i ++) {
            
            System.out.print(months[i] + "\t");
            
        }
        System.out.println("");
        
        System.out.println("--------------------------------------------");
        
        
        for ( int i = 0; i < ticketSales.length; i ++ ) {
            System.out.print(movies[i] + "\t");
            for (int j = 0 ; j < ticketSales[0].length; j ++) {
                
                System.out.print(ticketSales[i][j] + "\t");
                
            }
            System.out.println("");
        }
        
        //Calculating movie totals
        int [] totals = new int[movies.length];
       for ( int i = 0; i < ticketSales.length; i ++ ) {
           int total = 0;
           for ( int j =0; j < ticketSales[0].length; j ++ ) {
               
               total = total + ticketSales[i][j];
               
           }
           totals[i] = total;
       } 
       
       //Printing movie totals
       for (int i = 0; i < movies.length; i ++) {
          System.out.println("Total movie ticket sales for "+movies[i]+" : "+ totals[i]);
       }
       
       //calculating hightest total
       int indexHighest = 0;
       int totalHighest = 0;
       
       for(int i = 0; i < totals.length; i ++) {
           if ( totals[i] > totalHighest ) {
               indexHighest = i;
               totalHighest = totals[i];
           }
       }  
       
        System.out.println("Top performing movie :" + movies[indexHighest]);
        
//        PrintTotalsWithUserInput();
        
        //Q1.2
        
        MovieTickets tickets = new MovieTickets();
        int[] testMovieSales = {3000,1500,1700}; 
        int totalMovieSale = tickets.TotalMovieSales(testMovieSales);
        
        System.out.println("Total movies sale for napolean (3000,1500,1700) : " + totalMovieSale);
        
        String topMovie = tickets.TopMovie(movies, totals);
        System.out.println("The top performing movie was " + topMovie);
       
    }
    
    public static void PrintTotalsWithUserInput() {
        
        String [] months = {"JAN", "FEB", "MAR"};
        String [] movies = {"Napolean", "Oppenhiemer"};
        
        int [][] ticketSales = new int[movies.length][months.length];
        
        Scanner sc = new Scanner(System.in);
        
        //populate 2D array
        for (int i = 0; i < ticketSales.length; i ++) {
            for (int j = 0; j < ticketSales[0].length; j ++) {
                
                System.out.println("Enter " + months[j] + " tickets sales for " + movies[i]);
                int sales = sc.nextInt();
                
                ticketSales[i][j] = sales;
            }
        }
        
        System.out.println("MOVIE TICKET SALES - 2024");
        //Print months heading
        System.out.print("\t\t");
        for(int i = 0; i < months.length; i ++) {
            
            System.out.print(months[i] + "\t");
            
        }
        System.out.println("");
        
        System.out.println("--------------------------------------------");
        
        
        for ( int i = 0; i < ticketSales.length; i ++ ) {
            System.out.print(movies[i] + "\t");
            for (int j = 0 ; j < ticketSales[0].length; j ++) {
                
                System.out.print(ticketSales[i][j] + "\t");
                
            }
            System.out.println("");
        }
        
        //Calculating movie totals
        int [] totals = new int[movies.length];
       for ( int i = 0; i < ticketSales.length; i ++ ) {
           int total = 0;
           for ( int j =0; j < ticketSales[0].length; j ++ ) {
               
               total = total + ticketSales[i][j];
               
           }
           totals[i] = total;
       } 
       
       //Printing movie totals
       for (int i = 0; i < movies.length; i ++) {
          System.out.println("Total movie ticket sales for "+movies[i]+" : "+ totals[i]);
       }
       
       //calculating hightest total
       int indexHighest = 0;
       int totalHighest = 0;
       
       for(int i = 0; i < totals.length; i ++) {
           if ( totals[i] > totalHighest ) {
               indexHighest = i;
               totalHighest = totals[i];
           }
       }  
       
        System.out.println("Top performing movie :" + movies[indexHighest]);
        
    }
    
    
    
}
