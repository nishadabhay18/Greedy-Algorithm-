class Solution {
    // TC-> O(nlogn) SC-> O(1)
    public int minMeetingRooms(int[] start, int[] end) {
        int n = start.length;
        Arrays.sort(start);
        Arrays.sort(end);
        int rooms = 0, maxRooms = 0;
        int i = 0, j = 0;
        while (i < n) {
            if (start[i] < end[j]) {
                rooms++;
                maxRooms = Math.max(maxRooms, rooms);
                i++;
            } else {
                rooms--;
                j++;
            }
        }
        return maxRooms;
    }
}