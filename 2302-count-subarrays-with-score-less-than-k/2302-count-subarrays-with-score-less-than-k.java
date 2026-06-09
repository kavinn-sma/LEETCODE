class Solution {
    public long countSubarrays(int[] n, long k) {
        int l=0;
        long sum=0,cnt=0;
        for(int r=0;r<n.length;r++){
            sum+=n[r];
            while((sum*(r-l+1L))>=k){
                sum-=n[l];
                l++;
            }
            cnt+=(r-l+1);
        }
        return cnt;
    }
}