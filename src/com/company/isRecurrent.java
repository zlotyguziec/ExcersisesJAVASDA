package com.company;

import java.util.Scanner;
import java.util.Random;

public class isRecurrent {

    static boolean isArythmetic(int a, int b, int c){
        return a-b==b-c;
    }

    public static void main(String[] args) {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println(isArythmetic(a,b,c));
    }
}
