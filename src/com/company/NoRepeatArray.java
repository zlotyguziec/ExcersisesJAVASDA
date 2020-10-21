package com.company;

import java.util.Scanner;
import java.util.Random;

public class NoRepeatArray {

    static void removeDuplicates(int[] numbers){




       for (int i = 0; i < numbers.length-1; i++) {
           int k = i+1;
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i]!=numbers[j]){
                    numbers[k]=numbers[j];
                    k++;
                }
           }
        }

       int oldLenghtChecker = -1;
        do {
            oldLenghtChecker++;
        }while (numbers[oldLenghtChecker]!=numbers[oldLenghtChecker+1]);
        int newArrayLenght = oldLenghtChecker-1;

        //System.out.println(" Nowa dlugosc:" + newArrayLenght);

        int[] uniqueNumbers = new int[newArrayLenght];


        for (int k = 0; k < uniqueNumbers.length; k++) {
            uniqueNumbers[k]=numbers[k];
            System.out.println(uniqueNumbers[k]);
        }
    }

    public static void main(String[] args) {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);
        int [] numbers = {0,3,4,5,7,8,4,6,2,2,2,8,9,9,3,3,7,0,8,4,6,5,5,8,6,5,2,2};
        removeDuplicates(numbers);

        



    }
}
