package Animals;

import java.util.Scanner;
import java.util.Random;

public class Dog extends AnimalTemplate implements firstInterface{

    private String sound = "Bark";

    @Override
    public String getSound() {
        return sound;
    }

    @Override
    public void setSound(String sound) {
        this.sound = sound;
    }

    public Dog(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Dog() {
    }
}
