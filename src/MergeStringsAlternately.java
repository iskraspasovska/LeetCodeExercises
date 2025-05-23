import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String mergeAlternately (String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < Math.max(word1.length(), word2.length()); i++) {
            if(i<word1.length()){
                sb.append(word1.charAt(i));
            }
            if(i<word2.length()){
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }
}

public class MergeStringsAlternately {
    public static void main(String[] args) {

    }
}
