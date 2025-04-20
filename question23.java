// Algorithm:
// 1. Use a Trie to store bits of numbers.
// 2. For each number, find the number in Trie that gives max XOR.

import java.util.*;

public class question23 {
    static class TrieNode {
        TrieNode[] children = new TrieNode[2];
    }

    public int findMaximumXOR(int[] nums) {
        TrieNode root = new TrieNode();
        for (int num : nums) {
            TrieNode node = root;
            for (int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;
                if (node.children[bit] == null) node.children[bit] = new TrieNode();
                node = node.children[bit];
            }
        }

        int max = 0;
        for (int num : nums) {
            TrieNode node = root;
            int currXor = 0;
            for (int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;
                if (node.children[1 - bit] != null) {
                    currXor |= (1 << i);
                    node = node.children[1 - bit];
                } else {
                    node = node.children[bit];
                }
            }
            max = Math.max(max, currXor);
        }
        return max;
    }

    public static void main(String[] args) {
        question23 obj = new question23();
        int[] nums = {3, 10, 5, 25, 2, 8};
        System.out.println(obj.findMaximumXOR(nums));
    }
}

// Time Complexity: O(n * 32)
// Space Complexity: O(n * 32)
