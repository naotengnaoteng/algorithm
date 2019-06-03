package com.atguigu.com.atguigu;

/**
 * @ author bigsand
 * @ date 2019-06-03 20:10
 */
public class Swop {
    public static void main(String[] args) {
        int x = 4;
        int y = 3;
        //变为x = 4,y = 3;
        int temp;
        if (x > y) {
            temp = x;
            x = y;
            y = temp;
        }

        System.out.println("x的值为 " + x);
        System.out.println("y的值为 " + y);
    }
}
