class Solution7 {
    public int[] productExceptSelf(int[] nums) {
        int[] l_answer = new int[nums.length];
        int[] r_answer = new int[nums.length];
        int[] answer = new int[nums.length];
        l_answer[0]=1;
        r_answer[nums.length-1]=1;

        for(int i=1;i<nums.length;i++){
            l_answer[i]=l_answer[i-1]*nums[i-1];
        }

        for(int j=nums.length-2; j>=0;j--){
            r_answer[j]=r_answer[j-1]*nums[j+1];
        }

        for(int i=0;i<nums.length;i++){
            answer[i] = l_answer[i] * r_answer[i];
        }
        return answer;
    }
}