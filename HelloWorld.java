package com.huowu.java;

public class HelloWorld {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        System.out.print( mySum(a));
        //string[] s=new string[10];
/*
        int[] arr = new int[10];
        arr[1] = 4;
        arr[2] = 6;
        int total=0;
        for(int element:arr){
            total+=element;
        }
        //return args;
        System.out.print("总数为："+ total);
*/
    }


    public static int mySum(int[] arr){
        for(int element:arr){
            System.out.println(element);
        }
        return 0;
    }
}
