package com.company;

import java.util.Scanner;
import java.util.Random;

public class showMinus {
    public static void main(String[] args) {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);

        int randomNumber = gen.nextInt(101);
        System.out.println("Podaj swoją liczbę (najlepiej do 100): ");
        int userNumber = input.nextInt();
        System.out.println(randomNumber + "-" + userNumber + "=" + (randomNumber-userNumber));
    }
}
