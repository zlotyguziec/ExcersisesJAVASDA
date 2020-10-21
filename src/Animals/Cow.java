package Animals;

import java.util.Scanner;
import java.util.Random;

public class Cow extends AnimalTemplate implements firstInterface {

    private String sound = "Muu";

    @Override
    public String getSound() {
        return sound;
    }

    @Override
    public void setSound(String sound) {
        this.sound = sound;
    }

    public Cow(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Cow() {
    }
}
