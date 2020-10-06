package com.sparta.astha;

public class StringPool {

    public void methodStringPool(){

        System.out.println("------String Pool Start-------");
        //== for checking object references, .equals-in string-checks the content
        String object1="Hi";//String Literal stored in string pool on heap. Share storage if two string literals have same content. Literals are created at compile time
        String object2="Hi";
        System.out.println("Object 1 and Object 2::"+(object1==object2));//true

        //Object object10;

        String object5=new String("Hi");//String Object-live on heap but outside of String pool. Do not share storage if two string object content are same
        String object7=new String("Hi");
        System.out.println("Object 5 and Object 7::"+(object5==object7));//false

        object5=object5.intern();// The object 5 now becomes a part of the string pool. The old object object 5 will be garbage collected from the heap.
        System.out.println("After interning::"+(object2==object5));//true

        String object3=" Hi".trim();
        System.out.println(object1==object3);

        String object10=" Hi".trim().intern();
        System.out.println(object1==object10);

        String object4="H" + "i";
        //String object4="H".concat("i");
        System.out.println("Object 1 and Object4::"+(object1==object4));

        String string3=new String("pool");
        string3=new String("1234");
        System.out.println("string3 "+string3);

        // the pool is still there and waiting for garbage collection just the reference string1 now is pointing to 1234

        System.out.println("------String Pool End-------");

    }
}
