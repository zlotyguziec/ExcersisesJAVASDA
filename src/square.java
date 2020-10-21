import java.util.Scanner;
import java.util.Random;

public class square {



    public static void main(String[] args) {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        rectangle.a = 10;
        rectangle.b = 10;
        int s = rectangle.squareP();
        System.out.println(s);
    }
}
