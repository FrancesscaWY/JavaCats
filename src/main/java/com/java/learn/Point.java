package com.java.learn;

public class Point {

//    member variables have default value(0.00,null,nullptr) even though we don't initialize them.

//    member variables with "static" are class member variables to store information of class.
//    Integer is a wrapper class and numOfPoint is an Integer object
//    if we don't initialize it, the value of numOfPoint will be "NULL".
    static Integer numOfPoint=0;

//    member variables without "static" are object member variables to store information of one specific object.
    private Integer x;
    private Integer y;

//    Class initializer : be executed before the class loaded
    static{
        Stream.text("The Point class begin loading.");
    }

//    Object initializer : be executed before created an object
    {
        numOfPoint++;
        Stream.text("The object is created.");
    }

//    The sample constructor's implement will reuse the complexer constructor.
    public Point(){};
    public Point(int x){
//      There couldn't code,because the object doesn't be created now.
//      Follow codes will call the complexer constructor Point(int x, int y);
        this(x,1);
    }
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    static Integer getNumOfPoint(){
        return numOfPoint;
    }

}
