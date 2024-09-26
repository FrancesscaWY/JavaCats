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
    }
}
