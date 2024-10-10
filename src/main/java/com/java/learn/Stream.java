package com.java.learn;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

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
    static void blank(String str){
        System.out.print(str+" ");
    }
    static void outInt(int x){
        System.out.println(x);
    }
    static void Errors(){
        System.out.println("There are some errors !");
    }
    static void writeIn(String file,String contents){
        try{
            FileWriter writer = new FileWriter(file);
            writer.write(contents);
            writer.close();
            Stream.text("Success to write: " + file + " file");
        }catch (Exception e){
            Stream.Errors();
            e.printStackTrace();
        }
    }
    static String readOut(String pathName){
        File file =  new File(pathName);
        String copyF="";
        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                copyF += reader.nextLine();
            }
        }catch(Exception e){
            Stream.Errors();
            e.printStackTrace();
        }
        return copyF;
    }
    static void deleteFile(String pathName){
        File file = new File(pathName);
        if(file.delete()){
            Stream.text("Success to delete file " + pathName);
        }else{
            Stream.text("Failed to delete file " + pathName);
        }
    }
}
