public boolean containsDuplicate(int[] nums) {
    HashMap<Integer, Integer> countDuplicates = new HashMap<Integer, Integer>();
    for (int number : nums) {
        if (countDuplicates.get(number) != null) {
            return true;
        }
        countDuplicates.put(number,number);
    }
    return false;
}
