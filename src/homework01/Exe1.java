package homework01;

public class Exe1{
    // 2 instance variable declaration
    int a=10;
    int b=5;
    // instance method declaration
    public void addition(){
        System.out.print("addition of a and b =" +(a+b));

    }
    // main method declaration

    public static void main(String[] args) {
        // object creation for calling instance method in main
        Exe1 obj = new Exe1();
        // using object to call method addition
        obj.addition();

    }
}
