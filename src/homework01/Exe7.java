package homework01;

import java.util.Scanner;

public class Exe7 {

    public void calcFahrenToDegree(double i){
        double result;
        result = (i-32)*5/9;
        System.out.println("The Celsius value is "+ result);
    }
    //Main method
    public static void main(String[] args) {
        double a;
        Scanner s1= new Scanner(System.in);
        System.out.println("Fahrenheit Temprature Ranging between -60 to 120F");
        System.out.println("Place fahrenheit value here");
        a= s1.nextDouble();
        Exe7 obj = new Exe7();
        obj.calcFahrenToDegree(a);

    }
}
