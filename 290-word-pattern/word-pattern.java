import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(pattern.length() != arr.length) {
            return false;
        }   
        HashMap<Character, String> hm = new HashMap<>();
        
        for(int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
        
            if(hm.containsValue(arr[i]) && !hm.containsKey(ch)) {
                return false;
            }
    
            if(hm.containsKey(ch) && !hm.get(ch).equals(arr[i])) {
                return false;
            }
            
      
            hm.put(ch, arr[i]);
        }
        
        return true;
    }
}
