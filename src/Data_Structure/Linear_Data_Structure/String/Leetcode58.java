package Data_Structure.Linear_Data_Structure.String;

import java.util.stream.Stream;

public class Leetcode58 {

    public static void main(String[] args) {

        String s = "   fly me   to   the moon  ";

        String[] split = s.trim().split(" ");

        Integer i = Stream.of(s.trim().split(" "))
                .reduce((first, second) -> second)
                .map(String::length).orElse(0);
        System.out.println(i);
    }
}
