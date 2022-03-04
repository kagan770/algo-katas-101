package com.codesignal.arcade.intro.level2;

import java.util.*;

public class MatrixElementsSum {
    public static void main(String[] args){
        int[] i = {1, 2, 1, 2};
    }
    static boolean solution(int[] sequence) {
        if (notRepeatable(sequence)==false){
            return false;
        }
        if(sequence.length<2){
            return true;
        }
        if(sequence.length==2){
            return sequence[0] < sequence[1];
        }
        int negatives = 0;
        for(int i=0; i<sequence.length-1; i++) {
            if (sequence[i+1] - sequence[i] < 0){
                negatives++;
            }
        }
        return negatives <= 1;
    }

    static boolean notRepeatable(int[] input){
        Set<Integer> set = new HashSet<>();
        for(int i : input){
            set.add(i);
        }
        return (set.size() == input.length);
    }
}

