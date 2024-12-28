package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CanPlaceFlowers {

    //Code
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int i = 0, count = 1;
        while(i < flowerbed.length){
            if(n == 0){
                return true;
            }

            if(flowerbed[i] == 0){
                count++;
                if(count == 3){
                    n--;
                    count = 1;
                }
            }
            else{
                count = 0;
            }
            i++;
        }

        if(count == 2){
            n--;
        }

        return n == 0;
    }

    int[] myArray = {1, 2, 3, 4, 6};





}
