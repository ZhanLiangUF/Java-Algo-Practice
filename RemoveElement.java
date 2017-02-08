public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int counter = 0;
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                counter++;
                if (i == 0) {
                    j++;
                } else {
                nums[j] = nums[i];
                j++;
                }
            }
        }
        return counter;
    }
}
