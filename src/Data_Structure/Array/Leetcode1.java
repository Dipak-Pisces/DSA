
import java.util.HashMap;
import java.util.Optional;
import java.util.stream.IntStream;

public class Leetcode1 {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int len = nums.length;

        Optional<int[]> first = IntStream.range(0, len)
                .boxed()
                .filter(i -> {
                    int component = target - nums[i];
                    if (map.containsKey(component)) {
                        return true;
                    }
                    map.put(nums[i], i);
                    return false;
                })
                .map(i -> new int[]{map.get(target - nums[i]), i})
                .findFirst();

        return first.orElseThrow(()-> new IllegalArgumentException("No Result Found"));

    }


    public static void main(String[] args) {

        int[] ints = twoSum(new int[]{2, 7, 11, 15}, 9);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}

