package com.company;

import java.util.Scanner;
import java.util.Random;

public class plusOrMinus {
    public static void main(String[] args) {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);

        int number = gen.nextInt(110);
        if (number<0){
            System.out.println("Liczba jest ujemna.");
            if (number*(-1)<10) {
                System.out.println("Liczba jest mała.");
            }
                else if (number*(-1)>100){
                    System.out.println("Liczba jest duża.");
                }

        }else if (number>0){
            System.out.println("Liczba jest dodatnia.");
            if (number<10) {
                System.out.println("Liczba jest mała.");
            }
            else if (number>100){
                System.out.println("Liczba jest duża.");
        }

    }else {
            System.out.println("liczba jest zerem i jest mała");
        }
}
    }
