//package java.opps;

public class Abstract {

}

abstract class Animal {
    void eat() {
        System.out.print("eat anything ");
    }

    abstract void walk();

    /*
     * no need to show what it can does
     * whn we made a abstract only we show the idea
     * there is no need to show the implementation of it!
     * but whn we extends (to sub class) in that there is need to
     * define the abstracted method(fuction)
     */
}

class Dog extends Animal {
    void walk() {
        System.out.print("walks on four legs");
    }
    /* here we defines our abstracted function of animal class wich is walk */
}