package cwiczenia;

import java.util.Random;

class MyClass {
    int field1;
    int field2;
    int random;

    MyClass(int val1, int val2){
        field1=val1;
        field2=val2;
        random=randomize();
    }

    static int randomize(){
        return (new Random().nextInt(10));
    }
}

public class ObjectExcersise {
    public static void main(String[] args) {
    MyClass object = new MyClass(1,2);
        System.out.println(object.field2);
        System.out.println(object.random);
    }
}
