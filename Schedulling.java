package com.heckercode.utilities;

import com.heckercode.constant.Constants;

public class Schedulling {
    public void schedule(Car car[],Request r[],int loc[][]) {
        for(int i=0;i<r.length;i++){
            int carNumber=0;
            for(int k=0;k<car.length;k++){
                if(car[k].getCap()>=0){
                    carNumber=k;
                }
            }
            if(car[carNumber].getLocation()!=r[i].getSrc()){
                int sortDist=loc[(car[carNumber].getLocation())-1][(r[i].getSrc())-1];
                car[carNumber].setLocation(r[i].getSrc());
                car[carNumber].setCarTime(2*sortDist);
            }//wait car
            if(car[carNumber].getCarTime()<r[i].getStartTime()){
                car[carNumber].setCarTime(r[i].getStartTime());
            }//schedulling a request
            if(car[carNumber].getCap()>=0&&(car[carNumber].getCarTime()>=r[i].getStartTime()) && car[carNumber].getCarTime()<=r[i].getEndTime()){
                car[carNumber].setRevenue(car[carNumber].getRevenue()+(loc[car[carNumber].getLocation()-1][r[i].getDest()-1]));
                car[carNumber].setCap(car[carNumber].getCap()-1);
                int[] indeces = new int[5];
                indeces=(car[carNumber].getPassengerlocation());
                System.out.println("Constants.Request serve:"+Constants.space +r[i].getSrc()+" "+r[i].getDest()+" "+r[i].getStartTime()+" "+r[i].getStartTime());
                //int index=0;
                try{
                for(int j=0;j<5;j++) {
                  if(indeces[j]==0){
                      indeces[j]=r[i].getDest();
                break;
                }

                }
                }catch(NullPointerException e){
                    System.out.println("Constants.not served Request:"+(i+1));

                }
                car[carNumber].setPassengerlocation(indeces);


        }//droping passenger bto their dest
        if(car[carNumber].getCap()==5){
                int[] dropLocations=car[carNumber].getPassengerlocation();{
        }
                for(int j=0;j<dropLocations.length;j++){
                    int srtDist=loc[(car[0].getLocation())-1][(dropLocations[i])-1];
                    car[carNumber].setLocation(dropLocations[i]);
                    car[carNumber].setCarTime(car[carNumber].getCarTime()+(2*srtDist));
                }
                car[carNumber].setCap(car[carNumber].getCap()+1);

                }
                car[carNumber].PassengerLocationReset();
        }
    }
}
