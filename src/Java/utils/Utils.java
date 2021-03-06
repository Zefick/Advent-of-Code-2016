package utils;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Utils {

    public static int maxIndex(int[] array) {
        return IntStream.range(0, array.length)
                .reduce(0, (i, j) -> array[i] > array[j] ? i : j);
    }

    public static int minIndex(int[] array) {
        return IntStream.range(0, array.length)
                .reduce(0, (i, j) -> array[i] < array[j] ? i : j);
    }

    public static void printMap(int[][] map) {
        Arrays.stream(map)
                .map(s -> new String(s, 0, s.length))
                .forEach(System.out::println);
        System.out.println();
    }

}
