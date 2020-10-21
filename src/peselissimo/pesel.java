package peselissimo;

import java.util.Scanner;
import java.util.Random;

public class pesel {

    static boolean isCorrect(String peselstring){
        int[] newPesel = new int[peselstring.length()];
        for (int i = 0; i < peselstring.length(); i++)
        {
            newPesel[i] = peselstring.charAt(i) - '0';
        }
       int sum = 3*(newPesel[1] + newPesel[5] + newPesel[9]) + 7*(newPesel[2] + newPesel[6]) + 9*(newPesel[3]+newPesel[7])+ newPesel[0] + newPesel[4] + newPesel[8] + newPesel[10];
        return sum%10==0;
    }

    public static void main(String[] args) {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);
        String peselinput = input.nextLine();
        System.out.println(isCorrect(peselinput));
    }
}
