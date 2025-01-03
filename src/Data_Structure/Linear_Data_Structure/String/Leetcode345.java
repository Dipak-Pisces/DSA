package Data_Structure.Linear_Data_Structure.String;

import javax.xml.stream.events.Characters;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Leetcode345 {

    public static void main(String[] args) {
        String s="Hello";

        List<Character> vovels = s.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> "AEIOUaeiou".indexOf(c) >= 0)
                .collect(Collectors.toList());

        Collections.reverse(vovels);
        Iterator<Character> vovelIterator = vovels.iterator();

        String collect = s.chars()
                .mapToObj(c -> "AEIOUaeiou".indexOf(c) >= 0 ? vovelIterator.next() : (char)c)
                .map(String::valueOf)
                .collect(Collectors.joining());

    }
}
