import java.util.Scanner;

public class javabasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Hello World");
        // System.out.println("yo yo honey singh");
        // String input= sc.next();
        // System.out.println(input);
        // Boolean input = sc.nextBoolean();
        // System.out.println(input);
        /*
         * int a = sc.nextInt();
         * int b = sc.nextInt();
         * int sum = a + b;
         * int mul = a * b;
         * System.out.println(sum);
         * System.out.println(mul);
         */
        // float r = sc.nextFloat();
        // float area = 3.14f * r * r;
        // System.out.println(area);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println("add =" + (a+b));
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println(a + " is the gretest integer");
        } else if (b > c) {
            System.out.println(b + " is the gretest integer");
        } else {
            System.out.println(c + " is the gretest integer");
        }
    }
}
