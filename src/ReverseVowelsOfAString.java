import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

class Solution3 {
    public String reverseVowels(String s) {
        Stack<Character> toBeReversed =  new Stack<>();
        String vowels = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(vowels.contains(Character.toString(s.charAt(i)))){
                toBeReversed.push(s.charAt(i));
            }
        }
        for(int i = 0; i < s.length(); i++){
            if(vowels.contains(Character.toString(s.charAt(i)))){
                sb.append(toBeReversed.pop());
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}

class Solution4 {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] new_string = s.toCharArray();
        int i =0, j =s.length()-1;
        while(i < j){
            while(i<j && !vowels.contains(Character.toString(new_string[i]))){
                i++;
            }
            while(j>i && !vowels.contains(Character.toString(new_string[j]))){
                j--;
            }
            char temp = new_string[i];
            new_string[i] = new_string[j];
            new_string[j] = temp;
        }
        return String.valueOf(new_string);

    }
}

public class ReverseVowelsOfAString {
    public static void main(String[] args) {

    }
}
