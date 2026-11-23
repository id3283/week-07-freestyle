package isa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // A is an interface
        // B implements that interface
        A aVariable = new B();

        // List is an interface
        // ArrayList implements that interface
        List<String> strings = new ArrayList<String>();

    }
}
