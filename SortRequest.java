package com.heckercode.utilities;

public class SortRequest {
   private Request r;
   public  void sortReq(Request[] req){
        r=new Request();
        int i,j;
        for(i=0;i<20;i++){
            for(j=i;j<20;j++){
                if(req[i].getEndTime()>req[j].getEndTime()){
                    r=req[i];
                    req[i]=req[j];
                    req[j]=r;
                }
            }
        }
    }
}




