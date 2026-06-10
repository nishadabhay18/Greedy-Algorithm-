class Solution {
    // Tc-> O(nlogn) SC-> O(1)
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        // Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        Arrays.sort(intervals, (a, b) -> {
            if(a[0] == b[0]) return b[1] - a[1];
            return a[0] - b[0];
        });
        int count = 0, prevEnd = 0;
        for(int i=0; i<n; i++){
            int st = intervals[i][0], en = intervals[i][1];
            if(en > prevEnd){
                count++;
                prevEnd = en;
            }
        }
        return count;
    }
}