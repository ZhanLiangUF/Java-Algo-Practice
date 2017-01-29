// Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
//
// Find all the elements of [1, n] inclusive that do not appear in this array.
//
// Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.



// Proposed solution: Transform array into hashMap with key = nums[1]...nums[nums.length] and value is the count
// For loop through 1-nums.length and if hashMap does not contain key append that value to any array
import java.util.*;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;

public class NumbersDisappearedInArray {
  public List<Integer> findDisappearedNumbers(int[] nums) {
    //instantiate hashmap to hold all the numbers in array
    Map holdNumbers = new HashMap();
    int length = nums.length;
    List<Integer> returnedList = new ArrayList<Integer>();
    //loop through array
    for(int i = 0; i < length; i++) {
      holdNumbers.put(nums[i], nums[i]);
    }
    for(int i = 1; i < length + 1; i++) {
      if(holdNumbers.get(i) == null) {
        returnedList.add(i);
      }
    }
    return returnedList;
  }
}
