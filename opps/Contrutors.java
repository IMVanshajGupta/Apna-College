//package java.opps;

import java.lang.reflect.Constructor;

public class Contrutors {
    public static void main(String arg[]) {
        student s1 = new student("vany");// we give the name of our student
        student s3 = new student(123);
        System.out.println(s1.username);
        System.out.println(s3.rollnum);
        s1.username = "ram";
        s1.rollnum = 12;
        s1.pass = "yoyo";

        // creating a new s1 copy with new pass
        student s2 = new student(s1);
        s2.pass = "mamba";

    }
}

class student {
    String username;
    int rollnum;
    String pass;

    // this is a constructor
    student(String name) {// parametrized
        this.username = name;// made a constructor define what is take whn it is called
    }

    student(int roll) {
        this.rollnum = roll;
    }

    // copy here
    student(student s1) {
        this.username = s1.username;
        this.rollnum = s1.rollnum;
    }
}
