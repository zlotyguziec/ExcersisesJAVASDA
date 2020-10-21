package com.company;

import java.util.Scanner;
import java.util.Random;

public class credit {

    static float jewishRateValue(int creditValue, float rateInterest, int numberOfRates, int alreadyPaidRates){
        rateInterest = rateInterest/100;
        float capitalRate =(float) creditValue/numberOfRates;
        float jewishRate = ((creditValue-alreadyPaidRates*capitalRate)*rateInterest)/12;

        return jewishRate;
    }



    public static void main(String[] args) {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Wartość kredytu, oprocentowanie, liczba rat:");
        int creditValue = input.nextInt();
        float rateInterest = input.nextFloat();
        int numberOfRates = input.nextInt();

        float sum = 0;
        for (int i = 0; i <numberOfRates; i++) {
            System.out.println(jewishRateValue(creditValue,rateInterest,numberOfRates,i));
            sum += jewishRateValue(creditValue,rateInterest,numberOfRates,i);
        }
        System.out.println(sum);
    }
}
