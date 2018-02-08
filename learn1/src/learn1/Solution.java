package learn1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    private String[] alpha = new String[] {
            " ",
            "1", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
    };
    private StringBuilder word;

    private void dfs(List<String> res, String digits, int cur) {
        if (cur >= digits.length()) {
            res.add(word.toString());
        } else {
            for (int i = 0; i < alpha[digits.charAt(cur) - '0'].length(); ++i) {
                word.append(alpha[digits.charAt(cur) - '0'].charAt(i));
                dfs(res, digits, cur + 1);
                word.deleteCharAt(word.length() - 1);
            }
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> ret = new ArrayList<String>();
        word = new StringBuilder();
        dfs(ret, digits, 0);
        return ret;
    }
}