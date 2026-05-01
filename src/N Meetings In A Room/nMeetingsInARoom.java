class nMeetingsInARoom {
    // Function to find the maximum number of meetings that can be performed in a meeting room.
    // TC->O(n log(n)) SC->O(n)+O(log(n))
    public int maxMeetings(int start[], int end[]){
        int n = start.length;
        int[][] meetings = new int[n][2];
        for(int i = 0; i<n; i++){
            meetings[i][0] = start[i];
            meetings[i][1] = end[i];
        }
        Arrays.sort(meetings, (a,b) -> (a[1] - b[1])); // TC->O(n log(n)) SC->O(log(n))
        int count = 1, st = meetings[0][0], en = meetings[0][1];
        for(int i = 1; i<n; i++){
            int s = meetings[i][0], e = meetings[i][1];
            if(en < s){
                count++;
                en = e;
            }
        }
        return count;
    }
}
