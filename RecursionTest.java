package com.huowu.java;


/*
* 递归(倒序思维）
 */
public class RecursionTest {
    public static void main(String[] args) {
        int n = 10;
        RecursionTest r = new RecursionTest();
        double stime = System.currentTimeMillis();
        //System.out.println(r.getSum(n));
        System.out.println(r.getSum1(n));
        System.out.println(System.currentTimeMillis()-stime);
    }

    //计算1-n个自然数的和
    public int getSum(int n){
        if(n==1){
            return 1;
        }else{
            return n+getSum(n-1);
        }
    }

    //已有一个数列：f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n),其中n是大于0的整数，求f(10)的值
    public int getSum1(int n){
        if(n==0){
            return 1;
        }else if(n==1){
            return 4;
        }else{
            return 2*getSum1(n-1)+getSum1(n-2);
        }
    }
}
