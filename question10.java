//Algorithm:
//
//Use backtracking to generate all permutations.
//At each step, swap characters and recursively generate permutations of the remaining characters.
//If the entire string is used, add the permutation to the result.
import java.util.*;

public class question10{
    public static List<String> permute(String s) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), s, new boolean[s.length()]);
        return result;
    }

    private static void backtrack(List<String> result, StringBuilder current, String s, boolean[] used) {
        if (current.length() == s.length()) {
            result.add(current.toString());
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (used[i]) continue;
            used[i] = true;
            current.append(s.charAt(i));
            backtrack(result, current, s, used);
            used[i] = false;
            current.deleteCharAt(current.length() - 1);
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(permute(s));
    }
}
//Time Complexity: O(n!)

