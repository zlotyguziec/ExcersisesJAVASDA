package com.company;

import java.util.Scanner;
import java.util.Random;

public class lowestOf3 {

    static int findLowest(int a, int b, int c){
        if (a>b){
            if (b>c){
                return c;
            }else{
                return b;
            }
        }else{
            if (a>c){
                return c;
            }else{
                return a;
            }
        }
    }

    public static void main(String[] args) {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {


            int a = gen.nextInt(6);
            int b = gen.nextInt(6);
            int c = gen.nextInt(6);
            System.out.println(findLowest(a, b, c));
            System.out.println(a + " " + b + " " + c);
        }
    }
}
