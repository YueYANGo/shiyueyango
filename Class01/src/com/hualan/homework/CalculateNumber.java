package com.hualan.homework;

import java.util.Scanner;

public class CalculateNumber {


    public static void main(String[] args) {
/*        2.在上面的模块里,在com.hualan包里创建一个CalculateNumber类，在类的main方法里编写代码,
                实现如下功能:
        (1)提示用户输入2个整数.
        (2)计算2个数的和,计算2个数的差，计算2个数的乘积，计算2个数的商,计算2个数的余数.
        (3)打印和,差,积,商,余数.
                提示:整数除以整数结果只保留整数部分，无法出现小数，如果想得到小数，需要把除数或者被
        除数转换为小数在进行计算.*/

        System.out.println("请输入两个整数:");
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入整数1:");
        int num1 = sc.nextInt();
        System.out.print("请输入整数2:");
        int num2 = sc.nextInt();

        //和
        int sum = num1 + num2;
        //差
        int sub = num1 - num2;
        //乘
        int mul = num1 * num2;
        //除
        int div = num1 / num2;
        //有小数的除法
        double div1 = (double) num1 / num2;
        //取余
        int mod = num1 % num2;


        //输出
        System.out.println("加法结果:"+sum);
        System.out.println("减法结果:"+sub);
        System.out.println("乘法结果:"+mul);
        System.out.println("除法结果:"+div);
        System.out.println("除法结果带小数:"+div1);
        System.out.println("取余结果:"+mod);





    }
}
