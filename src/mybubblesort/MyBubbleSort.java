/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybubblesort;

import java.util.Scanner;

/**
 *
 * @author Alireza Hassanpour
 */
public class MyBubbleSort {
  
    // logic to sort the elements
    public static void bubble_srt(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
            printNumbers(array);
        }
    }
  
    private static void swapNumbers(int i, int j, int[] array) {
  
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
  
    private static void printNumbers(int[] input) {
          
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
  
    public static void main(String[] args) {
        Scanner r= new Scanner(System.in);
        System.out.println("Enter the number of your entries:");
        int n = r.nextInt();
        int[] input = new int[n];
        System.out.println("Enter the " + n + " numbers now.");
        for (int i =0 ; i < input.length ; i++)
        {
             input[i] = r.nextInt();
        }
        bubble_srt(input);
  
    }
}
