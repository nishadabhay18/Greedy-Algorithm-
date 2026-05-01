class insertIntervals {
    // TC->O(n) SC->O(n)
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        List<List<Integer>> res = new ArrayList<>();
        int i = 0;
        while(i < n && newInterval[0] > intervals[i][1]){
            res.add(new ArrayList<>(List.of(intervals[i][0], intervals[i][1])));
            i++;
        }
        while(i < n && newInterval[1] >= intervals[i][0]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        res.add(new ArrayList<>(List.of(newInterval[0], newInterval[1])));
        while(i < n){
            res.add(new ArrayList<>(List.of(intervals[i][0], intervals[i][1])));
            i++;
        }
        int m = res.size();
        int[][] ans = new int[m][2];
        for(int j = 0; j<m; j++){
            ans[j][0] = res.get(j).get(0);
            ans[j][1] = res.get(j).get(1);
        }
        return ans;
    }
}