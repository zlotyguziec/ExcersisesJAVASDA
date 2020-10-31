package AdvancedJava.Collections.ListsExcersises;

import java.util.*;

public class CupboardWithNootropics {

    public static List<Nootropic>upperShelf = new ArrayList<>();
    public static LinkedList<Nootropic>justACornerInTheCupboard = new LinkedList<>();
    public static Set<Nootropic>magicFindings = new HashSet<>();


    public static void main(String[] args) {

        Nootropic exampler = new Nootropic("Exampler", 100, "JustExample", Size.MEDIUM);

        upperShelf.add( new Nootropic("Piracetam", 500, "Ravenge",Size.LARGE));
        upperShelf.add( new Nootropic("N-Acetyl-L-Tyrosine", 250, "Nootropics Depot",Size.MEDIUM));
        upperShelf.add( new Nootropic("Vitaminum D3 5000UI", "Swanson", Size.SMALL, 250));

        //justACornerInTheCupboard.add(exampler);
//        for (Nootropic nootropic : upperShelf)
//        System.out.println(upperShelf.contains(nootropic));
       // System.out.println(upperShelf.contains(exampler));

        magicFindings.add(exampler);

        upperShelf.addAll(magicFindings);




    }




}
