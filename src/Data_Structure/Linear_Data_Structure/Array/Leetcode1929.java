package Data_Structure.Linear_Data_Structure.Array;

import java.util.stream.IntStream;

public class Leetcode1929 {

    public static int[] getConcatenation(int[] nums) {
        int len = nums.length;

        return IntStream.range(0,len*2)
                .map(i-> {
                    if(i>=len){
                        return nums[i-len];
                    }else{
                        return nums[i];
                    }
                }).toArray();

    }
    public static void main(String[] args) {

    }
}
