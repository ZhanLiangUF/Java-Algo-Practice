public class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        int a = 0;
        for(int b = 1; b < nums.length; b++) {
            if (nums[a] != nums[b]) {
                nums[a+1] = nums[b];
                a++;
            }
        }
        return a+1;
    }
}
