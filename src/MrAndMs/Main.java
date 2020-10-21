package MrAndMs;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String secondName = input.nextLine();
        String surname = input.nextLine();
        String userInputDate = input.nextLine();
        String streetNr = input.nextLine();
        String flatNr = input.nextLine();
        String city = input.nextLine();


        Person person = new Person(name, secondName, surname, streetNr, flatNr, city, userInputDate);
        System.out.printf(person.getName() + " ");
        if (person.getSecondName() != null) {
            System.out.printf(person.getSecondName() + " ");
        }
        System.out.println(person.getSurname());
        System.out.println(person.getStreetNr() + "/" + person.getFlatNr());
        System.out.println(person.getCity());
        System.out.println();
        Greetings greetings = new Greetings();
        System.out.println(greetings.createGreeting(person));


    }

}

