package org.example;

public class Solution {
    public int minDistance(String word1, String word2) {
        if(word1.equals(word2)) return 0;
        return dfs(word1, word2, 0, 0);
    }

    private int dfs(String word1, String word2, int i, int j) {
        if (word1.length() == i && word2.length() == j) {
            return 0;
        }
        if (i >= word1.length()) {
            return word2.length() - j;
        }
        if (j >= word2.length()) {
            return word1.length() - i;
        }
        int result = 0;
        if (word1.charAt(i) != word2.charAt(j)) {
            result = Math.min(dfs(word1, word2, i + 1, j + 1), Math.min(dfs(word1, word2, i + 1, j), dfs(word1, word2, i, j + 1))) + 1;
        }
        if (word1.charAt(i) == word2.charAt(j)) {
            result = dfs(word1, word2, i + 1, j + 1);
        }

        return result;
    }
}
