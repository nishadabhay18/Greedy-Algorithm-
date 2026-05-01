class assignCookies {
    public int findContentChildren(int[] children, int[] cookie) {
        int m=children.length, n=cookie.length;
        Arrays.sort(children); Arrays.sort(cookie);
        int i=0;
        for(int j=0;j<n && i<m;j++){
            if(children[i]<=cookie[j]) i++;
        }
        return i;
    }
}