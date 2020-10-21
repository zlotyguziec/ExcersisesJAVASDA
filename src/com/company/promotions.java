package com.company;

import java.util.Scanner;
import java.util.Random;

public class promotions {

    static void stars(int lines, String symbol) {
        int symbolsCounter = 0;
        for (int i = 0; i < lines; i++) {

            symbolsCounter=0;
            for (int k = 0; k < lines-i; k++) {
                System.out.printf(" ");
            }

                for (int j = 0; j < 1+i*2; j++) {
                    System.out.printf(symbol);
                    symbolsCounter++;
                }
                System.out.println();

            }


        for (int i = lines ; i > 0; i--) {
            symbolsCounter=symbolsCounter-2;

            for (int k = 0; k < lines-i+2; k++) {
                System.out.printf(" ");
            }

            for (int j = 1; j <= symbolsCounter; j++) {
                System.out.printf(symbol);

            }
            System.out.println();

        }
        System.out.println(symbolsCounter);

    }
    public static void main(String[] args) {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj symbola:");
        String symbol = input.nextLine();
        int lines = gen.nextInt(11);
    stars(lines,symbol);
    }

}
