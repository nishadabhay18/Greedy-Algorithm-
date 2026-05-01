class maximumMatchingOfPlayersWithTrainers {
    // TC->O(m log(m) + n log(n)) SC->O(1)
    public int matchPlayersAndTrainers(int[] child, int[] cookies) {
        int cl = child.length, bl = cookies.length;
        Arrays.sort(child);
        Arrays.sort(cookies);
        int i = 0;
        for(int j = 0; j<bl && i<cl; j++){
            if(child[i] <= cookies[j]) i++;
        }
        return i;
    }
}