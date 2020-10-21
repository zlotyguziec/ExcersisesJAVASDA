package Animals;

public class Cat extends AnimalTemplate implements firstInterface {
    private String sound = "Meow";

    @Override
    public String getSound() {
        return sound;
    }

    @Override
    public void setSound(String sound) {
        this.sound = sound;
    }

    public Cat(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Cat() {
    }
}
