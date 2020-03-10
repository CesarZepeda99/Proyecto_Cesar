package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int []array = {3,2,4,5,6,7,9,9,10,3,5,1,12,13,17,67,86,54};
        burbuja a = new burbuja();
        a.bubblesort(array);
        for (int i  = 0; i  < array.length ; i ++) {
            System.out.println(array[i]);
        }
        System.out.println("\n\ntarda "+ a.sort(array)+ " milisegundos");
    }
}
