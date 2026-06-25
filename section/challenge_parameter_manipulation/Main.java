package com.example;
import java.util.Arrays;

public class Main {
    public static int[] manipulateArray(int[] array, int multiplyBy, int addValue) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] * multiplyBy + addValue;
        }
        return result;
    }

    public static void main(String[] args) {
       
        int[] transformed = manipulateArray(new int[]{1, 2, 3}, 2, 1);
        System.out.println(Arrays.toString(transformed));
    }
}