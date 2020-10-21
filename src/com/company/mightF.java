package com.company;

import java.util.Scanner;
import java.util.Random;

public class mightF {

    public static int calcMight(int x1, int y) {
        int x = 1;

            for (int i = 0; i < y; i++) {
                x = x * x1;
        }
        return x;
    }
    public static void main(String[] args) {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int y = input.nextInt();


        System.out.println(calcMight(x1,y));
    }
}
