import java.lang.reflect.Array;
import java.util.List;

class Solution6 {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        int i=0,j=words.length-1;
        while(i<j){
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
            i++;
            j--;
        }

        return String.join(" ", words);
    }
}

public class ReverseWordsInAString {
}
