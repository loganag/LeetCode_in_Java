package org.git.loganag._09;

public class Solution {
    public boolean isPalindrome(int x) {
        String stringX = String.valueOf(x);
        StringBuilder reverseStringX = new StringBuilder();

        reverseStringX.append(x);
        reverseStringX.reverse();

        if (stringX.equals(reverseStringX.toString())) {
            return true;
        } else
            return false;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(123111312));

    }
}
