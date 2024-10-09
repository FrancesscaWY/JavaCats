package com.java.learn;

public class Point {
    private Integer x,y;


//    Object initializer : be executed before created an object
    {
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

}
