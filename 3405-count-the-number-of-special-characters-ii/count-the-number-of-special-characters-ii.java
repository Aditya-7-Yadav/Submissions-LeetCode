class Solution {
    public int numberOfSpecialChars(String w) {
        int ans = 0;
        int[] up = new int[26];
        int[] low = new int[26];
        for (int i = 0; i < 26; i++) {
            low[i] = -1;
            up[i] = -1;
        }
        for (int i = 0; i < w.length(); i++) {
            char ch = w.charAt(i);
            if (Character.isUpperCase(ch)) {
                if (up[ch - 'A'] == -1)
                    up[ch - 'A'] = i;
            } else
                low[ch - 'a'] = i;
        }
        for (int i = 0; i < 26; i++) {
            if (up[i] != -1 && low[i] != -1) {
                if (up[i] > low[i])
                    ans++;
            }
        }
        return ans;
    }
}