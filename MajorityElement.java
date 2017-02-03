import java.util.*;
public class MajorityElement {
  public static void main(String[] args) {
    int[] nums = {-1,1,1,1,1,2,1};
    majorityElement(nums);
  }
  public int majorityElement(int[] nums) {
      Map<Integer,Integer> elementsMap = new HashMap<Integer,Integer>();
      int length = nums.length;
      int biggestKey = 0;
      int biggestValue = 0;
      for(int i = 0;i<length;i++) {
          if (elementsMap.get(nums[i]) != null) {
              int temp = elementsMap.get(nums[i]);
              temp += 1;
              elementsMap.put(nums[i], temp);
          } else {
              elementsMap.put(nums[i],1);
          }
      }
      // Loop through Hashmap and have two global variables hold key and value of the biggest value
      for (Map.Entry<Integer, Integer> entry : elementsMap.entrySet()) {
          if (biggestValue < entry.getValue() || biggestValue == 0) {
              biggestKey = entry.getKey();
              biggestValue = entry.getValue();
          }
      }
      return biggestKey;
  }
}
