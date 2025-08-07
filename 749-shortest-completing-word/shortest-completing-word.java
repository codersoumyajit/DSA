class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate = licensePlate.toLowerCase();
        int[] cnt = new int[26];
        for(char c: licensePlate.toCharArray()){
            if(Character.isLetter(c)){
                cnt[c-'a']++;
            }
        }
        int minWordLength = Integer.MAX_VALUE;
        String res = null;
        for(String word: words){
            if(isMatch(word, cnt) && word.length() < minWordLength){
                minWordLength = word.length();
                res = word;
            }
        }
        return res;
    }

    public boolean isMatch(String word, int[] target){
        int[] cnt = new int[26];
        for(char c: word.toCharArray()){
            cnt[c-'a']++;
        }
        for(int i= 0; i < 26; i++){
            if(cnt[i] != target[i] && cnt[i] < target[i]){
                return false;
            }
        }
        return true;
    }
}