package com.company;

import java.util.Scanner;
import java.util.Random;

public class BinaryToNormal {
    public static void main(String[] args) {

        Random gen = new Random();
        Scanner input = new Scanner(System.in);
        String binary = input.nextLine();
        int[] binaryArray = new int[binary.length()];
        for (int i = 0; i < binaryArray.length; i++) {
            binaryArray[i] = Character.getNumericValue(binary.charAt(i));

        }
        double result = 0;
        for (int i = 0; i < binaryArray.length; i++) {
            if (binaryArray[i] == 1) {
                result = binaryArray[i] * Math.pow(2, i) + result;
            }
        }
        System.out.println(result);
//


    }
}
