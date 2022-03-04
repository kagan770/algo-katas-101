package com.codesignal.arcade.intro.level2;

public class AdjacentElementsProduct {

    //18:41-18;46
    int solution(int[] inputArray) {

        int maxElement = Integer.MIN_VALUE;
        for(int i=0;i<inputArray.length-1;i++){
            int product = inputArray[i]*inputArray[i+1];
            maxElement = Math.max(maxElement, product);
        }
        return maxElement;
    }
}
