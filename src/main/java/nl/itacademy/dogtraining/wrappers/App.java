package nl.itacademy.dogtraining.wrappers;

public class App {

    public static void main(String[] args) {

        // boxing => 2004
        int a = 3;

        Integer iObject = new Integer(a);

        foo(iObject);

        // unboxing => 2004
        Integer iObjectOther = getNext(4);

        int result = iObjectOther.intValue()+1;

        // autoboxing // 2005 => Java 5

        Integer otherObject = 3;

        int next = getNext(15);

        System.out.println(next);

        Integer nogEen = new Integer(3)+2;

        // dat was wrapping

        // nu de utils

        System.out.println(Integer.MAX_VALUE);

        System.out.println(Integer.max(3,4));

        System.out.println(Integer.toBinaryString(173));

        System.out.println(Integer.toHexString(173));

        System.out.println(Integer.reverse(173));

        System.out.println(new StringBuilder(""+173).reverse());

        Boolean b = new Boolean("TruE");

        boolean b2 = Boolean.valueOf("True");

        System.out.println(b);

    }

    public static void foo(Integer iObject) {

        System.out.println(iObject);

    }

    public static Integer getNext(int n) {
        int result = n+1;

        return new Integer(result);
    }


}
