class Solution {
    public int findMax(int score[]){
        int max = Integer.MIN_VALUE;
        for(int element:score){
            max=Math.max(max,element);
        }
        return max;
    }
    public String[] findRelativeRanks(int[] score) {

        int maxVal = findMax(score);
        int map[] = new int[maxVal+1];
        int n=score.length;

        for(int i =0; i<n; i++){
            map[score[i]] = i+1;
        }
        String res[]= new String[n];
        int rank=1;
        for(int i =maxVal;i>=0;i--){
            if(map[i]!=0){
                int orignalIndex = map[i]-1;
                if(rank == 1){
                    res[orignalIndex] = "Gold Medal";
                }else if(rank ==2){
                    res[orignalIndex] = "Silver Medal";
                }else if(rank == 3){
                    res[orignalIndex] = "Bronze Medal";
                }else{
                    res[orignalIndex] = Integer.toString(rank);
                }
                rank++;
            }
            if(rank>n) break;
        }
        return res;

        
    }
}