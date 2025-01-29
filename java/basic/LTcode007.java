class LTcode007 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < nums.length; j++) { 
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        // The new length will be i + 1 because 'i' is the index of the last unique element
        return i + 1;
    }
}