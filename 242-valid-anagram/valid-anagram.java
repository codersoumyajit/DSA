class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        if (s.length() != t.length()) {
    return false;
}
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(map1.containsKey(ch)){
                map1.put(ch, map1.get(ch)+1);
            }
            else{
                map1.put(ch, 1);
            }
        }
        for(int j = 0; j < t.length(); j++){
            char ch = t.charAt(j);
            if(map2.containsKey(ch)){
                map2.put(ch, map2.get(ch)+1);
            }
            else{
                map2.put(ch, 1);
            }
        }
        if (map1.equals(map2)){
            return true;
        }else{
            return false;
        }
         
    }
}