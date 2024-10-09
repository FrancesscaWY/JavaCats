package com.java.learn;
import java.util.Scanner;
public class Dchild extends Dlearn implements Shape{
//    Class Variable numOfChild
    static int numOfChild=0;
//    Class initializer
    static{
        System.out.print("There child are born.");
    }
//    Attributes
    String type;
//    Constructor
    public Dchild(){
        System.out.println("please enter your name: ");
        name = new Scanner(System.in).nextLine();
        System.out.println("Please enter your age: ");
        age =new Scanner(System.in).nextInt();
    };

//    Object initializer
    {
    numOfChild++;
    }
//    Method setType : set the value of type
    public void setType(String type){
        this.type=type;
    }

//    Method getType : return the value of type
    public void getType(){
            System.out.println("My type is " + type);
    }

//    Method showIdentity: return the class dSon is subclass to perform the polymorphism
    public void showIdentity(){
        System.out.println("I am the subClass.");
    }

//    The inner class Daughter and Son
    static class Daughter{
        final String sex="Female";
    }

    public class Son{
        final String sex="Male";
    }
}
