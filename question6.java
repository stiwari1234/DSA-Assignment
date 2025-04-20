
//Algorithm:
//Initialize a pointer left for the left side of the window and maxLength to store the length of the longest substring found.
//Use a hash set charSet to store characters in the current window.
//Iterate through the string with a pointer right:
//If the character at right is not in charSet, add it to charSet and move the right pointer.
//If the character at right is already in charSet, move the left pointer to the right of the previous occurrence of that character.
//Update maxLength after each iteration by checking the size of the window (right - left + 1).
//Return maxLength after processing the entire string.
import java.util.HashSet;

public class question6 {

    public static int longestSubstring(String s) {
        int n = s.length();
        HashSet<Character> charSet = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < n; right++) {
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubstring(s));
    }
}

