class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while ( start <= end ) {
            int mid = start + ( end - start ) / 2;

            if ( nums[mid] == target) {
                return mid;
            }

            if ( nums[start] <= nums[mid] ) { //left sorted
                if ( target >= nums[start] && nums[mid] > target) {
                    end = mid - 1; //we will check in left side
                }

                else {
                    start = mid + 1;
                }
            }

            else {
                if ( target > nums[mid] && nums[end] >= target ) {
                    start = mid + 1;
                }

                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
