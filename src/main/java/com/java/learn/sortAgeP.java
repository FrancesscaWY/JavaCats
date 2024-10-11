package com.java.learn;

import java.util.Comparator;// use the lambda expression also get the work of Comparator,because their key logic are same.
import java.util.ArrayList;
import java.util.Collections;

public class sortAgeP{

//    pList: a list to store people
    private ArrayList<People> pList = new ArrayList<People>();

//    Method addP:add People object element to the list.
    public void addP(String n,int a){
        pList.add(new People(n,a));
    }

//    Method adSort: use a lambda expression to complete a comparator which could define the sort value by self.
    public void adSort(){
        Collections.sort(pList,(obj1,obj2)->{
            People p1 = (People) obj1;
            People p2 = (People) obj2;
            return p1.age-p2.age;
        });
    }

//    Method shoeSeN: show the people object in list by sequence.
    public void showSeN(){
        for(People p : pList){
            Stream.blank("name: "+p.name+" age: "+ p.age +"; ");
        }
        Stream.placeH();
    }

//    Method showSeNbyO: sort people by age through defined in class people compare self to others.
    public void sortByO(){
        Collections.sort(pList);
    }
}