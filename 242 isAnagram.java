/*
给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词
*/
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>map = new HashMap();
        char []cs = s.toCharArray();
        char []ct = t.toCharArray();
        if(cs.length!=ct.length) return false;
        int []sCounts = new int[26];
        for(char s1:cs){
            sCounts[s1-'a']++;
        }
        for(char s2:ct){
            sCounts[s2-'a']--;
            if(sCounts[s2-'a']<0) return false;
            }
        for(int i:sCounts){
            if(i != 0)
                return false;
        }
        return true;
    }
}
