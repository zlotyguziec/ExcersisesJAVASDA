package com.company;

import java.util.Scanner;
import java.util.Random;

public class wordsCounter {

    public static int allCharsCounter(String x){
        char[] ch = x.toCharArray();
        return ch.length;
    }
    public static int spaceCounter(String x) {
        char[] ch = x.toCharArray();
        int counter = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                counter++;
            }
        }return counter;
    }
    public static int noSpaceCharsCounter(String x) {
        int nSpCounter = 0;
        char[] ch = x.toCharArray();
        int counter = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                counter++;
            }

        }return nSpCounter = ch.length-counter;
    }

    public static void main(String[] args) {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        System.out.println(allCharsCounter(x));
        System.out.println(spaceCounter(x));
        System.out.println(noSpaceCharsCounter(x));
    }
}
