package homework01;

import java.util.Scanner;

public class Exe10 {
    //Main method
    public static void main(String[] args) {
        int num;
        Scanner s1= new Scanner(System.in);
        System.out.println("Please enter an integer");
        num= s1.nextInt();
        System.out.println("Times table of "+num+" is ");
        //Multiplication table up to 10
        for (int i= 0; i < 10; i++){
            System.out.println(num + "*"+ (i+1) + "=" + (num * (i+1)));
        }
    }
}