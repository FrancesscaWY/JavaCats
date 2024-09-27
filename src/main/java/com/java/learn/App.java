package com.java.learn;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
//        Create one Dlearn object
        Dlearn dLearn = new Dlearn();

//        Call the class member callScanner()
        Dlearn.callScanner();

//        Say hello to Maven
        System.out.println(Math.PI);

//        Create a dSon object and see its inheritance
        Dchild son =new Dchild();
        System.out.println(son.getLove());

//        use the same method in superClass and subClass to see the polymorphism.
        dLearn.showIdentity();
        son.showIdentity();

//        use the method state by interface Shape and defined by class Dchild
        son.                setType("Bunny");
        son.getType();

//        use the method showFamily to print the enum member
        dLearn.showFamily();

//        use the class method to show time
        Dlearn.showTime();

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
            family.addParents(new Dlearn());
            family.addHeights(i);
        }
//        use method sortHeights to sort it and then use method getHeights to print the heights
        family.sortHeights();
        family.showHeights();
//        use setParent to insert element at one index and get it by getParentMethod
        Dlearn d = new Dlearn();
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


    }
}
