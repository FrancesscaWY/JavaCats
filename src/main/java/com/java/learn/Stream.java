package com.java.learn;

public class Stream {
//    Stream Constructor
    public Stream(){};
//    Class method delimiter
    static void delimiter(){
        System.out.println("=======================DELIMITER=======================");
    }
    static void topic(String str){
        System.out.println("======================="+str.toUpperCase()+"=========================");
    }
    static void text(String text){
        System.out.println(text);
    }
    static void wrap(){
        System.out.println("\n");
    }
}
