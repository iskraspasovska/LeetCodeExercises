class Solution13 {
    public double findMaxAverageNotOptimal(int[] nums, int k) {
        double maxAvg = Double.NEGATIVE_INFINITY;
        for (int i = 0; i <= nums.length-k; i++) {
            int sum=nums[i];
            for(int j=i+1; j<k+i; j++){
                sum+=nums[j];
            }
            if((double)sum/k>maxAvg){
                maxAvg=(double) sum/k;
            }
        }
        return maxAvg;
    }
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0; i<k; i++){
            sum+=nums[i];
        }
        double maxAvg = (double) sum/k;
        for(int i=k; i<nums.length; i++){
            sum = sum - nums[i-k]+nums[i];
            maxAvg = Math.max(maxAvg, (double) sum/k);
        }
        return maxAvg;
    }
}

public class MaximumAverageSubarray1 {
    public static void main(String[] args) {
        Solution13 solution = new Solution13();
        System.out.println("res "+solution.findMaxAverage(new int[]{-1}, 1));
    }
}
