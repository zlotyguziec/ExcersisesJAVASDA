package com.company;

import java.util.Scanner;
import java.util.Random;

public class hackingletters {

    static void coding(String phrase){

        char[] coded = phrase.toCharArray();

        for (int i = 0; i < coded.length; i++) {
            switch (coded[i]) {
                case 'a':
                    System.out.printf("4");
                    break;
                case 'A':
                    System.out.printf("4");
                    break;
                case 'e':
                    System.out.printf("3");
                    break;
                case 'E':
                    System.out.printf("3");
                    break;
                case 'i':
                    System.out.printf("1");
                    break;
                case 'I':
                    System.out.printf("1");
                    break;
                case 'o':
                    System.out.printf("0");
                    break;
                case 'O':
                    System.out.printf("0");
                    break;
                case 's':
                    System.out.printf("$");
                    break;
                case 'S':
                    System.out.printf("$");
                    break;
                default:
                    System.out.print(coded[i]);
                }
            }
        }


    public static void main(String[] args) {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);
        String phrase = input.nextLine();
        coding(phrase);
    }
}
