class Solution {
    public int search(int[] nums, int target) {

        int left, mid, right;
        left = 0;
        right = nums.length;
        mid = (left+right)/2;

        while(left < right){
            if (nums[mid] == target){
               return mid; 
            }
            else if (nums[mid] > target){
                right = mid;
                mid = (left + right)/2;
            }
            else{
                left = mid + 1;
                mid = (left + right)/2;
            }
        }

        return -1;
    }
}
