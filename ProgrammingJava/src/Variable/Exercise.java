package Variable;

import java.util.Scanner;

public class Exercise {

    //1. Program to find ASCII code of a character
    public static void main(String[] args) {
        char ch = 'P';
        int asciiCode = ch;
        int asciiValue = (int) ch;

        System.out.println("The Ascii value of " + ch + " is: " + asciiCode);
        System.out.println("The Ascii value of " + ch + " is: " + asciiValue);

        //2.  Program to multiply two numbers
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        double m = sc.nextDouble();

        System.out.print("Enter the Second Number: ");
        double n = sc.nextDouble();

        double num = m*n;
        System.out.println("The product of the two numbers is: " + num);


    }
}
