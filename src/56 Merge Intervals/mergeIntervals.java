class mergeIntervals {
    // TC->O(n log(n)) SC->O(n)
    public int[][] merge(int[][] intervals){
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        List<List<Integer>> list = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            int s = intervals[i][0];
            int e = intervals[i][1];
            if(end >= s) end = Math.max(end, e);
            else{
                list.add(Arrays.asList(start, end));
                start = s;
                end = e;
            }
        }
        list.add(Arrays.asList(start, end));
        int[][] res = new int[list.size()][2];
        for(int i = 0; i<list.size(); i++) {
            res[i][0] = list.get(i).get(0);
            res[i][1] = list.get(i).get(1);
        }
        return res;
    }
}