package com.huowu.java;

/*
*随机生成20个学生对象，具有学号、年级、成绩属性
*随机生成学生的年级和成绩
*使用冒泡法对学生成绩进行排序
*
*/

public class StudentTest {
    public static void main(String[] args) {
        student[] stus = new student[20];

        for(int i=0;i<stus.length;i++){
            stus[i] = new student();
            stus[i].number = i+1;
            stus[i].state = (int)(Math.random()*(6-1+1)+1);
            stus[i].score = (int)(Math.random()*(100-0+1)+1);
            System.out.println(stus[i].showinfo());
        }

        for(int i=0;i<stus.length-1;i++){
            for (int j=0;j<stus.length-1-i;j++){
                if(stus[j].score>stus[j+1].score){
                    int temp = stus[j].score;
                    stus[j].score = stus[j+1].score;
                    stus[j+1].score = temp;
                }
            }
        }

        System.out.println("*************************");
        for(int i=0;i<stus.length;i++){
            System.out.println(stus[i].showinfo());
        }
    }


}



class  student{
    int number;
    int state;
    int score;

    /**
     * @author Jane Chan
     * @Description print infomation of student
     *
     */
    public String showinfo(){
        return "学号："+number+"；年级："+state+"；成绩："+score;
    }



}