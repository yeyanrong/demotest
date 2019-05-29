package com.example.demo.test;

import java.util.Scanner;

/**
 *  Question 2
 */
public class test2 {
    public static void numToLetter(String number) {
        for (byte b : number.getBytes()) {
            System.out.print("转换的字母为：" + (char) (b + 49));
        }
    }
    public static void main(String[] args) {
        System.out.print("输入0—99之间的任意数：");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number >= 0 && number <= 99){
            numToLetter(String.valueOf(number));
        }else {
            System.out.print("非法输入，请重新输入！！");
        }
    }

}
