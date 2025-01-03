package Data_Structure.Linear_Data_Structure.Array;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Leetcode387 {

    public static void main(String[] args) {

        String s = "leetcode";

        Map<Character, Long> collect = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        int i = (int) collect.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> s.indexOf(entry.getKey()))
                .findFirst().orElse(-1);

        System.out.println(i);


    }
}
