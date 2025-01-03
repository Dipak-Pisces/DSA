package Data_Structure.Linear_Data_Structure.Array;

import java.util.stream.IntStream;

public class Leetcode1480 {

    class Solution {
        public int[] runningSum(int[] nums) {

            return IntStream.range(0,nums.length)
                    .map(i -> IntStream.range(0,i+1).map(j -> nums[j]).sum())
                    .toArray();
        }
    }

}
