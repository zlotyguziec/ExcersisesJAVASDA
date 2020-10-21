import java.util.Scanner;
import java.util.Random;

public class nFibonacci {

    static int[] fibo(int n){
        int[] result = new int[n];
        int fibo1 = 0;
        int fibo2 = 1;
        int fibo3 = 0;
        if (n==1) {
            result[0]=0;
        }else if (n==2){
            result[0]=0;
            result[1]=1;
        }else {

            for (int i = 2; i < n; i++) {
                result[i] = fibo1 + fibo2;
                fibo1 = fibo2;
                fibo2 = result[i];
            }
        }return result;
    }

    public static void main(String[] args) {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int element: fibo(n)) {
            System.out.println(element);
        }


    }
}
