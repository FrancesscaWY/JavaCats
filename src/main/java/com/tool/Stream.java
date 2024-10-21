package com.tool;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class Stream {
//    Stream Constructor
    public Stream(){};
//    Class method delimiter
    public static void delimiter(){
        System.out.println("=======================DELIMITER=======================");
    }
    public static void topic(String str){
        System.out.println("======================="+str.toUpperCase()+"=========================");
    }
    public static void text(String text){
        System.out.println(text);
    }
    public static void text(boolean b){
        System.out.println(b);
    }
    public static void wrap(){
        System.out.println("\n");
    }
    public static void blank(String str){
        System.out.print(str+" ");
    }
    public static void outNum(int x){
        System.out.println(x);
    }
    public static void outChar(char c){
        System.out.println(c);
    }
    public static void blank(Enum i){
        System.out.println(i);
    }
    public static void Errors(){
        System.out.println("There are some errors !");
    }
    public static void placeH(){
        System.out.println(" ");
    }
    public static void writeIn(String file, String contents){
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
    public static String readOut(String pathName){
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
    public static void deleteFile(String pathName){
        File file = new File(pathName);
        if(file.delete()){
            Stream.text("Success to delete file " + pathName);
        }else{
            Stream.text("Failed to delete file " + pathName);
        }
    }
}
