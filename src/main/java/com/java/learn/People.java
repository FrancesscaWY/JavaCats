package com.java.learn;
import com.tool.Stream;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class People implements Comparable{
//    Attributes
    protected final String Love ="I Love China.";
    private enum Family{Father,Mother}
    protected String name;
    protected int age;
    static protected String Time = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss").format(LocalDateTime.now());
//    Constructor without parameter
    public People() {
    }

//    Constructor with parameter
    public People(String n,int a){
        name = n;
        age = a;
    }

//    Method showTime: return the format local time(class member) now
    static void showTime(){System.out.println("Now time is :" + Time);}

//    Method showFamily: print the enum type data member Parents
    public void showFamily(){
        for(Family f: Family.values()){
            System.out.println(f);
        }
    }

//    Method showIdentity: return the class Dlearn is superclass to perform the polymorphism
    public void showIdentity(){
        System.out.println("I am the superClass.");
    }

//    Method getLove:return the string Love
    public String getLove(){
        return Love;
    }

//    Method callScanner : call other package's class's method
     static void callScanner() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name2 =scan.nextLine();
        System.out.println("The name is " + name2);
    }

//    Method compareTo:compare this people with  other people by age
    public int compareTo(Object other){
        People otherP = (People) other;
        return this.age-otherP.age;
    }

//    Method loopFamily : loop through and print the enum family
    public void loopFamily(){
        for(Family i: Family.values()){
            Stream.blank(i);
        }
    }

}
