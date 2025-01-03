package Data_Structure.Linear_Data_Structure.Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Leetcode1672 {

    public static int maximumWealth(int[][] accounts) {

        int fattest_account = Integer.MIN_VALUE;
        Optional<Integer> max = Arrays.stream(accounts)
                .map(i -> Arrays.stream(i).sum())
                .max(Comparator.naturalOrder());

        return max.get();
    }

    public static void main(String[] args) {

        int [][] input = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(input));
    }
}
