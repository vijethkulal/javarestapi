package javaprogram;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class collectionexamples {


    public static <sor> void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        ls.add("zbc");
        ls.add("efg");
        ls.add("kij");

        Set<String> s = new TreeSet<String>();

        for (String i : ls) {
            s.add(i);
            System.out.println();
        }

        System.out.println(s);

        for (String i : ls) {
            System.out.println(i);

            // System.out.println(i);
        }

    }
}
