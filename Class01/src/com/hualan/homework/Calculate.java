package com.hualan.homework;

import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {
 /*       2.在上面的模块里, 在com.hualan包里创建一个Calculate类, 在类的main方法里编写代码, 实现如下功
        能:
        (1) 提示用户输入一个整数.
        (2) 计算输入的整数是奇数还是偶数(借助三目运算符).
                提示: 可以定义一个String变量来保存三目运算的结果*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int num = sc.nextInt();
        System.out.println("该数是:"+ (num%2 == 0? "偶数":"奇数"));





    }
}
