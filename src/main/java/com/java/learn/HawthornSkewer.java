package com.java.learn;
import java.util.LinkedList;
public class HawthornSkewer extends Foods{

    private LinkedList<String> HS = new LinkedList<String>();

    public HawthornSkewer(){
        name="HawthornSkewer";
    }

    public void addH(String str){
        HS.add(str);
    }

    public void setH(int index,String str){
        HS.set(index,str);
    }

    public void getH(int index){
        System.out.println(HS.get(index));
    }

    public void removeH(int index){
        HS.remove(index);
    }

    public void showH(){
        for(String str:HS){
            System.out.print(str+" ");
        }
        System.out.println("\n");
    }

    public void clearH(){
        HS.clear();
    }

    public int getSize(){
        return HS.size();
    }

    public void addFirstH(String str){
        HS.addFirst(str);
    }

    public void addLastH(String str){
        HS.addLast(str);
    }

    public void removeFirstH(){
        HS.removeFirst();
    }

    public void removeLastH(){
        HS.removeLast();
    }

    public String getFirstH(){return HS.getFirst();}

    public String getLastH(){return HS.getLast();}
}
