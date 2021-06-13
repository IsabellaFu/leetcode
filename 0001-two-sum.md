# HashMap 

class Solution {
    public int[] twoSum(int[] nums, int target) {
     Map <Integer, Integer> map = new HashMap <> ();

        for(int i = 0; i < nums.length; i ++){
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i],i);
        }
            
            return new int[2];
        }
}

# brute force

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

