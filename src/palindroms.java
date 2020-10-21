import java.util.Scanner;
import java.util.Random;

public class palindroms {
    Random gen = new Random();
    Scanner input = new Scanner(System.in);

    public static boolean isPalyndrome(String x){
        char[] ch = x.toCharArray();
        boolean result = false;
        int secondArrayCounter =0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] !=' '){
                secondArrayCounter++;
            }
        }
        char[] ch2 = new char[secondArrayCounter];
        int j = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]!=' ') {
                ch2[j] = ch[i];
                j++;
            }
        }

        for (int i = 0; i < ch2.length/2 +1; i++) {
            if (ch2[i]!=ch2[ch2.length-1-i]){
                result = false;
            }
            else{
               result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        System.out.println(isPalyndrome(x));

    }
}
