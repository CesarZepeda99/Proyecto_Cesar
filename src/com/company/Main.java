package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int []array = {7,2,6,1};
        burbuja a = new burbuja();
        a.bubblesort(array);
        for (int i  = 0; i  < array.length ; i ++) {
            System.out.println(array[i]);
        }
    }
}
