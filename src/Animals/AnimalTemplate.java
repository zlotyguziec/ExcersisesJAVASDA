package Animals;

import java.util.Scanner;
import java.util.Random;

public class AnimalTemplate {
    private String name;
    private int age;
    private int weight;
    private String sound;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public AnimalTemplate(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public AnimalTemplate() {
    }
}
