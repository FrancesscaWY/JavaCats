package com.java.learn;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public  class Foods {
    protected String name;
    protected HashSet<String> nameList = new HashSet<String>();
    private HashMap<String,Double> FoodPrice = new HashMap<String,Double>();
//    Constructor Foods
    Foods(){};

//    Method addFood: put more food and it's price  to the hashMap foodWeight
    public void addFood(String str,double weight){
        FoodPrice.put(str,weight);
    }

//    Method getPrice: return the price of food by "key"
    public void getPrice(String key){
        System.out.println("The "+ key + "'s price is : " +FoodPrice.get(key));
    }

//    Method removeF: remove certain item(food and price) by "key"
    public void removeF(String str){
        FoodPrice.remove(str);
    }

//    Method getSize: return the size of HashMap foodPrice
    public void getSizeFP(){
        System.out.println(FoodPrice.size());
    }

//    Method showF: show the food name by "keySet()"
    public void showF(){
        System.out.print("Food list: ");
        for(String i:FoodPrice.keySet()){
            System.out.print(i+" ");
        }
        Stream.wrap();
    }
//    Method showP: show the food price by "key"
    public void showP(){
        System.out.print("Price list: ");
        for(double i : FoodPrice.values()){
           System.out.print(i+" ");
        }
        Stream.wrap();
    }
//    Method showPF: show the food's name and price
    public void showFP(){
        for(String i:FoodPrice.keySet()){
            System.out.println("Food: " + i + "  Price: " + FoodPrice.get(i));
        }
    }
//    Method clearF: clear all items(food and price)
    public void clearFP(){
        FoodPrice.clear();
    }

//    Method addFN:add element to nameList
    public void addFN(String str){
        nameList.add(str);
    }
//    Method exitFN:return the condition if nameList contain element
    public void exitFN(String str){
        if(nameList.contains(str)){
            Stream.text("Food "+str+" is exited.");
        }else{
            Stream.text("Food "+str+" is not exited.");
        }
    }
//    Method removeFN:move element in nameList
    public void removeFN(String str){
        nameList.remove(str);
    }
//    Method getSizeFN:return the size of nameList
    public int getSizeFN(){
        return nameList.size();
    }
//    Method showFN:show all food name element in nameList
    public void  showFN(){
        Stream.text("The foods in fruits : ");
        for(String i:nameList){
            Stream.blank(i);
        }
        Stream.wrap();
    }
//    Method clearFN:clear all element in nameList
    public void clearFN(){
        nameList.clear();
    }

//    Method Iterator : create the foods object's iterator out the foods class
    public Iterator<String> setIterator(){
        return nameList.iterator();
    }

//    Method sfnIt: display nameList by Iterator
    public void sfnIt(){
        Stream.text("The food list are(by Iterator) : ");
        Iterator<String> it = nameList.iterator();
        while(it.hasNext()){
            Stream.text(it.next());
        }
    }

}
