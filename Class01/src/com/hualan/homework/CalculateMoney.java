package com.hualan.homework;

import java.util.Scanner;

public class CalculateMoney {

    public static void main(String[] args) {

/*
        在上面的模块里,在com.hualan包里创建一个CalculateMoney类，在类的main方法里编写代码,实
        现如下功能:
        (1)提示用户输入一个1000以内的金额(例如:892).
        (2)计算这个金额由多少个100元，多少个50元，多少个20元，多少个10元，多少个5元，多少个2元，多
        少个1元构成.
        (3)在控制台输出100元的个数，50元的个数，20元的个数，10元的个数，5元的个数，2元的个数，1元购买
        的个数.
                例如：892元是由8个100元，1个50元，2个20元，0个10元，0个5元，1个2元，0个1元构
        成。
*/

        //提示
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter a number between 1 and 1000:");
        int number = sc.nextInt();
        //获取百位数
        int hundred = number / 100;
        System.out.printf("该数100元的个数:%d",hundred);
        System.out.println();
        //获取50元个数
        int remain = number - (hundred * 100);
        int fifty = remain / 50;
        System.out.printf("该数50元的个数:%d\n",fifty);
        // 十元的个数
        remain = remain - (fifty * 50);
        int ten = remain / 10;
        System.out.println("该数10元的个数:"+ten);
        //5元的个数
        remain = remain - (ten * 10);
        int five = remain / 5;
        System.out.println("该数5元的个数:"+five);
        //2元的个数
        remain = remain - (five * 5);
        int two = remain / 2;
        System.out.println("该数2元的个数:"+two);

        //一元的个数
        remain = remain - (two * 2);
        System.out.println("该数1元的个数:"+remain);






    }
}
