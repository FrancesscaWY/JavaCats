package com.java.learn;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.Scanner;


/**
 * Unit test for simple App.
 */
public class AppTest {
    static public void main(String[] args){
        double d = 1.23;
        int a = (int) d;
        System.out.println(d);
        System.out.println(a);
        for(int i=0;i<10;i++){
            System.out.printf("%-2d",i); // -2:空格
        }
        System.out.println();
        StringBuilder s = new StringBuilder("Hi,");
        change(s);
        System.out.println(s);
        formalOp();
        formalIp();
    }
    public static void change(StringBuilder s){
        s.append(" Java !");
    } // 引用类型的值传递
    public static void formalOp(){
        System.out.printf("输出布尔类型 %b\n",true);
        System.out.printf("输出字符串: %s\n",1234);
        System.out.printf("输出字符: %c\n",'V');
        System.out.printf("按十进制输出: %d\n",123);
        System.out.printf("按八进制输出: %o\n",123);
        System.out.printf("按十六进制输出: %X\n",123);
        System.out.printf("按科学计算法输出: %e\n",123.123);
    }
    public static void formalIp(){
        Scanner input = new Scanner(System.in);
        System.out.println("输入名字: ");
        String name = input.next();
        System.out.println("输入年龄: ");
        int age =input.nextInt();
        System.out.printf("你好,%s(年龄: %d)\n",name,age);
    }
}
