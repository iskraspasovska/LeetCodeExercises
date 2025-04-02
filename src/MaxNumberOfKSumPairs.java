import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution12 {
    public int maxOperations(int[] nums, int k) {
        int operations=0;

        Arrays.sort(nums);
        int i=0, j=nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]>k){
                j--;
            } else if(nums[i]+nums[j]<k){
                i++;
            } else {
                i++;
                j--;
                operations++;
            }
        }
        return operations;
    }
}

public class MaxNumberOfKSumPairs {
    public static void main(String[] args) {
        Solution12 solution = new Solution12();
        System.out.println(solution.maxOperations(new int[]{1, 3, 2, 5, 4}, 5));
    }
}
