package behavioralPatterns.iterator;

import java.util.ArrayList;

public class Iterator {
    private static void iterate(ArrayList<String> arl) {
        for (String listItem : arl) {
            System.out.println(listItem.toString());
        }
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Viktor");
        names.add("Semen");
        names.add("Michael");
        names.add("Sergio");

        System.out.println("The names: ");
        iterate(names);
    }
}
