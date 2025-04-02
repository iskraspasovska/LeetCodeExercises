class Solution14 {
    public int maxVowels(String s, int k) {
        String vowels = "aeiouAEIOU";
        int max;
        int windowVowels=0;
        for (int i = 0; i < k; i++) {
            if(vowels.contains(Character.toString(s.charAt(i)))){
               windowVowels++;
            }
        }
        max=windowVowels;
        for(int i = k; i < s.length(); i++){
            if(vowels.contains(Character.toString(s.charAt(i-k)))){
                windowVowels--;
            }
            if(vowels.contains(Character.toString(s.charAt(i)))) {
                windowVowels++;
            }
            max=Math.max(max,windowVowels);
        }
        return max;
    }
}

public class MaximumNumberVowelsSubstring {
}
