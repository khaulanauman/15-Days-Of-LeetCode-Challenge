class Solution {
    public String reverseWords(String s) {
        //trim the string
        s = s.trim();
        //change in array
        String[] words=s.split("\\s+");

        //use stringbuilder to construct string
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }
}
