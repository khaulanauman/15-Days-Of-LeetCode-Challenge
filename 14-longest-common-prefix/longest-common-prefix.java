class Solution {
    public String longestCommonPrefix(String[] strs) {
        //assuming the first string is the prefix
        String prefix=strs[0];
        //2 pointers?
        //compare each string to prefix
        for(String current: strs){
            int j=0;
            //the only go forward if charachter matches condition
            while (j < prefix.length() && j < current.length() && prefix.charAt(j) ==     current.charAt(j))
                j++;
        //Updating the prefix to the matched part
        prefix=prefix.substring(0,j);
        }
        if (prefix.isEmpty()) {
                return "";
            }
        return prefix;
        
    }
}