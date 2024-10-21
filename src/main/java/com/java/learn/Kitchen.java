package com.java.learn;


import com.tool.Stream;

public class Kitchen extends Foods implements Runnable{

//    Constructor Kitchen: store food in Kitchen
    public Kitchen(String[] foods){
        for(String i: foods){
            addFN(i);
        }
    }
//    Override method showFN:return the nameList of Kitchen
    public void showFN(){
        for(String i: nameList){
            Stream.blank(i);
        }
    }

//    Implement method run : create a thread kitchen
    public void run(){
        Stream.text("Follow foods: ");
        showFN();
        Stream.text("is cooking!");
    }
//    Method start: use the start method of thread to complete start method in class Kitchen
    public void start(){
        Thread thread = new Thread(this);
        thread.start();
        Stream.text("This code is running out a thread");
    }

//    Method lambdaType : store lambda expression in interface Shape with only one method,which has same parameters and
//    return type then use this method to show the value of lambda expression
    public void lambdaType() {
        Shape cType = () -> {
            Stream.text("My type is a kitchen,can do different cooking same time. ");
        };
        cType.getType();
    }
}
