class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=s.length())return false;
       char sArray[] = s.toCharArray();
       char tArray[] = t.toCharArray();
       Arrays.sort(sArray);
       Arrays.sort(tArray);
       if(new String(sArray).equals(new String(tArray))){
            return true;
       }else{
            return false;
       }
    }
}
