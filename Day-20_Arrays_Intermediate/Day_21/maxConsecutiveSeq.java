import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLength = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int ele : set) {
            if(!set.contains(ele-1)){
                int currEle = ele;
                int count  = 1;
                while(set.contains(currEle+1)){
                    count++;
                    currEle++;
                }
                maxLength = Math.max(maxLength,count);
            }
        }
        return maxLength;
    }
    
}