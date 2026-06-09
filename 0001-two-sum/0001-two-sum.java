class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res =new int[2];
        int n=nums.length;
        Map<Integer,Integer> hm = new HashMap();
        for(int i=0;i<n;i++){
            int b=target- nums[i];
            if(hm.containsKey(b)){
                res[0]=hm.get(b);
                res[1]=i;
                return res;
            }
            else{
                hm.put(nums[i],i);
            }
            }
      return res; 
}
}