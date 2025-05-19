class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1){
           return nums[0];   
        }else{
        int count =0;
        int candidate = 0;
        for(int num:nums){
            if(count ==0){
                candidate = num;
            }
            count+=(num == candidate)?1:-1;
        }
        return candidate;
    }
    }
}


initialize two variables count and candidate as 0 initially
-> traverse through the array
-> if count is zero then the candidate = 0 is replaced with num and increase the count if num and candidate are equal else decrement count 
-> finally return the candidate.
