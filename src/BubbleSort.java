package com.company;
public class BubbleSort {
    public void burbuja (int [] array){

        int res;
        boolean cam=false;
        while(true)
        {
            cam=false;
            for (int i = 0; i < array.length; i++) {
                if (array[i]<array[i-1]){
                    res = array[i];
                    array[i] = array[i-1];
                    array[i-1] = res;
                    cam = true;

                }
            }
            if(cam==false);
            break;
        }


    }
    }

