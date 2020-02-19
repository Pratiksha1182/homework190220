package homework01;

import java.util.Scanner;

public class Exe19 {
    // Upper case to lower case
    public static void main(String[] args) {
        String i, result;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Please enter Text in Upper Case here");
        i = s1.nextLine();
        result = i.toLowerCase();
        System.out.println("The conversion in lower case is" + result);
    }
}