import java.util.*;

class Solution11 {
    public int compress(char[] chars) {
        int count = 1;
        char current = chars[0];
        int k = 0;
        for (int i = 1; i < chars.length; i++) {
            if(current!=chars[i]){
                chars[k] = current;
                k++;
                String temp = Integer.toString(count);
                if(count!=1){
                    for (int j = 0; j < temp.length(); j++) {
                        chars[k] = temp.charAt(j);
                        k++;
                    }
                }
                current = chars[i];
                count=1;
            } else {
                count++;
            }
        }
        chars[k] = current;
        k++;
        String temp = Integer.toString(count);
        if(count!=1){
            for (int j = 0; j < temp.length(); j++) {
                chars[k] = temp.charAt(j);
                k++;
            }
        }
        return k;
    }

}

public class StringCompression {
    public static void main(String[] args) {
        // Test input: ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
        char[] chars = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};

        // Create an instance of the solution and compress the array
        Solution11 solution = new Solution11();
        int newLength = solution.compress(chars);

        // Output the compressed length and array contents (up to newLength)
        System.out.println("Compressed length: " + newLength);
        System.out.print("Compressed array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println();
    }
}
