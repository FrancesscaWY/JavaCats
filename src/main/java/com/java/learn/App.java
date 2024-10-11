package com.java.learn;

import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
//        Create one Dlearn object
        People dLearn = new People();

//        Call the class member callScanner()
        People.callScanner();

//        Say hello to Maven
        System.out.println(Math.PI);

//        Create a dSon object and see its inheritance
        Dchild son =new Dchild();
        System.out.println(son.getLove());

//        use the same method in superClass and subClass to see the polymorphism.
        dLearn.showIdentity();
        son.showIdentity();

//        use the method state by interface Shape and defined by class Dchild
        son.setType("Bunny");
        son.getType();

//        use the method showFamily to print the enum member
        dLearn.showFamily();

//        use the class method to show time
        People.showTime();

/*
        First create the Family object,then operate relevant operation about the Family class,
        which main data member is  array list.
        Follow codes show the process of ArrayList learning and it's method proved by java.
        By the way enclose to understand the deep meaning of ENCLOSE and practice the class and method of ArrayLis.
 */

//        Creat a Family object
        Family family = new Family();
//        use method addParents to add element to the family object
        for(int i=20;i>10;i--){
            family.addParents(new People());
            family.addHeights(i);
        }


//        use method reverseShowH to reverse the sequence of heights and print it.
        family.showHeights();
        family.addHeights(7);
        family.reverseShowH();
        family.showHeights();
//        use method sortHeights to sort it and then use method getHeights to print the heights
        family.sortHeights();
        family.showHeights();
//        use method descendingShowH to sort the heights in descending and print it.
        family.addHeights(8);
        family.showHeights();
        family.descendingShowH();
        family.showHeights();

//        use setParent to insert element at one index and get it by getParentMethod
        People d = new People();
        family.setParent(4,d,12);
        family.getParent(4);
//        use removeParent method to remove a element of parents then use getSize method to return the change of size
        System.out.println("The Size before remove: " ); family.getSize();
        family.removeP(0);
        family.removeP(0);
        System.out.println("The size after remove: "); family.getSize();
//        use the method clearP and see the size of parents by method getSize
        family.clearP();
        System.out.println("The size after clear: "); family.getSize();

/*
*       Follows are the use of class HawthornSkewer which main attribute is a LinkedList similar to ArrayList
*       but in many methods are more efficient such as addFirst, removeFirst and so on.   */

//        create one object hs
        HawthornSkewer hs = new HawthornSkewer();

//        use method addH,showH,add two element to it and print them
        hs.addH("One");
        hs.addH("Two");
        hs.addH("Three");
        hs.showH();

//        use method setH and getH return the element at one index
        hs.setH(2,"Four");
        hs.getH(2);

//        use method removeH and showH to see the change of object hs.
        hs.removeH(0);
        hs.showH();

//        use method addFirst,removeFirst,getFirst,addLast,removeLast,getLast,which are more efficient methods
//        than it's in ArrayList
        hs.addFirstH("Five");
        hs.removeLastH();
        System.out.println("The last element after use removeLastH is : " + hs.getLastH());
        hs.showH();

        hs.addLastH("Six");
        hs.removeFirstH();
        System.out.println("The first element after use removeFirstH is : "+ hs.getFirstH());
        hs.showH();

//        use method clearH, getSize to see the change of length before and after "clear".
        System.out.println("The size before clear: "+hs.getSize());
        hs.clearH();
        System.out.println("The size after clear: "+hs.getSize());

        Stream.delimiter();


/*        Follows codes are the learning process of HashMap, which I mature the class Foods by the use of HashMap.
 *        In detailed, I define one attribute FoodPrice which "key" is food name and "value" is food price.
 *        There also are method operate the data member,so then are the use and operation of "FoodPrice."          */

        Stream.topic("hashmap");
//        create a food object
        Foods fruits = new Foods();
//        use method addFood to add some "fruit with price" to the fruits
        fruits.addFood("waterWomen",11.13);
        fruits.addFood("grape",5.66);
        fruits.addFood("banana",9.89);
        fruits.addFood("apple",3.55);
//       use method getPrice to return price by one "key"
        fruits.getPrice("banana");

        Stream.delimiter();

//       use method removeP to remove one element by "key",and use method showFP to show the element before and after "remove"
        Stream.text("The fruits before remove: ");
        fruits.showFP();
        fruits.removeF("grape");
        Stream.text("The fruits after remove: ");
        fruits.showFP();

        Stream.delimiter();

//        use method showF and showP only print the "key" and "value"
        Stream.text("The fruits' name: ");
        fruits.showF();
        Stream.text("The fruits' price: ");
        fruits.showP();

        Stream.delimiter();
//        use method clearFP to clear the elements in fruits and call the method getSizeFP to show change before and after
//        remove
        Stream.text("The size before clear: ");
        fruits.getSizeFP();
        fruits.clearFP();
        Stream.text("The size after clear: ");
        fruits.getSizeFP();

        Stream.delimiter();

        Stream.topic("HashSet");
/*        Follows codes are the learning process of HashSet ,through addition the class Food with the attribute "nameList".
          NameList is implemented by class HashSet and through the HashSet define some operations about nameList.
*         Follows are the use the method defined through HashSet.   */

//        use method addFN to add elements to fruits object
        fruits.addFN("apple");
        fruits.addFN("banana");
        fruits.addFN("cherry");
        fruits.addFN("strawberry");
        fruits.addFN("waterWomen");
        fruits.addFN("banana");
//        use method showFN to see that even if there are two "banana" , but just display one "banana", because
//        in HashSet , every element is unique
        Stream.text("After add two \"banana\" and display: ");
        fruits.showFN();

//        use exit method to return if the food exits in fruits
        fruits.exitFN("cherry");
        fruits.exitFN("grape");

        Stream.delimiter();

//        use showFN method to display the foods in fruits object
        fruits.showFN();

//        use removeFN method to remove some food in fruits
        fruits.removeFN("apple");
        fruits.showFN();

        Stream.delimiter();

//        use clearFN method to clear the foods then show the size change by method getSizeFN
        Stream.text("The size of foods before clearFN: "+fruits.getSizeFN());
        fruits.clearFN();
        Stream.text("The size of foods after clearFN: "+fruits.getSizeFN());

        Stream.delimiter();

/*        Follows are the learning process of Iterator , because the design of Iterator is to access the elements out it's
 *        class ,so we create Iterator object in App class without enclose it in the class, then we will use the Iterator
 *        object complete the loop and remove operation about Heights and fruits*/
        Stream.topic("Iterator");
//        create the vegetable object of class foods
        Foods vegetable = new Foods();
        vegetable.addFN("tomato");
        vegetable.addFN("potato");
        vegetable.addFN("carrot");

//        create an iterator to vegetables object
        Iterator<String> it = vegetable.setIterator();
//        use method next in Iterator object to display one food name out the class Foods.
        Stream.text("Display by iterator out the class Foods: ");
        Stream.text(it.next());

        Stream.delimiter();

//        use method sfnIt to in class Foods to display elements in vegetable.
        vegetable.sfnIt();

        Stream.delimiter();

//        create a family object f2
        Family f2 = new Family();
//        add heights to f2 by loop
        for(int i=4;i<20;i++){
            f2.addHeights(i);
        }
//        use method removeLess to loop remove heights less than one value which is defined by remove
        Stream.text("The heights list before loop remove: ");
        f2.showHeights();
        f2.removeLess(14);
        Stream.text("The heights list after loop remove: ");
        f2.showHeights();

/*        Point class */
        Stream.topic("Point_initializer");

//        use the three different constructors to create three objects of Point
//        and the object initializer will be called three times before object created.
        Stream.text("Follows show three times object initializer is called :");
        Point p1 = new Point();
        Point p2 = new Point(2);
        Point p3 = new Point(3,4);

//        use class method getNumOfPoints to show the counts of points
//        outInt method in class Stream to print int type data to screen
//        use toString method in wrapper class(Integer,Double,String,Boolean...) convert itself to String datatype
       Stream.text("The number of points (int/String) :");
       Stream.outInt(Point.getNumOfPoint());
       Stream.text(Point.getNumOfPoint().toString());

       Stream.delimiter();

/*       use try catch to define exception by self.*/
        Stream.topic("exception");
        try{
            int[] array={1,2,3};
            String[] words= {"hi","I","you"};
//            If the print of array[0] after words[3],the array[0] will not be print because of exception.
            Stream.outInt(array[0]);
            Stream.text(words[3]);
        } catch (Exception e){
            Stream.text("There is a exception with memory leaked.");
        }

        Stream.delimiter();

        Stream.topic("File&Search");

//        use SearchText constructor to create a SearchText object with a file name
        Stream.text("Create the file : " );
        SearchText file = new SearchText("/home/francessca/JavaProjects/File/Learn/javaCat/src/main/TXT/demo6.txt");

//        use readOut method in class Stream to read the existed file's contents and store it in an String variable
        String strings = Stream.readOut("/home/francessca/JavaProjects/File/Learn/javaCat/src/main/TXT/test_1.txt");

//        use writeIn method to write the strings(read from existed file) to the file
        Stream.text("Write to the file :" + file.fileName());
        file.writeT(strings);


//        use method readT and Stream.text to return and print the content of file
        Stream.delimiter();
        Stream.text("After writing, the contents in file :");
        Stream.text(file.readeT());
        Stream.delimiter();

        Stream.text("Find Operation in file : " + file.fileName());

//        use finOrdinary method to find if there are certain words(without spacial characters) in file
        file.findOrdinary("life");

//        use fileSpecular method to find id there are certain words (with spacial characters) in file
        Stream.text("use findOrdinary to find \" level.\" : ");
        file.findOrdinary("level.");
        Stream.text("use findSpecular to find \" level.\" : ");
        file.findSpecular("level.");

//        use deleteFile method(in Stream class) to delete the file contents in SearchText object
        Stream.deleteFile("demo4.txt");
        Stream.deleteFile("/home/francessca/JavaProjects/File/Learn/javaCat/src/main/TXT/demo5.txt");

//        use method deleteT in class SearchText to delete Search object
        file.deleteT();

        Stream.delimiter();
        /*This part is practice of Thread, Kitchen class used to emulate different cooking with same time.
        * Follows are test for the class by method run and start.
        * What we need understand is because the thread are executing same time,so the sequence of them is unsure
        * until they complete execution*/
        Stream.topic("Thread");

//        Create two Kitchen object by constructor function
        String[] foods1={"tomato","eggs","scallion"},foods2={"potato","chili","garlic","oil"};
        Kitchen dish1 = new Kitchen(foods1);
        Kitchen dish2 = new Kitchen(foods2);

        dish1.start();
        dish2.start();
        Stream.text("This thread is in APP class");

        Stream.delimiter();

        /*Follows are test for method lambdaType which completed by using of lambda expression and interface Shape with
        * only one method.*/
        Stream.topic("Lambda");
//        use method lambdaType to test execution of lambda expression.
        dish1.lambdaType();
        dish2.lambdaType();

        Stream.delimiter();

        /*Follows is sort operation to object People which is different from sort to number or alpha.
        * These are implement by Comparator(same logic) and Comparable */
        Stream.topic("Advance_sort");

        Stream.text("Sort people by Comparator achieved by lambda expression.");
//        Create a sorterAP object to store and add people object.
        sortAgeP sorter = new sortAgeP();
        sorter.addP("i",23);
        sorter.addP("r",12);
        sorter.addP("d",2);
        sorter.addP("s",24);

//        use method adSort complete by Comparator same logic to sort people list
        Stream.text("Before and after sorting people list:");
        sorter.showSeN();
        sorter.adSort();
        sorter.showSeN();

        Stream.text("Sort people by Comparable achieved by compareTo method in class People.");

//        creat sortAgeP object to store and add people object.
        sortAgeP sorter2 = new sortAgeP();
        sorter2.addP("w",13);
        sorter2.addP("x",22);
        sorter2.addP("c",12);
        sorter2.addP("v",6);

//        use method sortByO complete by Comparable to sort people object list.
        Stream.text("Before and after sorting people list: ");
        sorter2.showSeN();
        sorter2.sortByO();
        sorter2.showSeN();



    }
}
