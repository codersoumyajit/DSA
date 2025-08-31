class Solution {
    public int maxPower(String s) {
        if(s.length() == 0|| s == null){
            return 0;
        }
        int maxStreak = 1, currentStreak = 1;
        for(int i = 1; i< s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)){
                currentStreak++;
            }
            else{
                currentStreak = 1;
            }
            maxStreak = Math.max(maxStreak, currentStreak);
        }
        return maxStreak;
    }
}