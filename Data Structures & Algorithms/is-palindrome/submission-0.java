class Solution {//ana
    public boolean isPalindrome(String s) {
        String cleanStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start=0;
        int end =cleanStr.length()-1;
        System.out.println(cleanStr);
        while (start<end){
            if(cleanStr.charAt(start)==cleanStr.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}
