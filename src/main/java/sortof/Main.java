package sortof;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> peeps = new ArrayList<>();

        peeps.add(new Person("Ben", 23));
        peeps.add(new Person("Alexis", 24));
        peeps.add(new Person("Destiny", 22));
        peeps.add(new Person("Dave", 58));



        System.out.println("Unsorted:");
        for (Person p: peeps) {
            System.out.println(p);
        }

        Collections.sort(peeps);
        System.out.println();

        System.out.println("Sorted:");
        for (Person p: peeps) {
            System.out.println(p);
        }
    }
}
