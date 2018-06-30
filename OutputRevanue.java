package com.heckercode.utilities;

public class OutputRevanue {
    public void writeOutput(Car car[]){
        int TotalRavnue=0;
        for(int i=0;i<car.length;i++) {
            TotalRavnue += car[i].getRevenue();
        }
        System.out.println("Total Ravenue : " + TotalRavnue);
    }
}
