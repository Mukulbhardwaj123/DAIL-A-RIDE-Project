package com.heckercode.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadInput {
    private int n;
    private int N;

    public void setN(int n) {
        this.n = n;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setR(int r) {
        R = r;
    }

    public void setLocation(int[][] location) {
        this.location = location;
    }

    public void setCar(Car[] car) {
        this.car = car;
    }

    public void setReq(Request[] req) {
        this.req = req;
    }

    private  int c;
    private  int R;
    private int[][] location;

    public int getN() {
        return n;
    }

    public int getC() {
        return c;
    }

    public int getR() {
        return R;
    }

    public int[][] getLocation() {
        return location;
    }

    public Car[] getCar() {
        return car;
    }

    public Request[] getReq() {
        return req;
    }

    private Car[] car;
    private Request[] req;

    public  void readBasic(){
    try {
        Scanner sc=new Scanner(new File("C:\\Users\\hp\\Desktop\\input.txt"));
        n=sc.nextInt();
        N=sc.nextInt();
        c=sc.nextInt();
        R=sc.nextInt();
        location =new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                location[i][j]=sc.nextInt();
                if(location[i][j]==-1)
                    location[i][j]=999;
            }
        }
        car =new Car[N];
        for(int i=0;i<N;i++){
            car[i]=new Car();
           // car[i].setCap(c);
        }
        for(int i=0;i<N;i++){
            car[i].setLocation(sc.nextInt());
        }
        req=new Request[R];
        for(int i=0;i<R;i++){
            req[i]=new Request();
            // car[i].setCap(c);
        }
        for(int i=0;i<R;i++){
            req[i].setSrc(sc.nextInt());
            req[i].setDest(sc.nextInt());
            req[i].setStartTime(sc.nextInt());
            req[i].setEndTime(sc.nextInt());
        }
    }catch(FileNotFoundException e){
        System.out.println(e);

    }
}
}