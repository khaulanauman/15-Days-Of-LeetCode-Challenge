class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        int index;
        for (char c : s.toCharArray()) {
            index=c-'a';
            freq[index]=freq[index]+1;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i; 
            }
        }

        return -1;
    }
}
