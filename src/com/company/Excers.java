package com.company;

import java.util.Scanner;
import java.util.Random;

public class Excers {
    public static void main(String[] args) {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);

        int giftsNumber = gen.nextInt(9) + 1;
        int[] giftsList = new int[giftsNumber];
        int max = 0;
        int secMax = -1;
        boolean giftsZero = false;

        for (int i = 0; i < giftsList.length; i++) {
            giftsList[i] = gen.nextInt(11);
        }


        for (int i = 0; i < giftsList.length; i++) {
            if (giftsList[i] > max) {
                max = giftsList[i];
            }

        }
        for (int i = 0; i < giftsList.length; i++) {
            if (giftsList[i] == 0) {
                giftsZero = true;
                break;
                 }
            }
        if (giftsZero == false) {
            for (int i = 0; i < giftsList.length; i++) {
                if (giftsList[i] != max) {
                    if (giftsList[i] > secMax) {
                        secMax = giftsList[i];
                    }
                }

            }
        }
            if (secMax == -1) {
                System.out.println("Jasiu wybrał prezent o wartości: " + max);
            } else {


                System.out.println("Jasiu wybrał prezent o wartości " + secMax);
            }
            for (int i = 0; i < giftsList.length; i++) {
                System.out.println(giftsList[i]);
            }



    }
}

