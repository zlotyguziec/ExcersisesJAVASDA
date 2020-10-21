package com.company;

import java.util.Scanner;
import java.util.Random;

public class modulo {
    public static int fmodulo(int x){
        return x-(x/2 *2);
    }
    public static boolean check(int x){
        return x%2==fmodulo(x);
    }
    public static void main(String[] args) {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i <30; i++) {
            int x = gen.nextInt();
        System.out.println(check(x));
        if (check(x)==false){
            System.out.println(x + " " + x%2);
        }
        }
    }
}
