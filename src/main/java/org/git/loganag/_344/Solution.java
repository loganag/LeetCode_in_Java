package org.git.loganag._344;

public class Solution {
    public void reverseString(char[] s) {
        char tmp;
        for (int i = 0; i < s.length / 2; i++) {
            tmp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = tmp;
        }

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] s = {'a', 'b', 'c', 'a', 'b', 'c'};
        solution.reverseString(s);
    }


}
