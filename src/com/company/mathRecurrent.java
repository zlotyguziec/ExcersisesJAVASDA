package com.company;

import java.util.Scanner;
import java.util.Random;

public class mathRecurrent {

    public static void ciag(int a1, int n, int r){
        int[] ciagutek = new int[n];
        for (int i = 0; i < n; i++) {
            ciagutek[i] = a1 + i*r;
            System.out.println(ciagutek[i]);
        }

    }

    public static void main(String[] args) {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("a1: ");
        int a1 = input.nextInt();
        System.out.println("n: ");
        int n = input.nextInt();
        System.out.println("r: ");
        int r = input.nextInt();
        ciag(a1,n,r);

    }
}
