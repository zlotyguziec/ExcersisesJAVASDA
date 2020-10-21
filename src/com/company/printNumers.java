package com.company;

import java.util.Scanner;
import java.util.Random;

public class printNumers {

    static void just2and3(int n){
        for (int i = 1; i <= n; i++) {
            if (i%2==0 || i%3==0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);
        just2and3(10);
    }
}
