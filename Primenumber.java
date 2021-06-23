package com.huowu.java;

public class Primenumber {
    public static void main(String[] args) {
        int n = 10000;
        double start = System.currentTimeMillis();
        int count = 0;
        for(int i=2;i<=n;i++){
            boolean isflag = true;
            for(int j=2;j<=Math.sqrt(i);j++) {
                if(i%j == 0){
                    //System.out.println(i%j+" "+i+" "+j);
                    isflag = false;
                    break;
                }
            }
            if(isflag==true){
                System.out.println(i);
                count++;
            }

        }
        System.out.println("耗时："+(System.currentTimeMillis()-start));
        System.out.println("共有质数："+count);
    }
}
