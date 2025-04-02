import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution1 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = Arrays.stream(candies).max().getAsInt();
        List<Boolean> tf = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            tf.add(candies[i]+extraCandies >= maxCandies);
        }
        return tf;
    }
}

public class KidsWithCandies {
    public static void main(String[] args) {

    }
}
