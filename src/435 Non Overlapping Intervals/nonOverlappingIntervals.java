class nonOverlappingIntervals {
    // TC->O(n log(n)) SC->O(1)
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> (a[1] - b[1]));
        int st = intervals[0][0], en = intervals[0][1], count = 0;
        for(int i = 1; i<n; i++){
            int s = intervals[i][0], e = intervals[i][1];
            if(en > s) count++;
            else en = e;
        }
        return count;
    }
}