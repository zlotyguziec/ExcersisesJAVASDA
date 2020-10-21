package com.company;

import java.util.Scanner;
import java.util.Random;

public class hackingLettersImproved {

    static void codingLetters(String phrase, int answer){
        char[] coded = phrase.toCharArray();
        char[] leetLetters = {'4', '3', '1', '0', '$'};
        char[] naturalLetters = {'a', 'e', 'i', 'o', 's'};
        if (answer ==1) {
            for (int i = 0; i < phrase.length(); i++) {
                for (int j = 0; j < naturalLetters.length; j++) {
                    if (phrase.charAt(i) == naturalLetters[j]) {
                        coded[i] = leetLetters[j];
                    }

                }
            }
        }else if(answer==2){
            for (int i = 0; i < phrase.length(); i++) {
                for (int j = 0; j < naturalLetters.length; j++) {
                    if (phrase.charAt(i) == leetLetters[j]) {
                        coded[i] = naturalLetters[j];
                    }

                }
            }
        }
        for (int i = 0; i < coded.length; i++) {


        System.out.print(coded[i]);
        }
    }

    public static void main(String[] args) {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj słowo do dekodowania:");
        String phrase = input.nextLine();
        System.out.println("Chcesz zakodować (1), czy odkodować słowo(2)?");
        int answer = input.nextInt();

        codingLetters(phrase,answer);
    }
}
