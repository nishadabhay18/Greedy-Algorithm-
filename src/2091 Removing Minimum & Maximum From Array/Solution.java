class Solution {
    // Think greedily TC-> O(1) SC-> O(1)
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minIdx = 0, maxIdx = 0;
        for(int i=0; i<n; i++){
            if(nums[i] < nums[minIdx]) minIdx = i;
            else if(nums[i] > nums[maxIdx]) maxIdx = i;
        }
        int deleteFromFront = Math.max(minIdx,maxIdx) + 1;
        int deleteFromBack = n - Math.min(minIdx, maxIdx);
        int deleteFromBoth = ( 1 + Math.min(minIdx, maxIdx)) + (n - Math.max(minIdx, maxIdx));
        return Math.min(deleteFromFront, Math.min(deleteFromBack, deleteFromBoth));
    }
}