import java.util.Scanner;

class Solution8{
    public boolean increasingTripletConsecutive(int[] nums) {
        for (int i = 0; i < nums.length - 3; i++) {
            if(nums[i] < nums[i+1] && nums[i+1] < nums[i+2]) {
                return true;
            }
        }
        return false;
    }
    public boolean increasingTriplet(int[] nums) {
//        int i=0, j=1, k=2;
//        while(i<nums.length-2) {
//            while(j<nums.length-1) {
//                while(k<nums.length){
//                    if(nums[i] < nums[j] && nums[j] < nums[k] && nums[i]<nums[k]) {
//                        return true;
//                    }
//                    k++;
//                }
//                k=j+2;
//                j++;
//            }
//            k=i+3;
//            j=i+2;
//            i++;
//        }
//        return false;

        int j = Integer.MAX_VALUE;
        int k = Integer.MAX_VALUE;
        for (int i : nums){
            if(i<j){
                j=i;
            } else if(i<k){
                k=i;
            } else {
                return true;
            }
        }
        return false;
    }
}

public class IncreasingTripletSubsequence {
    public static void main(String[] args) {

    }
}
