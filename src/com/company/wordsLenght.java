package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Random;

public class wordsLenght {

    static void wordsInSentence(String sentence){
        String[] array = sentence.split(" ");
        int longestWord = Arrays.stream(sentence.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null).length();
        int shortestWord = Arrays.stream(sentence.split(" ")).min(Comparator.comparingInt(String::length)).orElse(null).length();
        for (int i = shortestWord; i < longestWord; i++) {
            int counter = 0;
            for (int j = 0; j< array.length; j++) {
            if (array[j].length()==i){
                counter++;
                if (counter==1) {
                    System.out.printf("Długość " + i + " - " + array[j] + " ");
                }else{
                    System.out.printf(array[j] + " ");
                }
            }
        }if (counter>0) {
                System.out.println("- liczba słów: " + counter);
            }
        }

    }

    public static void main(String[] args) {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        wordsInSentence(sentence);
    }
}
