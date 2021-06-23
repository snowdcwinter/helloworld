package com.huowu.java;

import java.util.Scanner;

public class StudentGrade {
    /**
     * 从键盘读入学生成绩，找出最高分，并输出学生成绩等级；
     * 成绩>=最高分-10，等级为A
     * 成绩>=最高分-20，等级为B
     * 成绩>=最高分-30，等级为C
     * 其他，等级为D
     *
     * @author Jane Chan
     *
     */
    public static void main(String[] args) {

        System.out.println("录入成绩开始");


        int n = 0;
        int stunum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("请录入学生个数");
        while(scan.hasNextInt()){
            stunum = scan.nextInt();
            break;
        }

        double[] a = new double[stunum];
        while(n<stunum){   //scan.hasNextDouble()
            System.out.println("请输入第"+(n+1)+"位学生成绩：");
            a[n] = scan.nextDouble();
            n++;

        }

        double maxnum = 0;
        for(double element:a){
            if(element>maxnum){
                maxnum = element;
            }
        }
        char level = 'D';
        for (double element:a){
            if(element>(maxnum-10)){
                level='A';
            }else if(element>(maxnum-20)){
                level='B';
            }else if(element>(maxnum-30)) {
                level='C';
            }else{
                level='D';
            }
            System.out.println("Score："+element+",Grade:"+level);
        }

    }

}
