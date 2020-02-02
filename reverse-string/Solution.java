class Solution {
    public void reverseString(char[] s) {
        int last = s.length - 1;
        int middle = s.length / 2;

        for (int i = 0; i < middle; i++) {
            char temp = s[i];
            s[i] = s[last];
            s[last] = temp;
            last--;
        }
    }
}