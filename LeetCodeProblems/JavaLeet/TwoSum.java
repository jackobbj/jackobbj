// By Jack Hodges 31/07/2021
// Puzzle reference: https://leetcode.com/problems/two-sum/
package LeetCodeProblems.JavaLeet;
import java.util.HashMap;
public class TwoSum {
    /**A solution of the Two Sum problem defined as:
     * 
     * "Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order."
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> tracker = new HashMap<Integer,Integer>(); // stores element pair to achieve target
        for (int i=0; i <nums.length; i++){
            if (tracker.containsKey(nums[i])){
                int[] x = {i,tracker.get(nums[i]).intValue()};
                return x;
            };
            tracker.put(target-nums[i], i); 
        };
        return null; // needed to compile but not needed to work
    }
  };