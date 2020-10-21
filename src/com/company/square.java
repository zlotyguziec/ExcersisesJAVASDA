package com.company;

import java.util.Scanner;
import java.util.Random;

public class square {
    public static void main(String[] args) {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);
        int i = 0;
        int randomNumberA = 0;
        int randomNumberB = 1;

        do {

        randomNumberA = gen.nextInt(11);
        randomNumberB = gen.nextInt(101);
        i++;
        }
        while (randomNumberA*randomNumberA != randomNumberB);
        System.out.println("BINGO! Za " + i + "razem udało się wylosować tak, by A*A = B");
        System.out.println(randomNumberA + " " + randomNumberB);

    }
}
