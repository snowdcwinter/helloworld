package com.huowu.java;

public class OverloadTest {
    public static void main(String[] args) {
        aa a = new aa();
        a.showinfo("world","china");
    }

}

class aa {
    //可变参数也只能是多个同类型的参数
    public void showinfo(String... strs) {
        System.out.println("可变参数");
    }

}