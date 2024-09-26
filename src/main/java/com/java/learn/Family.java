package com.java.learn;
import java.util.ArrayList;
import java.util.Collections;

public class Family {
//    List attribute
    protected ArrayList<Dlearn> parents = new ArrayList<>();
    protected ArrayList<Integer> heights = new ArrayList<>();
//    Method setParents:add element to parents list
    public void addParents(Dlearn deLearn){
        parents.add(deLearn);
    }
//    Method addParents: show element value of parents list
//    This method is no senses because the deLearn is dynamic variable and they don't have the identifier
    public void getParents(){
        for(Dlearn deLearn : parents){

            System.out.print(deLearn);
        }
    }
//    Method addHeights:add element to heights list
    public void addHeights(int height){
        heights.add(height);
    }
//    Method sortHeights:return the heights list sorted
    public ArrayList<Integer> sortHeights(){
        Collections.sort(heights);
        return heights;
    }
//    Method showHeights: show element value of heights list
    public void showHeights(){
        for(Integer height:heights){
            System.out.print(height+" ");
        }
    }
//    Method getSize:print the size of parents and heights
    public void getSize(){
        System.out.println("The parents list's size is: "+parents.size());
        System.out.println("The heights list's size is: "+heights.size());
    }
//    Method removeP:remove element in parents and height list by index
    public void removeP(int index){
        parents.remove(index);
        heights.remove(index);
    }
//    Method clearP:clear all elements in parents and heights
    public void clearP(){
        parents.clear();
        heights.clear();
    }
//    Method setParents:insert one element to parent and height list by index
    public void setParent(int index,Dlearn dlearn,int height){
        parents.set(index,dlearn);
        heights.set(index,height);
    }
//    Method getParent:return the element of parents at index
    public void getParent(int index){
        System.out.println("This place is "+parents.get(index)+" and the height is "+heights.get(index));
    }



}