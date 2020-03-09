package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
       /* int [] [] arroy = new int [3] [4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j<4 ; j++) {
                double a = Math.random();
                int val = (int)(a*100);
                arroy [i] [j] = val;
            }
        }

        for (int i = 0; i < 3; i++) {
                        for (int j = 0; j<4 ; j++) {
                        System.out.print(arroy[i] [j] + " ");
                        }
                        System.out.println();
           }
         */
       int n=100;
       boolean [] mark = new boolean[n+1];
            for (int i = 2; i < n; i++) {
            mark [i] = true;
        }
      // int [] array = new int [n];
        for (int i = 2; i < mark.length; i++) {
            if (!mark[i]) continue;
            for ( int j= i+1; j < (mark.length); j++){
                if (j%i==0) {
                    mark [j] = false;
                }
            }
           // array [i] = i+1;
          }

        for (int i = 0; i< mark.length ; i++)
            if(mark[i] == true) {
            System.out.print( i + " ");
        }




     }
}
