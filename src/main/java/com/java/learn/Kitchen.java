package com.java.learn;


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
}
