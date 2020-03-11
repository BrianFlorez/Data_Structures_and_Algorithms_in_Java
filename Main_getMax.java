package com.company;
public class Main_getMax {
    public static void main(String[] args) {
        double[] arr = {1.5,0.1,-5,3,2};
        System.out.println(arr);
        System.out.println("The max value in the array is "+ getMax(arr));
    }
    //Creating a method that returns the maximum value from a given array.
    static double getMax(double x[]){
        double max = x[0]; //Set max value to the first element in the array
        for(int i = 1; i < x.length ; i++)//Iterate from the second element
                if(x[i]> max) //Update max value as necessary
                max = x[i];

        return max; //Returns the maximum value from the given array.
    }
}
