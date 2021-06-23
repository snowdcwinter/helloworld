package com.huowu.java;

public class YangHuiSanJiao {
    public static void main(String[] args) {
        /*
        int n = 10;
        int[][] a = new int[n][n];
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=i;j++){
                if((j == 0) || (j == i)){
                    a[i][j] = 1;
                }else{
                    a[i][j] = a[i-1][j-1]+a[i-1][j];
                }

            }
        }
        */
        int n = 10;
        int[][] yanghui = new int[n][];
        for(int i=0;i<=yanghui.length-1;i++){
            yanghui[i] = new int[i+1];
            for(int j=0;j<yanghui[i].length;j++){
                if(j==0 || j==i){
                    yanghui[i][j] = 1;
                }else{
                    yanghui[i][j] =  yanghui[i-1][j-1]+yanghui[i-1][j];
                }

            }
        }
        for(int i=0;i<=n-1;i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(yanghui[i][j]+" ");
            }
            System.out.println();
        }
    }
}
