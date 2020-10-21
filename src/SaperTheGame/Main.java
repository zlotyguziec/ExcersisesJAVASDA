package SaperTheGame;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.print("Witaj! Czyżbyś chciał zagrać w sapera? Życie Ci niemiłe?" + "\n" +
                "W nagrodę za podjęcie wyzwania pozwolę Ci zagrać na Twoich zasadach:");
        System.out.println("Ustal długość planszy:");
        Scanner input = new Scanner(System.in);
        int userInputMapXSize = input.nextInt();
        System.out.println("Teraz szerokość:");
        int userInputMapYSize = input.nextInt();
        System.out.println("No to ile bomb?");
        int userBombs = input.nextInt();
        if (userInputMapXSize == 0 || userInputMapYSize == 0 || userBombs == 0) {
            System.out.println("Widzę, że lubisz trollować. Miarka się przebrała, za karę zagrasz na moich zasadach.");
            ArrayOfTheGame game = new ArrayOfTheGame(10, 10);
            game.fillArrayOfFields();
            game.fillBombs(100);
            game.printFields();
            System.out.println("Miłej zabawy");
        } else {
        ArrayOfTheGame game = new ArrayOfTheGame(Math.abs(userInputMapXSize),Math.abs(userInputMapYSize));
        game.fillArrayOfFields();
        game.fillBombs(Math.abs(userBombs));
        game.fillFieldsWithNumbers();
        game.printFields();
            System.out.println("Niech rozpoczą się Igrzyska śmierci!");
        do {
            System.out.println("Współrzędna X do odkrycia:");
            int userX = input.nextInt();
            System.out.println("Wpółrzędna Y:");
            int userY = input.nextInt();
            game.revealField(userY,userX);
            game.printFields();
        }while (!game.isGameWon() && !ArrayOfTheGame.isGameLost());

        }
    }
}
