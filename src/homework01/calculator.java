package homework01;

import java.util.Scanner;

public class calculator {
    //2 instance methods
    // Addition
    public void addInst(int a, int b){
        int result;
        result = a+b;
        System.out.println("addition of p and q is "+ result);
    }
    //Subtraction
    public void subInst(int a, int b){
        int result;
        result = a-b;
        System.out.println("subtraction of p and q is "+result);
    }
    //2 Static method,
    // Multiplication
    public static void multiStat(int a, int b){
        int result;
        result = a*b;
        System.out.println("multiplication of p and q is"+result);
    }
    //Division
    public static void divStat(int a, int b){
        int result = a/b;
        System.out.println("division of p and q is "+result);
    }

    public static void main(String[] args) {
        int p,q;
        Scanner p1 = new Scanner(System.in);
        System.out.println("please enter first integer No. p");
        p=p1.nextInt();
        System.out.println("please enter second integer No. q");
        q=p1.nextInt();
        System.out.println(p);
        System.out.println(q);
        calculator obj= new calculator();
        obj.addInst(p, q);
        obj.subInst(p,q);
        multiStat(p,q);
        divStat(p,q);

    }
}
