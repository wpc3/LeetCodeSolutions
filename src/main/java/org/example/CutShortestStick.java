package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CutShortestStick {
    public static List<Integer> cutTheSticks(List<Integer> arr) {
        // Write your code here
        List<Integer> amountOfSticks = new ArrayList<>();


        do {
            amountOfSticks.add(arr.size());
            int min = Collections.min(arr);
            arr.removeIf(n-> (n == min));

        }
        while (arr.size()>=1);



        return amountOfSticks;
    }
}
