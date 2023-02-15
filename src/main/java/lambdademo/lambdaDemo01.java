package lambdademo;

import java.util.ArrayList;

public class lambdaDemo01 {
    public static void main(String[] args) {

        ArrayList location = new ArrayList();
        location.add("A");
        location.add("b");

        //location.forEach(loc -> System.out.println("current location is " + loc.toString().toUpperCase()));

        location.forEach(loc -> {
            if (loc != null) System.out.println("current location is " + loc.toString().toUpperCase());
        });

    }


}
