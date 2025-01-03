// Given an array of integers nums sorted in non-decreasing order, find the starting and
// ending position of a given target value.
// If the target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.
// Example 1:
// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Example 2:
// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]
// Example 3:
// Input: nums = [], target = 0
// Output: [-1,-1]
// Constraints: 0 <= nums.length <= 10
package LeetcodeAssignment;
import java.util.Arrays;
class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int arr[] = {-1, -1}; 

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                arr[0] = i;  
                break;      
            }
        }
        
   
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                arr[1] = i; 
                break;       
            }
        }
        
        return arr;  
    }

    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 2, 3, 5, 7, 7, 8}; 
        int target = 7; 
        
        System.out.println(Arrays.toString(searchRange(nums, target))); 
    }
}
