package com.company;

public class burbuja implements Sorttester {


        public long sort(int[] array) {
            long start = System.currentTimeMillis();
            bubblesort(array);

            long end = System.currentTimeMillis();

            return end - start;
        }


    public void bubblesort (int [] array){
        int res;
        boolean cam=false;
        while(true)
        {
             cam=false;
            for (int i = 1; i < array.length; i++) {
                if(array[i]<array[i-1])
                {
                    res = array[i];
                    array[i] = array[i-1];
                    array[i-1] = res;
                    cam = true;

                }
            }
            if(cam==false)
            break;
        }


    }

}
