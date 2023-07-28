//package java.opps;

import java.util.*;

public class Inheritance {
    public static void main(String arg[]) {
        Phone note10 = new Phone();
        note10.setbattery("1024");
        Apple pro = new Apple();
        pro.display();
    }
}

class Phone {
    String battery;
    String display;
    String life;

    void setbattery(String battery) {
        this.battery = battery;
    }

    void display() {
        System.out.print("screentouch");
    }
}
// by using extends we can take all the propweries of other class
//now battery ,display,life all are present in iphone
class Apple extends Phone {
    String logo;

    void logo(){
        System.out.print("apple");
    }
}
