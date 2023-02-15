package apipractice;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamAPI {

    public static void main(String[] args) {

    }

    private static void streamsOnWrapperCollection() {
        Integer[] numbers = new Integer[500];
        for (int index = 0; index < 500; index++) {
            numbers[index] = index + 1;
        }
        // Intermediate operations
        //1. Intermediate
        List<Integer> integerList = Arrays.asList(numbers);
        IntStream intStream = integerList.stream().mapToInt(Integer::intValue);
        OptionalInt optionalInt = intStream.min();
        System.out.println(optionalInt.getAsInt());
    }
}