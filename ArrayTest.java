package com.huowu.java;

public class ArrayTest {
    public static void main(String[] args) {
        int[][] arr2 = new int[3][];
        System.out.println(arr2[2]);

        int[][] arr1 = new int[3][4];
        System.out.println(arr1[0]);

        int[][] arr = new int[][]{{1,2,3},{4,6}};
        System.out.println(arr[1][1]);
        System.out.println(arr[0][2]);
    }

}
