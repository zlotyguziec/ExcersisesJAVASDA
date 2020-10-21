package com.company;

import java.util.Scanner;
import java.util.Random;

public class nameInStringArray {

    public static void main(String[] args) {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);
        String[] array = {"john", "Max", "Kazimierz wielki"};
        array[1] = "Maciej";
        System.out.println(array[1]);
    }
}
