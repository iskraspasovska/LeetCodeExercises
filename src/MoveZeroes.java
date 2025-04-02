import java.util.*;

class Solution9 {
    public void moveZeroes(int[] nums) {
        Queue<Integer> othersQueue = new LinkedList<>();
        for(int i = 0; i<nums.length; i++){
            if(nums[i]!=0){
                othersQueue.add(nums[i]);
            }
        }
        int toBeReturned = othersQueue.size();
        for(int i = 0; i<nums.length; i++){
            if(i<toBeReturned){
                nums[i] = othersQueue.poll();
            } else {
                nums[i] = 0;
            }

        }

    }

}

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println("Original array: " + Arrays.toString(nums));

        // Create an instance of Solution9 and test moveZeroes
        Solution9 solution = new Solution9();
        solution.moveZeroes(nums);

        // Print the modified array
        System.out.println("Modified array: " + Arrays.toString(nums));
    }
}
