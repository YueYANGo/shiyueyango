package com.hualan.homework;

public class PrintMyInfo {

    public static void main(String[] args) {


        /*
        * 作业1
        * 通过idea创建一个名为Homework02的模块,在com.hualan包里创建一个PrintMylnfo类，在类的
        *main方法里面分别通过System.out.println(语句输出自己的姓名,性别,年龄,身高(小数),爱好
        *
        * */

        String name = "YueYang";
        char sex = '男';
        int age = 22;
        double height = 1.74;
        String[] hobby = new String[]{"play games", "listen to music ", "coding"};

        System.out.println("这是我的个人信息:");
        System.out.println("姓名:"+name);
        System.out.println("性别:"+sex);
        System.out.println("年龄:"+age);
        System.out.println("身高:"+height);
        for(String h : hobby){
            System.out.println("我的爱好有:"+h);
        }
















    }
}
