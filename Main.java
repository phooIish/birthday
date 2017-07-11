package com.company;

import java.util.Arrays;
import java.util.Scanner;

//Hackerrank - Birthday candles

/**
 * Two scanners: First to take age, second to take candle heights
 * myInts variable holds the inputted candle heights
 * sortCandles sorts the candles in ascending order
 * tallestCandle checks how many of the tallest candles are present
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //This scanner takes input to call getHeights()
        //There are two to allow custom n values

        System.out.println("Enter your age:");
        int age = sc.nextInt(); //Age
        System.out.println("What are the heights of your candles?"); //Values from getHeights()

        int[] myInts = getHeights(age);
        int[] candles = sortCandles(myInts);
        //printArray(candles);
        tallestCandle(candles);
        //System.out.println(candles); //Can't print int array directly - use printArray function
    }

    public static int[] getHeights(int n){
        Scanner sc = new Scanner(System.in);
        int[] candleHeight = new int[n]; //Number of candles based on age

        for(int i = 0; i < n;i++){
            candleHeight[i] = sc.nextInt(); //User inputs candle heights
        }
        return candleHeight;
    }

    public static void printArray(int[] array){
        for(int k = 0; k < array.length; k++){
            System.out.println(array[k]);
        }
    }


    public static int[] sortCandles(int[] array){ //Ascending Order: 1 2 3
        int[] ar = Arrays.copyOf(array, array.length);
        int temp;
        boolean bool = true;
        while(bool){
            bool = false;
            for(int j = 0; j < ar.length - 1;j++){
                if(ar[j] > ar[j+1]){
                    temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                    bool = true;
                }
            }
        }
    return ar;
    }

    public static void tallestCandle(int[] array){
        int count = 1;
        for(int l = 0; l < array.length-1;l++){ //For loop breaks after the last index runs
            if(array[l] == array[array.length-1]){
                count++;
            }
        }
        System.out.println("Tallest candle = " + array[array.length-1] + "\nYou can only blow out " + count + " candle(s).");
    }

}
