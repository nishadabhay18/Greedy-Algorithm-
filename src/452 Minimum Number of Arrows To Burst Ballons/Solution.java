class Solution {
    // TC-> O(n log n) SC-> O(1)
    public int findMinArrowShots(int[][] points) {
        int n=points.length;
        // Arrays.sort(points, (a,b) -> (a[1] - b[1])); negative overflow
        Arrays.sort(points, (a,b) -> Integer.compare(a[1], b[1]));
        long st=points[0][0], en=points[0][1];
        int arrows=1;
        for(int i=1;i<n;i++){
            long s=points[i][0], e=points[i][1];
            if(en<s){
                arrows++;
                en=e;
            }
        }
        return arrows;
    }
}