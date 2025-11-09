/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testprep2024;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class TestPrep2024 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the current estate agent's name :");
        String name = sc.next();
        
        System.out.println("Enter the property price:");
        double propertyPrice = 0.0;
        try {
            propertyPrice = sc.nextDouble();
        }
        catch (NumberFormatException e){
            System.out.println("Enter the property price: (A NUMBER)");
            propertyPrice = sc.nextDouble();
        }
        
        
        EstateAgentSales saleData = new EstateAgentSales(name, propertyPrice);
        
        saleData.PrintPropertyReport();
        
    }
}
