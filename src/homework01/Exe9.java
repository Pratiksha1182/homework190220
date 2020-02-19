package homework01;

import java.util.Scanner;

public class Exe9 {
    //Main method
    public static void main(String[] args) {
        String i, result;
        Scanner s1= new Scanner(System.in);
        // Enter Upper case
        System.out.println("Please enter Text in Upper Case here");
        i=s1.nextLine();
        result=i.toLowerCase();
        // conversion of Upper case to lower case
        System.out.println("The conversion in lower case is" + result);
    }
}
