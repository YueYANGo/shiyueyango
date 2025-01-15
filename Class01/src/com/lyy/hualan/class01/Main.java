package com.lyy.hualan.class01;



// 单行注释

/*
*
* 多行注释
*
* 注释的主要作用就是解释理解
*
* 注释不是越多越好 也不是越少越好。  简易注释关键信息
*
* */

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @version 1.0.1
 * @author YueYangOVO
 * 文档注释  这个注释前面有两个星号
 * 多行注释是后面有两个星号

 *
 *
 */




public class Main {

    public static void main(String[] args) {

        /*
        * printf 用来输出特定格式的字符串
        * %d  整数有正负数，不能输出浮点数
        * %f 代表一个小数， 默认输出6位小数，不足补上0.
        * %.2f 代表这个输出小数点后两位的浮点数
        * %s 代表一个字符串
        *常见转义字符
        * \n 换行
        * \t 制表符 tap键 一个tap 4个字符
        * \" 输出一个双引号
        * \\ 输出一个斜杠
        * */
        System.out.print("单行输出");
        System.out.println("换行输出");
        System.out.printf("输出一个负数%d",-20);
        System.out.printf("输出默认小数%f",1.2);
        System.out.printf("输出两位小数%.2f",2.2);
        System.out.printf("你好字符串输出%s","YueYang");



        /*
        *变量程序运行过程中能够改变的量。
        *基本数据类型 数值类型(整数，小数) 字符型 布尔类型。
        *引用类型：对象，数组，接口等。
        *
        * 整数类型： byte 1个字节 -128-127;  short 2个字节 -256-255 int 4个字节  long 8个字节
        * 浮点类型：float 单精度 只输出到小数点后第8位或者第7位 ;  double双精度比单精度多1倍 也就是保留到16位。
        *
        * 字符型：使用单引号 char a = 'a'; 字符0 char sig = '0'  数值0 int num = 0;
        *        字符0是非0数据， 数值0啥也不是。
        * 字符串是有多个字符组成的文本。 java中双引号只代表字符串。
        *
        * boolean 类型 值仅有true false; boolean reu = true;
        *
        * 变量命名的规范：
        *   变量名由字母数字下划线组成，数字不能做首字母
        *   在同一个作用域内变量名称不能重复定义，一个大括号代表一个作用域
        *   变量名称不能使用系统保留字段
        *
        *
        *
        *
        * */
//        System.out.println("-------------------------------------");
//        char a = 'a';
//        System.out.printf("字符型：%c 强转后:%d", a,(int)a);
//


        /*
        *
        * 键盘输入
        * Scanner是一个接受控制台输入数据的工具类
        * System.in 限定了当前对象sc用于接受控制台数据的输入。
        *
        *
        * */
//        System.out.println("-------------------------------------");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("please input an integer:");
//        int num1 = sc.nextInt(); //输入一个整数
//        System.out.println("该整数是:"+num1);
//
//        System.out.print("please input an double number:");
//        double num2 = sc.nextDouble(); //输入一个浮点数
//        System.out.println("该浮点数是:"+num2);

        // nextLine 方法返回一个字符串，这个叼东西会直接把我们的回车键也给接收到了
        //很容易就会推出程序，我们还没输入东西。 为了防止他接受到我们的回车符等，可以多加一个nextline
        // sc.nextLine()
        // String str1 = sc.nextLine();
        //这里需要注意一下 next nextLine这两个方法的区别，都是用来接受字符串的
        //nextline 这个会吸收换行符，然后会读取空格后面的内容
        // next方法这个不会接收到换行符，然后就是他遇到空格后面的东西都不读取了。
//        System.out.print("please input your name:");
//        String str1 = sc.next(); //输入一行字符串
//        System.out.println("该字符串是:"+str1);
//

        // 不属于基本数据类型，数据引用数据类型 BigDecimal
        //Math模块下的。
//        System.out.print("please input your bigDecimal number:");
//        BigDecimal bigDecimal = sc.nextBigDecimal(); //接受的是任意精度的小数，精确的
//        System.out.println("该字符串是:"+bigDecimal);
//


        System.out.println("-------------------------------------");

        /*
        * 常量 程序运行过程中不能改变的量
        * 语法： final 数据类型 变量名 = 初始值;
        * final int num = 10;
        * 常量我们只能赋值一次。
        *
        * 双目运算符：  + - * /  %取余就是相除取余数；必须有两个数参与运算
        * 单目运算符：  ++  --
        *  a++ ; a--;  这个是先执行操作在加1 ，
        *  ++a  --a  ; 这个是先加1后再执行操作
        *
        *
        * */
        final int number = 10;

        int num3 = 10;
        int num4 = 20;
        System.out.println("+ |"+(num3 + num4));
        System.out.println("- |"+(num3 - num4));
        System.out.println("* |"+(num3 * num4));
//        System.out.println("/ |"+(num3 / num4));  //结果是0
        System.out.println("/ |"+(num4/ num3));






    }

}
