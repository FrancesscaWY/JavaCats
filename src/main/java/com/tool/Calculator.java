package com.tool;
import java.util.Scanner;
import java.util.Arrays;
public class Calculator {
//    Method addition : return sum of two integer
    public static void addition(){
        Scanner xScanner = new Scanner(System.in);
        Scanner yScanner = new Scanner(System.in);
        Stream.blank("Please enter the first number: ");
        int x = xScanner.nextInt();
        Stream.blank("Please enter the second number: ");
        int y = yScanner.nextInt();
        Stream.text("The sum of " + x + " and "+ y +" is : " + (x+y) );
    }
//    Method overload addition:return sum of element in int array
    public static int addition(int[] array){
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum += array[i];
        }
        return sum;
    }
//    Method cWords : return the number of words in sentence.

    public static int cWords(String str){
        return str.split("\\s").length;
    }
//    Method reverseStr : return the reverse string
    public static String reverseStr(String str){
        StringBuilder reverseS = new StringBuilder(" ");
        for(int i=0;i<str.length();i++){
            reverseS.insert(0, str.charAt(i));
        }
        return reverseS.toString();
    }
//    Method s2Char : convert string to char array
    public static char[] s2Char(String str){
        return str.toCharArray();
    }
//    Method sortSA : sort the string array by alpha
    public static void sortSA(String[] str_s){
        Arrays.sort(str_s);
        Stream.text("The string list after sorting : ");
        for(String i:str_s){
            Stream.blank(i+" ");
        }
        Stream.wrap();
    }

//    Method geRandom:return a random number between 0 and x you input
    public static void geRandom(int num){
        Stream.outNum((int)(Math.random()*num));
    }
}
