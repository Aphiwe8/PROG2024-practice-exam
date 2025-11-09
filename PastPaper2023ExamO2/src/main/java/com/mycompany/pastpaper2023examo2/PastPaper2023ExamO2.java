/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pastpaper2023examo2;

/**
 *
 * @author lab_services_student
 */
public class PastPaper2023ExamO2 implements IEstateAgent{

    @Override
    public double CalculateCommission(String propertyPrice, String agentCommission) {
        
        double agentComissionDouble = Double.parseDouble(agentCommission);
        double percentage = agentComissionDouble / 100.0;
        
        double propertyPriceDouble = Double.parseDouble(propertyPrice);
        double commission = propertyPriceDouble * percentage;
        
        return commission;
    }
    
    public boolean ValidateData(Data dataToValidate) {
        
        if ( dataToValidate.getAgentName().isEmpty() ) {
            return false;
        }
        
        if (dataToValidate.getLocation().isEmpty()) {
            return false;
        }
        
        double agentComissionDouble = Double.parseDouble(dataToValidate.getComissionPercentage());
        if ( agentComissionDouble <= 0 ) {
            return false;
        }
        
        double propertyPriceDouble = Double.parseDouble(dataToValidate.getPropertyPrice());
        if ( propertyPriceDouble <= 0 ) {
            return false;
        }
        
        return true;
    }

    
    public String getReport(Data data){
        String report = "ESTATE AGENT REPORT \n" +
                "****************************** \n" +
                "AGENT LOCATION : " + data.getLocation() + "\n" +
                "AGENT NAME : " + data.getAgentName() + "\n" +
                "PROPERTY PRICE : " + data.getPropertyPrice() + "\n" +
                "COMMISSION PERCENTAGE :" + data.getComissionPercentage() + "%\n" +
                "CALCULATED COMISSION : " + CalculateCommission(data.getPropertyPrice(), data.getComissionPercentage());
        
        return report;
    }
}
