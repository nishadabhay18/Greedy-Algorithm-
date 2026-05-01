class candy {
    // TC->O(3N) SC->O(2N)
     public int candy(int[] ratings) {
         int n = ratings.length;
         int[] left = new int[n];
         int[] right = new int[n];
         left[0] = 1; right[n-1] = 1;
         for(int i = 1; i<n; i++){
             if(ratings[i] <= ratings[i-1]) left[i] = 1;
             else left[i] = left[i-1] + 1;
         }
         for(int i = n-2; i >= 0; i--){
             if(ratings[i] <= ratings[i+1]) right[i] = 1;
             else right[i] = right[i+1] + 1;
         }
         int minCandy = 0;
         for(int i = 0; i<n; i++){
             minCandy += Math.max(left[i], right[i]);
         }
         return minCandy;
     }

    // TC->O(3N) SC->O(N)
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] left = new int[n];
        left[0] = 1;
        for(int i = 1; i<n; i++){
            if(ratings[i] <= ratings[i-1]) left[i]=1;
            else left[i] = left[i-1]+1;
        }
        int right = 1, sum = 0;
        sum = Math.max(left[n-1], 1);
        for(int i = n-2; i >= 0; i--){
            if(ratings[i] <= ratings[i+1]) right=1;
            else right++;
            sum += Math.max(right, left[i]);
        }
        return sum;
    }
}