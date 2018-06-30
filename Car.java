package com.heckercode.utilities;

public class Car {

    private int cap;
    private int location;
    private int revenue;
    public Car(){
        passengerlocation=new int[5];
        cap=5;
    }

    public int getCarTime() {
        return carTime;
    }

    public void setCarTime(int carTime) {
        this.carTime = carTime;
    }

    private int carTime;

    public int getDest() {
        return dest;
    }

    public void setDest(int dest) {
        this.dest = dest;
    }

    private int dest;

    public int getCap() {
        return cap;
    }

    public int getLocation() {
        return location;
    }

    public int[] getPassengerlocation() {
        return passengerlocation;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public void setPassengerlocation(int[] passengerlocation) {
        this.passengerlocation = passengerlocation;
    }

    public int getRevenue() {

        return revenue;
    }
    public void PassengerLocationReset(){
        for(int i=0;i<5;i++){
            passengerlocation[i]=0;
        }

    }
    private int[] passengerlocation;

}
