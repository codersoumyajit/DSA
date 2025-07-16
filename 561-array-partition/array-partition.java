// import java.util.*;
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int s=0,i;
        for(i=0;i<nums.length;i=i+2)
        {
            s=s+nums[i];
        }
        return s;
        
    }
}