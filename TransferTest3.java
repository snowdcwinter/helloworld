package com.huowu.java;
/*
*值传递机制
* 如果参数是基本数据类型，则实参赋给形参的是实参真实存储的数据值；
* 如果参数是引用数据类型，则实参赋给形参的是实参存储数据的地址值。
* 画下对应的内存图
 */
public class TransferTest3 {
    public static void main(String[] args) {

//        System.out.println(10+' '+15);

        TransferTest3 test = new TransferTest3();
        test.first();
    }

    public void first(){
        int i=5;
        Value v = new Value();
        v.i=25;
        second(v,i);
        System.out.println(v.i);
    }

    public void second(Value v,int i){
        i = 0;
        v.i = 20;
        Value val = new Value();
        v = val;
        System.out.println(v.i+" "+i);
    }
}

class Value{
    int i=15;
}
