class Solution {
    public boolean isAnagram(String s, String t) {
        //for an anagram to be true both strings should have the same lnegth
        if(s.length()!=t.length())
            return false;
        //now we check how many times each character appears in s-if the frequency of each character matches frequency of charcaters in t: they will be an anagram
        //since s and t only have lowercase alphabtes we use an array of size 26 to store frequencies
         int[] frequencyS = new int[26];
         for (char c : s.toCharArray()) {
            frequencyS[c - 'a']++; 
        }
        int[] frequencyT = new int[26];
         for (char c : t.toCharArray()) {
            frequencyT[c - 'a']++; 
        }
        for (int i = 0; i < 26; i++) {
            if (frequencyS[i] != frequencyT[i]) {
                return false;
            }
        }

        return true; // All frequencies match
    }
}