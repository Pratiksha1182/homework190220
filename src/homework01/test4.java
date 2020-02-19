package homework01;

import org.w3c.dom.ls.LSOutput;

public class test4 {
    // Declaration of 2 instance variable
    int p = 20;
    int r = 10;
    // Declaration of 2 static variable
    static int d = 30;
    static int e = 40;
    // Declaration of instance method with 4 variables
    public void addition(){
        System.out.println("addition of p and r=" +(p+r));
        System.out.println("addition of p and r=" +(d+e));
    }
    // Declaration of Static method  with 4 variables
    public static void substraction(){
        test4 obj= new test4();
        System.out.println("substraction of p and r=" +(obj.p-obj.r));
        System.out.println("substraction of d and e=" +(d-e));
    }

// Declaration of main method
    public static void main(String[] args) {
        test4 obj= new test4();
        // Declaration of 2 methods in main method
        obj.addition();
        substraction();


    }
}
