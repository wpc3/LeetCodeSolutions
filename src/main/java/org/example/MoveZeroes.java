package org.example;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;

        for(int num: nums){
            if(num != 0){
               nums[nonZeroIndex] = num;
               nonZeroIndex++;

            }
        }

        for(int i = nonZeroIndex; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}