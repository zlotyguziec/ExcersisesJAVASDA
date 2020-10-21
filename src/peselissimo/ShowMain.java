package peselissimo;

import java.util.Scanner;
import java.util.Random;

public class ShowMain {



    public static void main(String[] args) {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);
        Person ja = new Person("Maciej","Gołaszewski",1992);
        System.out.println(ja.getFirstName());
    }
}
