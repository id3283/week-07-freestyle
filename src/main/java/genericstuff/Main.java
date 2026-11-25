package genericstuff;

import sortof.Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Person p = new Person("Dave", 58);

        displayWithLabel("🤓", p);

    }

    static <T> void displayWithLabel(String label, T val){
        System.out.println(label + ": " + val);
    }

}
