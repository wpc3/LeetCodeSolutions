package org.example;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
//        ArrayList<Integer> removedDuplicates = new ArrayList<Integer>();

        int uniqeIndex = 1;

        for(int i = 1; i < nums.length; i++){

            if(nums[i] != nums[i-1]){
                nums[uniqeIndex] = nums[i];
                uniqeIndex++;
            }

        }

        return uniqeIndex;

    }
}
