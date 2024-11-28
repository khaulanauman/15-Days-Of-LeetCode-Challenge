class Solution {
    public int strStr(String haystack, String needle) {
        int needleLength = needle.length();
        int haystackLength = haystack.length();
        //because we have to find just the first needle 
        for (int i = 0; i <= haystackLength-needleLength; i++) {
            // Check if substring matches the needle
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i; // Return the starting index of the match
            }
        }

        return -1; 
    }
}