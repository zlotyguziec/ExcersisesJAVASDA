package AdvancedJava.Collections.ListsExcersises;

import java.util.Comparator;

public abstract class CompareMethods implements Comparator {

    public static Comparator<Nootropic> LenghtComparator = new Comparator<Nootropic>() {

        @Override
        public int compare(Nootropic nootropic1, Nootropic nootropic2) {
            return (nootropic1.getName().length() - nootropic2.getName().length());
        }

    };
}
