public class SingleNonDuplicate {

  public int singleNonDuplicate(int[] nums) {
      int holder;
      for (int i = 0; i < nums.length-1; i+=2) {
          holder = nums[i];
          if (holder != nums[i+1]) {
              return holder;
          }
      }
      if (nums.length % 10 != 0) return nums[nums.length-1];
      return 0;
  }

}
