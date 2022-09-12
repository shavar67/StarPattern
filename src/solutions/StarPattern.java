package solutions;

import java.util.stream.IntStream;

public class StarPattern {

    public static void main(String[] args) {
        reverseStarPattern(5);
    }

    public static void reverseStarPattern(int number) {
        var i = 0;
        while (number > i) {
            IntStream.range(i, number)
                    .map(j -> number)
                    .forEach(System.out::print);
            System.out.println();
            i++;
        }
    }
    public static void starPattern(int number) {
        var i = 0;
        while (i < number) {
            IntStream.range(0, i)
                    .map(j -> number)
                    .forEach(System.out::print);
            System.out.println();
            i++;
        }
    }


    public static void basicStarPattern(int number) {
        for (int i = number; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}