package apipractice;

import java.util.*;

public class StreamApiTest {

    public static void main(String[] args) {
        String[] countries = new String[]{"Singapore", "India", "Japan", "Italy", "France", "Ukraine"};
        //1. Count of countries with the minimum characters
        //2. Display the countries in the upper case that have minimum characters
        //3. Calculate the max using reduce() method

        int characterNumb = Arrays.stream(countries).mapToInt(String::length).min().getAsInt();
        System.out.println("country"+characterNumb);

        //List country = Arrays.stream(countries).filter(index->countries)



    }
}
