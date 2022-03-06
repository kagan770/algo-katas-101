package com.codesignal.arcade.intro.level2;

import java.util.*;
import java.util.stream.Collectors;

public class MatrixElementsSum {
    public static void main(String[] args){
        int[] i = {1, 2, 1, 2};
        solution(i);
    }
    static boolean solution(int[] sequence) {
        if(sequence.length<2){
            return true;
        }
        if(sequence.length==2){
            return sequence[0] <= sequence[1];
        }
        int negatives = 0;
        List<Integer> growing = new ArrayList<>();
        List<Integer> anomaly = new ArrayList<>();
        for(int i=0; i<sequence.length-1; i++) {
            System.out.println(sequence[i]);
            if (sequence[i+1] - sequence[i] < 0){
                anomaly.add(sequence[i]);
            }else{
                growing.add(sequence[i]);
            }
        }

        String a = growing.stream().map(x->x+"").collect(Collectors.joining(","));
        String b = anomaly.stream().map(x->x+"").collect(Collectors.joining(","));
        return negatives <= 1;
    }


//    static boolean notRepeatable(int[] input){
//        Set<Integer> set = new HashSet<>();
//        for(int i : input){
//            set.add(i);
//        }
//        return (set.size() == input.length);
//    }
}

