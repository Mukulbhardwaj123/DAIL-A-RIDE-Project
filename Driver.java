package com.heckercode.controller;
import com.heckercode.utilities.*;
import com.heckercode.utilities.Schedulling;
import com.heckercode.utilities.Schedulling;
import com.heckercode.utilities.SelectioSort;
import com.heckercode.utilities.Dijkstra;
import com.heckercode.utilities.SortRequest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Driver {
    public static void main(String args[])throws IOException{
        ReadInput ri=new ReadInput();
        ri.readBasic();
        SortRequest sr=new SortRequest();
        sr.sortReq(ri.getReq());

        Dijkstra dj=new Dijkstra();
        for(int i=0;i<ri.getN();i++) {
            dj.dij(ri.getLocation(),ri.getN(),i);
        }
        Schedulling sd = new Schedulling();
        sd.schedule(ri.getCar(),ri.getReq(),ri.getLocation());
        OutputRevanue o = new OutputRevanue();
        o.writeOutput(ri.getCar());
    }
}





   /* public static void main(String[] args) {

    }
        /*Scanner scan = new Scanner(System.in);
        int arr[]={10,2,3,5,90,4};
        SelectionSort s = new SelectionSort();
        s.sorting(arr);



          System.out.println("enter the graph");
            int n=5;
            int inf = 999;

            int [][]graph = new int[n][n];

            int []sptSet=new int[5];

            int [] visited = new int[5];



            for(int i =0;i<n;i++){
                sptSet[i]=0;
                visited[i]=0;

            }

            for(int i = 0;i<n;i++){
                for(int j=0;j<n;j++){
                    graph[i][j]= scan.nextInt();
                    if(graph[i][j]<=0){
                        graph[i][j]=inf;

                    }
                }
            }
            for(int i =0 ;i<n;i++){
                com.hackercode.utilities.Dijkstra.dij(visited,graph,inf,i);
                visited[i]=0;
            }
            for(int i =0;i<n;i++){
                for(int j= 0;j<n;j++){

                    System.out.print(graph[i][j] + " ");
                }
                System.out.println();

            }

        }

	/*0 3 0 1 0
	  3 0 2 0 0
	  0 2 0 2 4
	  1 2 0 0 3
	  0 0 4 3 0*/



