package com.java.learn;
import java.util.HashMap;

public  class Foods {
    protected String name;
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
}
