package Data_Structure.Linear_Data_Structure.String;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Leetcode344 {

    class Solution {
        public void reverseString(char[] s) {
            String reverse = IntStream.range(0, s.length)
                    .mapToObj(i -> s[s.length - i - 1])
                    .collect(StringBuffer::new, StringBuffer::append, StringBuffer::append)
                    .toString();
            for(int i=0;i<s.length;i++){
                s[i] = reverse.charAt(i);
            }
        }
    }
}
