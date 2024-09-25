package org.example;

import java.util.List;

public class KidWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        Boolean [] result = new Boolean[candies.length];
        int maxCandies = 0;

        for(int i=0; i<candies.length; i++) {

            if (candies[i] > maxCandies) {
                maxCandies = candies[i];

            }

            for (int j = 0; j < candies.length; j++) {

                if(candies[j] + extraCandies >= maxCandies) {
                    result[j] = true;
                } else {
                    result[j] = false;
                }

            }
        }
        return List.of(result);
    }
}
