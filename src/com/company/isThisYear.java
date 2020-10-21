package com.company;

import java.util.Scanner;
import java.util.Random;

public class isThisYear {

    static boolean isYear(int year){
        return year%100==0 ? year%400==0 ? true : false : year%4==0;
    }

    public static void main(String[] args) {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        System.out.println(isYear(year));
    }
}
