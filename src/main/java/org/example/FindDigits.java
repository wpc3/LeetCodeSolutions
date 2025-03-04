package org.example;

public class FindDigits {

    public static int findDigits(int n) {
        // Write your code here


        int[] digits = Integer.toString(n).chars().map(c -> c-'0').toArray();

        int counter = 0;

        for (int i = 0; i < digits.length; i++){
            if (digits[i] != 0 && n % digits[i] == 0){
                counter ++;
            }
        }

        return counter;

    }

}
