package Data_Structure.Linear_Data_Structure.Array;

import java.util.Arrays;

public class Leetcode136 {

    public static int singleNumber(int[] nums) {

        return Arrays.stream(nums).reduce(0, (a, b) -> a ^ b);
    }

    public static void main(String[] args) {

    }
}
