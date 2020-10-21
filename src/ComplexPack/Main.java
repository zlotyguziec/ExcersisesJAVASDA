package ComplexPack;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Complex complex = new Complex(2,3);
        Complex complex2 = new Complex(2,3);
        System.out.println(Complex.add(complex,complex2).toString());
        System.out.println(Complex.getCounter());

    }
}
