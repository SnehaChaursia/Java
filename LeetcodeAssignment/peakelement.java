// Input: nums = [1,2,3,1]
// Output: 2
// Explanation: 3 is a peak element and your function should return the index number 2.
// Example 2:
// Input: nums = [1,2,1,3,5,6,4]
// Output: 5
// Explanation: Your function can return either index number 1 where the peak element is 2,
// or index number 5 where the peak element is 6.
// Constraints:
// ● 1 <= nums.length <= 1000
// ● -2
// 31 <= nums[i] <= 2
// 31
// - 1
// ● nums[i] != nums[i + 1] for all valid i.

package LeetcodeAssignment;

public class peakelement {
    public static int solution(int []nums){
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]>nums[i+1]){
                return i;            }
        }
        return nums.length-1;
    }
    public static void main(String[] args) {
        int []nums={1,2,3,1};
        System.out.println(solution(nums));
    }
}
// output : 2