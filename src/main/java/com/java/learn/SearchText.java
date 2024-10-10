package com.java.learn;
import java.io.File;
import java.io.FileWriter;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class SearchText {

    private  File text;

//    SearchText constructor : create a new File.
    public SearchText(String pathName){
        try{
        text = new File(pathName);
            if (text.createNewFile()){
                Stream.text("File is created : " + text.getName());
            }else{
                Stream.text("File is exited.");
            }
        } catch (Exception e){
            Stream.Errors();
            e.printStackTrace();
        }
    }

//    Method writeIn : Wrote to the file.
    public void writeT(String words){
       Stream.writeIn(text.getName(),words);
    }

//    Method readT:readeT the contents in certain file and return the content with String type
    public String readeT(){
        return Stream.readOut(text.getName());
    }
//    Method find : find ordinary words in the file,return the massage whether the words exist.
    public void findOrdinary(String goal){
        Pattern pattern = Pattern.compile(goal,Pattern.CASE_INSENSITIVE);
        String copyF=Stream.readOut(text.getName());
        Matcher matcher = pattern.matcher(copyF);
        if(matcher.find()){
            Stream.text("\" "+goal+" \" is found in the " + text.getName() + " file." );
        }else{
            Stream.text("\" "+goal+"\" is not  found in the " + text.getName() + " file.");
        }
    }

//    Method findSpecular : find the aim with spacial character such as " ., /, *, ?" but without the spacial meaning
    public void findSpecular(String aim){
        Pattern pattern = Pattern.compile(aim,Pattern.LITERAL);
        String copyF=Stream.readOut(text.getName());
        Matcher matcher =  pattern.matcher(copyF);
        if(matcher.find()){
           Stream.text("\" " + aim +"\" is found in " + text.getName() + " file." );
        }else{
            Stream.text("\"" + aim +"\" is not found in " + text.getName() + " file.");
        }
    }

//    Method deleteFile : delete the searchText object while use this method.
    public void deleteT(){
        Stream.deleteFile(text.getName());
    }

//    Method fileName : return the name of text file
    public String fileName(){
        return text.getName();
    }
}
