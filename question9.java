//Algorithm:
//
//If the list of strings is empty, return an empty string.
//Take the first string in the list as the initial prefix.
//Compare the prefix with each string in the list. If the prefix does not match, reduce the prefix by removing characters from the end until the prefix matches the current string.
//Repeat the process until the entire list is traversed or the prefix becomes an empty string.
//Return the longest common prefix.
public class question9 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
//Time Complexity:O(n*m)

