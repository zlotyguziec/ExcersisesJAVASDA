package AdvancedJava.Collections.ListsExcersises;

public class Nootropic implements Comparable<Nootropic> {

    private String name;
    private double amountInGrams;
    private String company;
    private Size size;
    private int amountInContainer;

    public Nootropic(String name, double amountInGrams, String company, Size size) {
        this.name = name;
        this.amountInGrams = amountInGrams;
        this.company = company;
        this.size = size;
        amountInContainer = 1;
    }

    public Nootropic(String name, String company, Size size, int amountInContainer) {
        this.name = name;
        this.company = company;
        this.size = size;
        this.amountInContainer = amountInContainer;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Nootropic nootropic){
        return (int)(this.amountInGrams - nootropic.amountInGrams);
    }

    public int compareTo2(Nootropic nootropic){
        return (this.getName().charAt(0) - nootropic.getName().charAt(0));
    }

}
