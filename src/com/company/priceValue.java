package com.company;

import java.util.Scanner;
import java.util.Random;

public class priceValue {

    static double finalPrice(int price, int quantity){
        if (price*quantity>1000){
            return 0.9* (double) price* (double) quantity;
        }else{
            return price*quantity;
        }
    }

    public static void main(String[] args) {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int price = gen.nextInt(100);
            int quantity = gen.nextInt(100);


            System.out.println(finalPrice(price, quantity));
        }
    }
}
