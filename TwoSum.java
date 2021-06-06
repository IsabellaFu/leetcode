// brute force
class TwoSum{
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        int j,i;

        for(i = 0;i<size;i++){
            for(j = i+1;j<size;j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

