/** Background time and space complexity */

//1. Asymptotic Notations
//https://www.geeksforgeeks.org/analysis-of-algorithms-set-3asymptotic-notations/
// https://www.studytonight.com/data-structures/time-complexity-of-algorithms

//2. Space complexity:
//https://www.studytonight.com/data-structures/space-complexity-of-algorithms

/** GeeksforGeeks Analysis */
// https://www.geeksforgeeks.org/find-the-element-that-appears-

/** XOR Operator */
// https://www.baeldung.com/java-xor-operator

/** Bitwise operator */
// https://www.baeldung.com/java-bitwise-operators

//Here's the reason why it works. 1) XOR is commutative, a ^ b = b ^ a.
// 2) a number XOR by another number twice makes no change on original number, a ^ b ^ b = a
//Therefore, if a number appears twice in the array, it makes no change to result. And if a number is unique, since 0 ^ unique = unique,
// so result = unique

//extra space complexity: x,i;

/**
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        int[] a = nums;
        for (int i = 0;i<nums.length;i++){
            res = res^a[i];

        }

        return res;

    }
}
*/

class Solution {
 public int singleNumber(int[] nums) {
 int res = 0;
 for(int n:nums)
 {
 // 异或
 res ^= n;
 }
 return res;
 }
 }
