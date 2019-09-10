package nl.itacademy.ocp.generics.demopage113ocpbook;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {

    public static void main(String[] args) {
        getE(3.5);
    }

    // what you cant do
    //1. Call the constructor of T. new T() is impossible since you would create a new Object (since page 112/112)
    public void demoNewFails() {
        T t;
//        t = new T();// fails // correct since we now know why!
    }


    //2. Create an array of that static type (be aware ENORMOUS typo. should be
    //2. Create an array of that GENERIC type!!!
    // Impossible since we would be creating an Object array again type erasure of page 112/113
    public void demoCreateAnArrayFails() {

        // ok
        int[] numbers = new int[3]; //ok
//        T[] arrayOfT = new T[3]; // fails and we now know why
    }

    //3. Call instanceof
    public void demoInstanceofShouldFails() {
        T t = null;
        T t2 = null;

//        if(t instanceof  T) { // fails which is expected

//        }

        // same for a List
        List<String> names = null;
        List<Integer> numbers = null;

//        if(names instanceof List<String>) { // fails and what is expected

//        }
    }

    //4. You cannot (more oca than ocp related) use primitive type.
    public void demoUnableToUseAPrimitiveTypeAsAGenericTypeParameter() {
        // ok
        List<Integer> wrapperNumbers = new ArrayList<>();

        // fails which is expected
//        List<int> primitiveNumbers = new ArrayList<int>();
    }

    //5. Create a static variable as a generic type parameter (should be impossible)
    // test the normal expeced ok behaviour
    private List<T> content = new ArrayList<>(); // ok. so the generics works on my machine.

    // fails
//    private static List<T> staticContents;

    // fails
//    private static T t;

    //!!! Normally we place static vars and fields in the top of the file. for the explaination we folllow
    // the table on page 113 of the book and since this is item 5 it is here below ...

    // generic static method
    public static <E extends Number> void  getE(E e) {
        System.out.println("I am running a static generic method");

        System.out.println(e.getClass());
    }
}
