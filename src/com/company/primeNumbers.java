package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class primeNumbers {
    
    static void primePrint(int n){
        int[] primelist = new int[n+1];
        primelist[0] = 1;
        int fillCounter = 0;
        int sum = 0;
/*sprawdzic czy liczba dzieli sie przez liczby pierwsze*/
        //liczby pierwsze te  juz zapisane//
        // jesli tylko przez 1 to trzeba dodac do listy//

        for (int i = 2; fillCounter<n; i++) {

            int checkCounter = 0;
            for (int j = 0; j <=fillCounter ; j++) {
                if (i%primelist[j]==0){
                    checkCounter++;
                    if (checkCounter>1){
                        break;
                    }
                }
            }if(checkCounter==1){
                fillCounter++;
                primelist[fillCounter]=i;


            }

        }
        for (int i = 1; i < primelist.length; i++) {
            sum = sum + primelist[i];
        }
        System.out.println(sum);
//        for (int i = 1; i <n+1; i++) {
//            System.out.println(primelist[i]);
//
//        }
    }
    
    public static void main(String[] args) {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        primePrint(n);
    }
}
