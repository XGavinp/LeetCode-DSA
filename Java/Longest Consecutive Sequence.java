class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);

        if(n< 2) 
            return n;

        int cnt=1;
        int max=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            else if(nums[i]-1 != nums[i-1]){
                cnt=1;
            }
            else{
                cnt++;
                if(cnt>max) 
                    max=cnt;
            }
        }
        return max;
    }
}