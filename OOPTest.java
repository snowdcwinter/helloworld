package com.huowu.java;

public class OOPTest {
    public static void main(String[] args) {
        double v1 = 10;
        double v2 = 11;
        double v3 = maxvalue(v1,v2);
        System.out.println(v3);
    }


    public static double maxvalue(double n1,double n2){
        double mv = 0;
        if(n1>n2){
            mv = n1;
        }else{
            mv = n2;
        }
        return mv;
    }
}
